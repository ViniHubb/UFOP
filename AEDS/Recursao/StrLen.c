#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int StrLen(char* str){

    int tamanho;

    if (*str == '\0')
    {
        return 0;
    }
    tamanho = StrLen(str+1)+1;
    
    return tamanho;

}

void TiraEnter(char* str){

    int j, i;
    j=-1;
    
    for (i=0; i < 100; i++)
    {
        if (*(str+i) == '\0')
        {
            *(str+j) = '\0';
            break;
        }
        j++;
    }
}

int main(){

    int tamanho;
    char* str = (char*)calloc(102, sizeof(char));
    printf("Digite uma string: ");
    fflush(stdin);
    fgets(str, 100, stdin);
    TiraEnter(str);

    printf("\nString = \"%s\"", str);

    tamanho = StrLen(str);

    printf("\n\nTamanho da String = %d\n\n", tamanho);

    free(str);

    return 0;
}