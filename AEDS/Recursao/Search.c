#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int Search(char* t, char* s){

    if ()
    {
        
    }
    else{
        Search(t, s);
    }

}

int main(){

    char str = "abcdefghijklmnopqrstuvwxyz";
    char* s;
    char* t; 
    int posicao;
    
    s = &str;
    t = (char*)calloc(28, sizeof(char));


    printf("Essa e a string: \n");
    printf("==================================\n");
    printf(" s = 'abcdefghijklmnopqrstuvwxyz'\n");
    printf("==================================\n");
    printf("\nAgora vc pode escolher a string 't' para fazer os testes: \n\n");
    printf("==================================\n");
    printf("t = ");
    fflush(stdin);
    fgets(t, 26, stdin);
    printf("==================================\n");
    
    posicao = Search(t, s);

    printf("\nA posicao inicial da string escolhida e s[%d]\n\n", posicao); 

    free(s);
    free(t);

    return 0;
}