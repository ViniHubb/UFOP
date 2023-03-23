import heapq
import csv

#Classe criada para representar cada diciplina
class Dados:
    def __init__(self, Chave:int, Codigo:str, Nome:str, Periodo:str, Duracao:str, Dependencias:str) -> None:
        self.chave = Chave
        self.codigo = Codigo.strip('"')
        self.nome = Nome
        self.periodo = int(Periodo)
        self.duracao = int(Duracao)
        Dependencias = Dependencias.strip('"')
        self.dependencias = Dependencias.split(';')

    def __str__(self) -> str:
        repr = ""
        repr += "Chave: " + str(self.chave) + "\n"
        repr += "Codigo: " + self.codigo + "\n"
        repr += "Nome: " + self.nome + "\n"
        repr += "Periodo: " + str(self.periodo) + "\n"
        repr += "Duracao: " + str(self.duracao) + "\n"
        repr += "Dependencias: " + str(self.dependencias) + "\n"
        return repr
    
class WeightedGraph:
    def __init__(self, node_count: int = 0, edge_count: int = 0, adj_list: list[list[tuple[int, int]]] = []) -> None:
        self.node_count = node_count
        self.edge_count = edge_count
        self.adj_list = adj_list
        if adj_list == []:
            for _ in range(self.node_count):
                self.adj_list.append([])

    def add_directed_edge(self, u: int, v: int, w: int):
        if u < 0 or u >= len(self.adj_list) or v < 0 or v >= len(self.adj_list):
            print(f"Node u={u} or v={v} is out of allowed range (0, {self.node_count - 1})")
        self.adj_list[u].append((v, w))
        self.edge_count += 1

    def add_undirected_edge(self, u: int, v: int, w: int):
        self.add_directed_edge(u, v, w)
        self.add_directed_edge(v, u, w)

    #DIJKSTRA porém modificado para que retorne o maior caminho
    def dijkstra_pq_reverse(self, s):
            dist = [-1] * self.node_count
            pred = [float("inf")] * self.node_count
            pq = []
            heapq.heapify(pq)  # Empty priority queue
            dist[s] = 0
            heapq.heappush(pq, [0, s])
            while len(pq) != 0:
                [min_dist, u] = heapq.heappop(pq)
                for (v, w) in self.adj_list[u]:
                    if dist[v] < dist[u] + w:
                        dist[v] = dist[u] + w
                        pred[v] = u
                        heapq.heappush(pq, [dist[v], v])
            return dist, pred

    #Le o arquivo .csv e o transforma em uma lista de "Dados" chamada "dataList"
    def leitor_arquivo(self, nome: str)-> list[Dados]:
        print("\nProcessando...\n")
        with open(nome, mode="r", newline="", encoding="utf-8") as csvfile:
            reader = csv.reader(csvfile, delimiter=",",quotechar=';')
            next(reader)
            lista = list(reader)
        i=1
        dataList = []
        for linha in lista:
            #Cria um "Dado" e insere na lista
            dataList.append(Dados(i,linha[0],linha[1],linha[2],linha[3],linha[4]))
            i+=1
        return dataList

    #Cria a lista de adjacencia incluindo o S (oferta) representado pelo no 0 e T (demanda) representado pelo no de maior valor
    def cria_adj(self, lista: list[Dados]):
        grafo = WeightedGraph(node_count=(len(lista)+2), adj_list=[])

        #Lista de codigos das disciplinas
        codigos = []
        for dado in lista:
            switch = True
            i=1
            codigos.append(dado.codigo)
            for codigo in codigos:
                if codigo in dado.dependencias:
                    grafo.add_directed_edge(i, dado.chave, 1)
                    switch = False
                i+=1
            #Faz a ligacao com a o ultimo no ("T" demanda)
            grafo.add_directed_edge(i-1,len(lista)+1,1)
            if switch:
                #Faz a ligacao com o primeiro no ("S" oferta) quando a disciplina não tem uma de pendencia
                grafo.add_directed_edge(0,dado.chave,0)
        return grafo

    #Traduz o retorno do Djikastra invertido na resposta que queremos
    def reposta(self, pred:list, lista:list[Dados]):
        resposta = []
        ultimo = pred[-1]
        while ultimo != 0:
            #Adiciona no inicio da lista o "Dado" que fizer parte da resposta
            resposta.insert(0, lista[ultimo-1])
            ultimo = pred[ultimo]
        print("Caminho critico:")
        for dado in resposta:
            print(dado.nome)

    def __str__(self) -> str:
        repr = ""
        for adj in self.adj_list:
            repr += str(adj) + "\n"
        return repr
