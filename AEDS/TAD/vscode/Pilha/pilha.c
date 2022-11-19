#include <stdio.h>
#include <stdlib.h>
#include "pilha.h"

void FPVazia(TPilha* pilha){
    pilha -> topo = (TCelula *)malloc(sizeof(TCelula));
    pilha -> fundo = pilha -> topo;
    pilha -> topo -> prox = NULL;
    pilha -> tamanho = 0;
}

int Vazia(TPilha pilha){
    return (pilha.topo == pilha.fundo);
}

int Tamanho(TPilha pilha){
    return pilha.tamanho;
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

void Empilhar(TProduto x, TPilha *Pilha){
    TCelula *Aux;
    Aux = (TCelula *)malloc(sizeof(TCelula));
    Pilha->topo->item = x; 
    Aux->prox = Pilha->topo;
    Pilha->topo = Aux; 
    Pilha->tamanho++;
}

void ImprimirProduto(TProduto x){
    printf("\n=====================\n");
    printf(" Nome: %s", x.nome);
    printf(" Codigo: %d\n", x.codigo);
    printf(" Preco: $%.2f\n", x.preco);
    printf(" Quantidade: %d", x.quant);
    printf("\n=====================");
}

void Desempilhar(TPilha *pilha, TProduto *produto){
    TCelula *Aux;
    if (Vazia(*pilha)){
        return;
    }
    Aux = pilha->topo;
    pilha->topo = Aux->prox;
    *produto = Aux->prox->item;
    free(Aux);
    pilha->tamanho--;
}

void Excluir(TPilha *pilha, TProduto *produto){
    TPilha pilhaAux;
    FPVazia(&pilhaAux);
    TProduto item;
    int flag = 0;
    int i = 0;

    while (pilha->tamanho > i)
    {  
        Desempilhar(pilha, &item); 
        Empilhar(item, &pilhaAux);
        if (produto->codigo == item.codigo){
            Desempilhar(&pilhaAux, &item); 
            *produto = item;
            flag = 1;
        }
    }
    while (pilhaAux.tamanho > i){
        Desempilhar(&pilhaAux, &item);
        Empilhar(item, pilha);
    }
    if (!flag){
        produto->codigo = -1;
    }
    
}

void Imprimir(TPilha *pilha){
    TProduto produto;
    TPilha pilhaAux;
    FPVazia(&pilhaAux);
    
    while (!Vazia(*pilha)){    
        Desempilhar(pilha, &produto);
        Empilhar(produto, &pilhaAux);
    }
    while (!Vazia(pilhaAux)){
        Desempilhar(&pilhaAux, &produto);
        ImprimirProduto(produto);
        Empilhar(produto, pilha);
    }
}

TProduto Pesquisar(TPilha *pilha, TProduto produto){
    TPilha pilhaAux;
    FPVazia(&pilhaAux);
    TProduto item;
    int flag = 0;
    int i = 0;

    while (pilha->tamanho > i)
    {  
        Desempilhar(pilha, &item); 
        Empilhar(item, &pilhaAux);
        if (produto.codigo == item.codigo){
            produto = item;
            flag = 1;
        }
    }
    while (pilhaAux.tamanho > i){
        Desempilhar(&pilhaAux, &item);
        Empilhar(item, pilha);
    }
    if (!flag){
        produto.codigo = -1;
    }
    
    return produto;
}

void Liberar(TPilha *pilha){
    TProduto produto;
    
    while (!Vazia(*pilha)){    
        Desempilhar(pilha, &produto);
    }
    free(pilha->fundo);
}
