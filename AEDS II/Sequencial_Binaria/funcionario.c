#include <string.h>
#include <stdlib.h>
#include <stdarg.h>
#include "funcionario.h"

// Imprime funcionario
void imprime(TFunc *func) {
    printf("\n**********************************************");
    printf("\nFuncionario de codigo: ");
    printf("%d", func->cod);
    printf("\nNome: ");
    printf("%s", func->nome);
    printf("\nCPF: ");
    printf("%s", func->cpf);
    printf("\nData de Nascimento: ");
    printf("%s", func->data_nascimento);
    printf("\nSalario: ");
    printf("%.2f", func->salario);
    printf("\n**********************************************");
}

// Cria funcionario. Lembrar de usar free(func)
TFunc *funcionario(int cod, char *nome, char *cpf, char *data_nascimento, double salario) {
    TFunc *func = (TFunc *) malloc(sizeof(TFunc));
    //inicializa espaço de memória com ZEROS
    if (func) memset(func, 0, sizeof(TFunc));
    //copia valores para os campos de func
    func->cod = cod;
    strcpy(func->nome, nome);
    strcpy(func->cpf, cpf);
    strcpy(func->data_nascimento, data_nascimento);
    func->salario = salario;
    return func;
}

// Salva funcionario no arquivo out, na posicao atual do cursor
void salva(TFunc *func, FILE *out) {
    fwrite(&func->cod, sizeof(int), 1, out);
    //func->nome ao invés de &func->nome, pois string já é ponteiro
    fwrite(func->nome, 1, sizeof(func->nome), out);
    fwrite(func->cpf, 1, sizeof(func->cpf), out);
    fwrite(func->data_nascimento, 1, sizeof(func->data_nascimento), out);
    fwrite(&func->salario, sizeof(double), 1, out);
}

// Salva funcionario no arquivo out, na posicao atual do cursor
void salvaTXT(TFunc *func, FILE *out) {

    fprintf(out, "%s", "Codigo: ");
    fprintf(out, "%d", func->cod);
    fprintf(out, "%s", "    Nome: ");
    fprintf(out, "%s", func->nome);
    fprintf(out, "%s", "    CPF: ");
    fprintf(out, "%s", func->cpf);
    fprintf(out, "%s", "    Data: ");
    fprintf(out, "%s", func->data_nascimento);
    fprintf(out, "%s", "    Salario: ");
    fprintf(out, "%f", func->salario);
}

// Le um funcionario do arquivo in na posicao atual do cursor
// Retorna um ponteiro para funcionario lido do arquivo
TFunc *le(FILE *in) {
    TFunc *func = (TFunc *) malloc(sizeof(TFunc));
    if (0 >= fread(&func->cod, sizeof(int), 1, in)) {
        free(func);
        return NULL;
    }
    fread(func->nome, sizeof(char), sizeof(func->nome), in);
    fread(func->cpf, sizeof(char), sizeof(func->cpf), in);
    fread(func->data_nascimento, sizeof(char), sizeof(func->data_nascimento), in);
    fread(&func->salario, sizeof(double), 1, in);
    return func;
}

void le_funcionarios(FILE *in) {
    printf("\n\nLendo funcionarios do arquivo...\n\n");
    rewind(in);
    TFunc *f;
    while ((f = le(in)) != NULL) {
        imprime(f);
        free(f);
    }
}

int numero_funcionarios(FILE *in) {
    rewind(in);
    int cnt = 0;
    TFunc *f;
    while ((f = le(in)) != NULL) {
        cnt++;
        free(f);
    }
    return cnt;
}

// Retorna tamanho do funcionario em bytes
int tamanho() {
    return sizeof(int)  //cod
           + sizeof(char) * 30 //nome
           + sizeof(char) * 15 //cpf
           + sizeof(char) * 11 //data_nascimento
           + sizeof(double); //salario
}

void adiciona_funcionario(FILE *in) {
    printf("\n\nAdicionando funcionario no final do arquivo...\n\n");
    //pula 5 registros para posicionar no início do final do arquivo
    fseek(in, tamanho() * 5, SEEK_SET);
    TFunc *f = funcionario(6, "Bruna", "666.666.666-66", "06/06/1980", 2500);
    salva(f, in);
    free(f);

    //lê funcionário que acabou de ser gravado
    //posiciona novamente o cursor no início desse registro
    fseek(in, tamanho() * 5, SEEK_SET);
    TFunc *f6 = le(in);
    if (f6 != NULL) {
        imprime(f6);
        free(f6);
    }
}

void insere_1000_desordenados(FILE *out){
    printf("Inserindo 1000 funcionarios desordenados no arquivo...\n");
    FILE *numbs = fopen("numbs.txt", "r");
    char Ccode[5];
    int code;
    for (int i = 1; i <= 1000; i++)
    {
        //pegando valor de arquivo numbs.txt
        fgets(Ccode, 5, numbs);
        //tirando o "\n" da string
        Ccode[strcspn(Ccode, "\n")] = 0;
        //transformando a string Ccode em inteirto code
        code = atoi(Ccode);
        //criando um funcionario generico
        TFunc *f1 = funcionario(code, "Standard", Ccode , Ccode, code);
        salva(f1, out);
        free(f1);
    }
    free(numbs);
}

void insere_1000(FILE *out) {
    printf("Inserindo 1000 funcionarios no arquivo...\n");
    char Ci[5];
    for (int i = 1; i <= 1000; i++)
    {
        //escrevendo valor i na srting Ci
        sprintf(Ci, "%d", i);
        TFunc *f1 = funcionario(i, "Standard", Ci , Ci, i);
        salva(f1, out);
        free(f1);
    }
}

void busca_sequencial(FILE *in, int alvo){
    TFunc *func = (TFunc *) malloc(sizeof(TFunc));
    //arquivo para o qual vai o relatorio de desempenho
    FILE *relat = fopen("relatorio.txt", "a+");
    rewind(in);
    for (int i = 1; i <= 1000; i++)
    {
        func = le(in);
        //quando if(true) faz o relatorio.txt
        if(alvo == func->cod){
            salvaTXT(func, relat);
            fprintf(relat, "%s", "    comparacoes: ");
            fprintf(relat, "%d", i);
            fprintf(relat, "%s", "    tempo: ");
            fprintf(relat, "%d", i);
            fprintf(relat, "%s", " mls\n");
            break;
        }
    }
    free(func);
    fclose(relat);
}

void busca_binaria(FILE *in, int alvo){
    TFunc *func = (TFunc *) malloc(sizeof(TFunc));
    //definindo um valor negativo para q o primeiro func->cod
    //sempre seja menor que qualquer um no arquivo
    func->cod = -1;
    //arquivo para o qual vai o relatorio de desempenho
    FILE *relat = fopen("relatorio.txt", "a+");
    int bits, i;
    float num;
    num = bits = i = 0;
    //pegando o numero de funcionarios no arquivo para poder localizar o meio
    num = numero_funcionarios(in);
    rewind(in);
    for (int i = 1; i <= 1000; i++)
    {
        //localizando o meio do arquivo arredondando sempre para cima
        num = ceil(num/2);
        //registrando em "bits" o numero de bits que devem ser deslocados
        bits = ((num) * 68);
        if (alvo < func->cod){
            //deslocando "-bits"bits da posicao atual do ponteiro
            fseek(in, -bits, SEEK_CUR);
        }
        else{
            //deslocando "bits"bits da posicao atual do ponteiro
            fseek(in, bits, SEEK_CUR);
        }
        func = le(in);
        //desfazendo o movimento do ponteiro que ocorre quando a funcao "le()"" e executada"
        fseek(in, -68, SEEK_CUR);
        //quando if(true) faz o relatorio.txt
        if(alvo == func->cod){
            salvaTXT(func, relat);
            fprintf(relat, "%s", "    comparacoes: ");
            fprintf(relat, "%d", i);
            fprintf(relat, "%s", "    tempo: ");
            fprintf(relat, "%d", i);
            fprintf(relat, "%s", " mls\n");
            break;
        }
    }
    free(func);
    fclose(relat);
}