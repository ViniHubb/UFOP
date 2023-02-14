from graph import Graph
import time

while(True):
    # Inicia o relógio
    clock = time.time()
    # Recebe o caminho do arquivo que o usuario digitar
    arquivo = str(input("Iforme o arquivo com o labirinto (0 para sair): "))
    # Se digitar 0 o program encerra
    if arquivo == '0':
        exit()
    # Cria um grafo vazio
    grafo = Graph(0, adj_list=[])
    solution = grafo.matrix_solution(arquivo)
    # Escreve a solução do labirinto
    print("Caminho: ", end="")
    print(solution)
    # Encerra o relógio
    clock = (time.time() - clock)/100
    print(f"\033[34mTempo: {clock:.2f}s\033[m")
    print("\033[32mFoi criado um arquivo 'resolution.txt' com o caminho feito\033[m\n")
