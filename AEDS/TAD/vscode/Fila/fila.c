#include <stdio.h>
#include <stdlib.h>
#include "fila.h"

void FFVazia(TFila* fila){
    fila -> frente = (TCelula *)malloc(sizeof(TCelula));
    fila ->tras = fila -> frente;
    fila -> frente -> prox = NULL;
    fila -> tamanho = 0;
}

int Vazia(TFila fila){
    return (fila.frente == fila.tras);
}

int Tamanho(TFila fila){
    return fila.tamanho;
}

void Ler(TProduto* x){
    printf("\nNome: ");
    fflush(stdin);
    //__fpurge(stdin);
    fgets(x->nome, 20, stdin);
    
    printf("Codigo: ");
    fflush(stdin);
    //__fpurge(stdin);
    scanf("%d", &x -> codigo);

    printf("Preco: ");
    fflush(stdin);
    //__fpurge(stdin);
    scanf("%f", &x -> preco);

    printf("Quantidade: ");
    fflush(stdin);
    //__fpurge(stdin);
    scanf("%d", &x -> quant);
}

void Enfileirar(TProduto x, TFila* fila){
    fila -> tras -> prox = (TCelula *)malloc(sizeof(TCelula));
    fila -> tras = fila -> tras -> prox;
    fila -> tras -> item = x;
    fila -> tras -> prox = NULL;
    fila -> tamanho++;
}

void ImprimirProduto(TProduto x){
    printf("\n=====================\n");
    printf(" Nome: %s", x.nome);
    printf(" Codigo: %d\n", x.codigo);
    printf(" Preco: $%.2f\n", x.preco);
    printf(" Quantidade: %d", x.quant);
    printf("\n=====================");
}

void Desenfileirar(TFila *fila, TProduto *produto){
    TCelula *Aux;
    if (!Vazia(*fila)){
        Aux = fila->frente->prox;
        fila->frente->prox = Aux->prox;
        *produto = Aux->item;
        free(Aux);
        if (fila->frente->prox == NULL){
            fila->tras = fila->frente;
        }
        fila->tamanho--;
    }
}

void Imprimir1(TFila *fila){
    TProduto produto;
    TFila filaAux;
    for (int i=0; i < fila->tamanho; i++){
        Desenfileirar(fila, &produto);
        Enfileirar(produto, &filaAux);
    }
    for (int i=0; i < fila->tamanho; i++){
        Desenfileirar(&filaAux, &produto);
        ImprimirProduto(produto);
        Enfileirar(produto, fila);
    }
}

void Imprimir2(TFila *fila){
    TProduto produto;
    for (int i = 0; i < fila->tamanho; i++){
        Desenfileirar(fila, &produto);
        ImprimirProduto(produto);
        Enfileirar(produto, fila);
    }
}

TProduto* Pesquisar(TFila *fila, TProduto produto){
    TProduto Produto1;
    TProduto *Produto2 = NULL;

    for (int i = 0; i < fila->tamanho; i++){
        Desenfileirar(fila, &Produto1);
        Enfileirar(Produto1, fila);
        if (Produto1.codigo == produto.codigo){
            Produto2 = &fila->tras->item;
        }
    }
    return Produto2;
}

void Liberar(TFila *fila){
    TProduto x;
    while (Vazia(*fila) == 0){
        Desenfileirar(fila, &x);
    }
    free(fila->frente);
}
