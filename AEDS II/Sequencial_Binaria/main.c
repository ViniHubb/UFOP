#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "funcionario.c"

int main() {
    //declara ponteiro para arquivo
    FILE *base;
    //declara variavel de escolha
    char *choice = (char *)malloc(sizeof(char));
    //abre arquivo funcionarios.dat
    base = fopen("funcionarios.dat", "rb");
    if (base == NULL) {
        printf("Erro ao abrir o arquivo\n");
        printf("Deseja criar um arquivo?(Y/N): ");
        scanf("%s", choice);
        if (strcmp(choice, "Y") == 0 || strcmp(choice, "y") == 0)
        {
            ///*
            //insere 1000 funcionarios no arquivo base
            fclose(base);
            base = fopen("funcionarios.dat", "w+b");
            insere_1000(base);
            printf("Arquivo 'fincionario.dat' criado!\n");
            //*/
            /*
            //insere 1000 funcionarios desodernadamente no arquivo base
            fclose(base);
            base = fopen("funcionarios.dat", "w+b");
            insere_1000_desordenados(base);
            */
        }
        else{
            return 0;
        }
    }
    
    system("PAUSE");
    remove("relatorio.txt");
    for (int i = 1; i <= 99; i++)
    {
        //busca_sequencial(base, i*9);
        //busca_binaria(base, i*9);
    }
    fclose(base);
}