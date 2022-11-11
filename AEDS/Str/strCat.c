#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void Concat(char* destino, char* origem){

    int tamanho = strlen(destino)+strlen(origem);
    destino = (char*)realloc(destino, tamanho+2);

    int j=0;
    for (int i = strlen(destino); *(j+origem) != '\0'; i++)
    {
        *(i+destino) = *(j+origem);
        j++;
    }
}

int main()
{
    char *origem = (char*)calloc(20,sizeof(char));
    char *destino = (char*)calloc(20,sizeof(char));

    /////Função padrão/////
    fflush(stdin);
    fgets(destino, 20, stdin);
    fflush(stdin);
    fgets(origem, 20, stdin);

    strcat(destino, origem);
    printf("\nFuncao padrao\n");
    printf("=============");
    printf("\n%s", destino);
    printf("=============\n");
    ////////////////////////

    ////Função replicada////
    fflush(stdin);
    fgets(destino, 10, stdin);
    fflush(stdin);
    fgets(origem, 10, stdin);

    Concat(destino, origem);
    printf("\nFuncao replicada\n");
    printf("================");
    printf("\n%s", destino);
    printf("================\n");
    ///////////////////////

    free(origem);
    free(destino);

    return 0;
}
