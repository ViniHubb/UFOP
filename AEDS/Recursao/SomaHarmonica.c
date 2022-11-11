#include <stdio.h>
#include <stdlib.h>

float SomaHarmonica(float num){
    
    float var = 0;
    if (num <= 1){
        return 1;
    }
    else{
        var = SomaHarmonica(num-1)+(1/num);
        return var;
    }
}

int main(){

    float num, resu;
    
    printf("\nEscolha o valor final: ");
    fflush(stdin);
    scanf("%f", &num); 
    resu = SomaHarmonica(num);

    printf("A soma dos primeiros %.f numeros da serie e %.2f\n\n", num, resu); 

    return 0;
}