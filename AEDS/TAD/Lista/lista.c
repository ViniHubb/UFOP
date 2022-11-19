#include <stdio.h>
#include <stdlib.h>
#include "lista.h"

void FLVazia(TLista* Lista)
{
    Lista -> primeiro = (TCelula *)malloc(sizeof(TCelula));
    Lista -> ultimo = Lista -> primeiro;
    Lista -> primeiro -> prox = NULL;
    Lista -> tamanho = 0;
}

int Vazia(TLista lista)
{
    return (lista.primeiro == lista.ultimo);
}

int Tamanho(TLista lista)
{
    return lista.tamanho;
}

void Inserir(TProduto x, TLista* Lista){
    Lista -> ultimo -> prox = (TCelula *)malloc(sizeof(TCelula));
    Lista -> ultimo = Lista -> ultimo -> prox;
    Lista -> ultimo -> item = x;
    Lista -> ultimo -> prox = NULL;
    Lista -> tamanho++;
}

void Ler(TProduto* x){
    printf("\nNome: ");
    fflush(stdin);
    //__fpurge(stdin);
    fgets(x -> nome,20,stdin);

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

void ImprimirProduto(TProduto x){
    printf("\n=====================\n");
    printf(" Nome: %s", x.nome);
    printf(" Codigo: %d\n", x.codigo);
    printf(" Preco: $%.2f\n", x.preco);
    printf(" Quantidade: %d", x.quant);
    printf("\n=====================");
}

void Imprimir(TLista lista){
    TCelula* Aux;
    Aux = lista.primeiro -> prox;
    while(Aux != NULL){
        ImprimirProduto(Aux -> item);
        Aux = Aux -> prox;
    }
}

TCelula* Pesquisar(TLista lista, TProduto x){
    TCelula* Aux;
    Aux = lista.primeiro;
    while(Aux->prox != NULL){
        if(Aux->prox->item.codigo == x.codigo)
            return Aux;
        Aux = Aux -> prox;
    }
    return NULL;
}

void Excluir(TLista* lista, TProduto* item){
    TCelula *Aux1, *Aux2;
    Aux1 = Pesquisar(*lista, *item);
    if(Aux1 != NULL){
        Aux2 = Aux1->prox;
        Aux1->prox= Aux2->prox;
        *item = Aux2->item;
        if(Aux1->prox == NULL)
            lista->ultimo = Aux1;
        free(Aux2);
        lista->tamanho--;
    }else
        item->codigo = -1;
}

void Liberar(TLista *lista){
    TCelula* Aux;
    while(lista->tamanho > 0){
        Aux = lista->primeiro->prox;
        Excluir(lista, &Aux->item);
    }
    free(lista->primeiro);
}
