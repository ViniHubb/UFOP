#ifndef FUNCIONARIO_H_INCLUDED
#define FUNCIONARIO_H_INCLUDED

#include <stdlib.h>
#include <stdio.h>

typedef struct Funcionario {
    int cod;
    char nome[30];
    char cpf[15];
    char data_nascimento[11];
    double salario;
} TFunc;

// Imprime funcionario
void imprime(TFunc *func);

// Cria funcionario. Lembrar de usar free(funcionario)
TFunc *funcionario(int cod, char *nome, char *cpf, char *data_nascimento, double salario);

// Salva funcionario no arquivo out.dat, na posicao atual do cursor
void salva(TFunc *func, FILE *out);

// Salva funcionario no arquivo out.txt, na posicao atual do cursor
void salvaTXT(TFunc *func, FILE *out);

// Le um funcionario do arquivo in na posicao atual do cursor
// Retorna um ponteiro para funcionario lido do arquivo
TFunc *le(FILE *in);

// Le e imprime todos os funcionarios do arquivo in
void le_funcionarios(FILE *in);

int numero_funcionarios(FILE *in);

// Retorna tamanho do funcionario em bytes
int tamanho();

// Adiciona um funcionario no final do arquivo (necessita refatoração)
void adiciona_funcionario(FILE *in);

// Cria arquivo funcionario.dat com 1000 funcionarios desordenadamente
void insere_1000_desordenados(FILE *out);

// Insere 1000 funcionarios no arquivo funcionarios.dat
void insere_1000(FILE *out);

// Faz uma busca sequencial do funcionario com o codigo alvo, em qualquer arquivo!
void busca_sequencial(FILE *in, int alvo);

// Faz uma busca binaria do funcionario com o codigo alvo, em arquivos ordenados!
void busca_binaria(FILE *in, int alvo);

#endif // FUNCIONARIO_H_INCLUDED
