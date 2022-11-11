#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int Comparador(char* destino, char* origem){
        
    int i = 0;
    int d, o;

    while (*(i+destino) != '\0')
    {
        d = *(i+destino);
        o = *(i+origem);

        if (d < o)
        {
            return -1;
        }
        else if (d > o)
        {
            return 1;
        }
        else{
            i++;
        }
    }

    return 0;
}

int main()
{
    char *origem = (char*)calloc(10,sizeof(char));
    char *destino = (char*)calloc(10,sizeof(char));
    int cmp;

    fflush(stdin);
    fgets(destino, 10, stdin);
    fflush(stdin);
    fgets(origem, 10, stdin);

    /////Função padrão/////
    cmp = strcmp(destino, origem);
    printf("Funcao padrao\n");
    printf("=============\n");
    printf("      %d\n", cmp);
    printf("=============\n");
    ////////////////////////

    ////Função replicada////
    cmp = Comparador(destino, origem);
    printf("Funcao replicada\n");
    printf("================\n");
    printf("       %d\n", cmp);
    printf("================\n");
    ///////////////////////

    free(origem);
    free(destino);

    return 0;
}