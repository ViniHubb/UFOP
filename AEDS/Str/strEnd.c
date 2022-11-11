#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int StrEnd(char *s, char *t) {

    int i;
    int casas = (strlen(s)-strlen(t));
    
    for (i = 0; i < casas; i++) {
        *s++;
    }
    if (!(strcmp(s,t))){
        return 1;
    }
    return 0;
}

int main(void) {
    
    char* s = (char*)calloc(20,sizeof(char));
    char* t = (char*)calloc(20,sizeof(char));
    int valor;
    
    fflush(stdin);
    fgets(s,20,stdin);
    fflush(stdin);
    fgets(t,20,stdin);

    valor = StrEnd(s, t);
    printf("===\n");
    printf(" %d\n", valor);
    printf("===\n");

    free(s);
    free(t);
    
    return 0;
}
