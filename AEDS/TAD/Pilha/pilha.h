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
    TCelula* topo;
    TCelula* fundo;
    int tamanho;
} TPilha;

void FPVazia(TPilha* pilha);

int Vazia(TPilha pilha);

int Tamanho(TPilha pilha);

void Ler(TProduto* x);

void Empilhar(TProduto x, TPilha* pilha);

void ImprimirProduto(TProduto x);

void Desempilhar(TPilha *pilha, TProduto *produto);

void Excluir(TPilha *pilha, TProduto *produto);

void Imprimir(TPilha *pilha);

TProduto Pesquisar(TPilha *pilha, TProduto produto);

void Liberar(TPilha *pilha);

#endif // HEADER_FILA
