#include <stdio.h>
#include <stdlib.h>

int SomaVar(int num){
    
    int var = 0;
    if (num <= 1){
        return 1;
    }
    else{
        var = SomaVar(num-1)+num;
        return var;
    }
}

int main(){

    int num, resu;
    
    printf("\nEscolha o valor final: ");
    fflush(stdin);
    scanf("%d", &num);
    
    resu = SomaVar(num);
    printf("A soma de 1 a %d e %d\n\n", num, resu); 

    return 0;
}