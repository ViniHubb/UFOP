#include <stdio.h>
#include <stdlib.h>

#include "interface.h"
#include "interface.h"

void MSG_MENU()
{
    system("cls");
    //system("clear");
    printf("\n\n>>>>>>>>>>>>>>>>>>>>>>> OPCOES DE MENU <<<<<<<<<<<<<<<<<<<<<<<<");
    printf("\n\n  1. INSERIR");
    printf("  \n  2. PESQUISAR");
    printf("  \n  3. EXCLUIR");
    printf("  \n  4. IMPRIMIR");
    printf("  \n  5. SAIR");
}

void MENU(TPilha *pilha){
    TProduto *produto;
    int opcao=0;
    TProduto ptr;

    do
    {
        MSG_MENU();
        printf("\n\nDigite uma opcao: ");
        fflush(stdin);
        //__fpurge(stdin);
        scanf("%d", &opcao);
        switch(opcao)
        {
            case 1:
                /**
                    Código para opção de menu Inserir
                */

                    Ler(produto);
                    Empilhar(*produto, pilha);

                break;
            case 2:
                /**
                    Código para opção de menu Pesquisar
                */

                printf("\nDigite o codigo do produto que deseja pesquisar: ");
                fflush(stdin);
                //__fpurge(stdin);
                scanf("%d", &produto->codigo);

                ptr = Pesquisar(pilha, *produto);

                if(ptr.codigo != -1){
                    printf("\nO produto esta na pilha:\n");
                    ImprimirProduto(ptr);
                }
                else
                    printf("\nO produto NAO esta na pilha\n");

                printf("\n");
                system("PAUSE");

                break;
            case 3:
                /**
                    Código para opção de menu Excluir
                */

                printf("\nDigite o codigo do produto que deseja excluir: ");
                fflush(stdin);
                //__fpurge(stdin);
                scanf("%d", &produto->codigo);

                Excluir(pilha, produto);

                if (produto->codigo < 0)
                    printf("O produto nao existe!\n");
                else{
                    printf("O produto foi excluido com sucesso!!");
                    ImprimirProduto(*produto);
                }
                printf("\n");
                system("PAUSE");

                break;
            case 4:
                /**
                    Código para opção de menu Imprimir
                */

                if(pilha->tamanho == 0){
                    printf("Pilha vazia!");
                }else
                    printf("Pilha:");
                    Imprimir(pilha);

                printf("\n");
                system("PAUSE");

                break;
            case 5:

                system("cls");
                //system("clear");
                printf("\n\n\n\t >>>>>> MSG: Saindo do MODULO...!!! <<<<<<\n\t");
                system("PAUSE");

                Liberar(pilha);

                break;
            default:

                system("cls");
                //system("clear");
                printf("\n\n\n\t >>>>>> MSG: Digite uma opcao valida!!! <<<<<<\n\t");
                system("PAUSE");

            } // fim do bloco switch
    } while(opcao != 5);
}
