#ifndef HEADER_FILA
#define HEADER_FILA

#include <stdlib.h>
#include <stdio.h>

typedef struct{
    char nome[20];
    int codigo;
    float preco;
    int quant;
} TProduto;

typedef struct celula{
    TProduto item;
    struct celula* prox;
} TCelula;

typedef struct{
    TCelula* frente;
    TCelula* tras;
    int tamanho;
} TFila;

void FFVazia(TFila* fila);

int Vazia(TFila fila);

int Tamanho(TFila fila);

void Ler(TProduto* x);

void Enfileirar(TProduto x, TFila* fila);

void ImprimirProduto(TProduto x);

void Desenfileirar(TFila *fila, TProduto *produto);

void Imprimir1(TFila *fila);

void Imprimir2(TFila *fila);

TProduto* Pesquisar(TFila *fila, TProduto produto);

void Liberar(TFila *fila);

#endif // HEADER_FILA
