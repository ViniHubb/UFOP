#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int Maior(int vet[], int tamanho){

    tamanho = (tamanho-1);

    if (tamanho <= 0)
    {
        return vet[0];
    }
    else
    {
        if (vet[0] < vet[tamanho])
        {
            vet[0] = vet[tamanho];
        }
    }

    return Maior(vet, tamanho);
}

int main(){

    int vet[10] = {1,3,5,7,9,2,33,6,8,0};
    int maior;

    printf("\nVetor = { ");
    for (int i = 0; i < 10; i++)
    {
        printf("%d, ", vet[i]);
    }
    printf("}");

    maior = Maior(vet, 10);

    printf("\n\nO maior valor no vetor e = %d \n\n", maior);

    return 0;
}