#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int StrToInt(char* str){

    int num;
    int mult;
    
    if (*str == '\0')
    {
        return 0;
    }
    
    mult = StrToInt(str+1);
    num = (*str-48)+(mult*10);
    
    return num;
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

    int num;

    char* str = (char*)calloc(102, sizeof(char));
    printf("Digite numeros: ");
    fflush(stdin);
    fgets(str, 100, stdin);
    TiraEnter(str);
    
    num = StrToInt(str);

    printf("\nA conversao ficou assim: %d\n", num);

    free(str);

    return 0;
}