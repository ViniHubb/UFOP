#ifndef HEADER_LISTA
#define HEADER_LISTA

#include <stdlib.h>
#include <stdio.h>

typedef struct
{
    char nome[20];
    int codigo;
    float preco;
    int quant;
} TProduto;

typedef struct celula
{
    TProduto item;
    struct celula* prox;
} TCelula;

typedef struct
{
    TCelula* primeiro;
    TCelula* ultimo;
    int tamanho;
} TLista;

void FLVazia(TLista* Lista);

int Vazia(TLista lista);

int Tamanho(TLista lista);

void Inserir(TProduto x, TLista* Lista);

void Ler(TProduto* x);

void ImprimirProduto(TProduto x);

void Imprimir(TLista lista);

TCelula* Pesquisar(TLista lista, TProduto x);

void Excluir(TLista* lista, TProduto* item);

void Liberar(TLista *lista);

#endif // HEADER_LISTA
