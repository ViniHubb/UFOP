from weightedGraph import WeightedGraph

grafo = WeightedGraph()
while True:
    arquivo = str(input("Informe o arquivo (0 para sair):"))
    if arquivo == "0": break
    lista = grafo.leitor_arquivo(arquivo)
    grafo = grafo.cria_adj(lista)
    print(grafo)
    dist = grafo.dijkstra_pq_reverse(0)[0]
    pred = grafo.dijkstra_pq_reverse(0)[1]
    grafo.reposta(pred, lista)
    print("\nTempo minimo:", dist[-1], "periodos\n")