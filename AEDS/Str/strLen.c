#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int ContLetras(char* origem){

    int i = 0;
    while (*(i+origem) != '\0'){ i++; }
    
    return i;

}

int main()
{
    char *origem = (char*)calloc(20,sizeof(char));
    int numeroLetras;

    fflush(stdin);
    fgets(origem, 20, stdin);

    /////Função padrão/////
    printf("\nFuncao padrao\n");
    printf("=============\n");
    numeroLetras = strlen(origem);
    printf("      %d\n", numeroLetras);
    printf("=============\n");
    ////////////////////////

    ////Função replicada////
    printf("\nFuncao replicada\n");
    printf("================\n");
    numeroLetras = ContLetras(origem);
    printf("       %d\n", numeroLetras);
    printf("================\n");
    ////////////////////////
    free(origem);

    return 0;
}
