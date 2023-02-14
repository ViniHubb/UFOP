class Graph:
    # Este é o contrutor do grafo de lista de adjacência
    def __init__(self, node_count: int, edge_count: int = 0, adj_list: list[list[int]] = []) -> None:
        self.node_count = node_count
        self.edge_count = edge_count
        self.adj_list = adj_list
        if adj_list == []:
            for _ in range(self.node_count):
                self.adj_list.append([])

    # Adiciona no grafo uma aresta direcionada de "u" para "v"
    def add_directed_edge(self, u: int, v: int):
        if u < 0 or u >= len(self.adj_list) or v < 0 or v >= len(self.adj_list):
            print(f"Node u={u} or v={v} is out of allowed range (0, {self.node_count - 1})")
        self.adj_list[u].append(v)
        self.edge_count += 1

    # Faz uma busca em profundidade do nó "s" até o no "e". Retorna a lista com o caminho percorrido
    def dfs_break(self, s, e):
        desc = []
        Q = [s]
        for _ in range(len(self.adj_list)):
            desc.append(0)
        desc[s] = 1
        while len(Q) != 0:
            u = Q[-1]
            desempilhar = True
            for v in self.adj_list[u]:
                if desc[v] == 0:
                    desempilhar = False
                    Q.append(v)
                    desc[v] = 1
                    break
            if e in Q:
                break
            elif desempilhar:
                Q.pop()
        return Q

    # Lê o arquivo txt com o labirindo e o transforma em um grafo de lista de adjacência
    def matrix_reader(self, file_name: str):
        print("Processando arquivo...")
        # Abre o arquivo txt para leitura e "linhas" recebe todas as linhas do arquivo
        with open(file_name,'r') as file:
            linhas = file.read().split("\n")
        # Cria um grafo auxiliar com o númeor de nós que o arquivo precisa
        graph = Graph(len(linhas)*len(linhas[0]), adj_list=[])
        for i in range(len(linhas)):
            for j in range(len(linhas[0])):
                # Calcula a posição de cada nó
                position = (i*len(linhas[0])+j)
                # Faz as conexões entre os nós que são caminhos (representado no arquivo por " ")
                if linhas[i][j] != "#": # "#" são paredes
                    if j != 0 and linhas[i][j-1] != "#": #back
                        graph.add_directed_edge(position, position-1)
                    if j != len(linhas[i])-1 and linhas[i][j+1] != "#": #front
                        graph.add_directed_edge(position, position+1)
                    if i != 0 and linhas[i-1][j] != "#": #up
                        graph.add_directed_edge(position-len(linhas[0]), position)
                    if i != len(linhas)-1 and linhas[i+1][j] != "#": #down
                        graph.add_directed_edge(position+len(linhas[0]), position)
        # Retorna o grafo de lista de adjacência
        return graph

    # Faz uma busca em profundidade do nó de inicio (no arquivo é indicado como "S") até o no de término (no arquivo é indicado como "E")
    def maze_solution(self, file_name: str, graph):
        # Abre o arquivo txt para leitura e "linhas" recebe todas as linhas do arquivo
        with open(file_name,'r') as file:
            linhas = file.read().split("\n")
        # Encontra a posição de inicio "S" atibuindo a "start" e a posição de fim "E" atribuindo a "end"
        for i in range(len(linhas)):
            for j in range(len(linhas[0])):
                if linhas[i][j] == "S":
                    start = (i*len(linhas[0])+j)
                if linhas[i][j] == "E":
                    end = (i*len(linhas[0])+j)
        print("Solucionando...")
        # Chama a função dfs_break (busca em profundidaade modificada) e retorna a lista com o caminho solução
        return graph.dfs_break(start, end)

    # Agrupa todas as funçoes anteriores e cria um arquivo txt com o labirinto resolvoido
    def matrix_solution(self, file_name: str):
        # Chama a função matrix_reader
        graph = self.matrix_reader(file_name)
        # Chama a função maze_solution
        solution = graph.maze_solution(file_name, graph)
        # Abre o arquivo txt para leitura e "colunas" recebe a primeira linha do arquivo
        with open(file_name, 'r') as arquivo:
            colunas = arquivo.readline().split('\n')
        # "size" recebe o tamanho do grafo
        size = len(graph.adj_list)
        # Cria um arquivo 'resolution.txt' para desenhar a solução do labirinto
        with open('resolution.txt', 'w', encoding="utf-8") as arquivo:
            for i in range(size):
                if graph.adj_list[i] == []:
                    arquivo.write('█') # Parede
                elif i in solution:
                    arquivo.write('▪') # Caminho correto
                else:
                    arquivo.write(' ') # Caminho errado
                if (i+1)%(len(colunas[0])) == 0:
                    arquivo.write('\n')
        # Traduz as posições dos nós em coordenadas (formata o resultado)
        formatted_solution = []
        for i in range(len(solution)):
            x = solution[i]//len(colunas[0])
            y = solution[i]%len(colunas[0])
            formatted_solution.append('(' + str(x) + ',' + str(y) + ')')
        return formatted_solution