package exercicio_01;

public class Grafos {
	private int vertices[][];
	
	public Grafos(int pontos){
		this.vertices = new int[pontos][pontos];
		for (int i = 0; i < vertices.length; i++) {
			vertices[i][0] = i+1;
			
			for(int j = 1; j < vertices.length; j++) {
				vertices[i][j] = 0;
			}
		}
	}
	public void setCaminhos(int origem, int chegada) {
		for (int i = 0; i < vertices.length; i++) {
			if(vertices[i][0] == origem) {
				for (int j = 1; j < vertices.length; j++) {
					if(vertices[i][j] == chegada) {
						break;
					}
					else if(vertices[i][j] == 0) {
						this.vertices[i][j] = chegada;
						break;
					}
				}
			}
			if(vertices[i][0] == chegada) {
				for (int j = 1; j < vertices.length; j++) {
					if(vertices[i][j] == origem) {
						break;
					}
					if(vertices[i][j] == 0) {
						this.vertices[i][j] = origem;
						break;
					}
				}
			}
		}
	}
	public String verificaVizinho(int x1, int x2) {
		for (int i = 1; i < vertices.length; i++) {
			if(vertices[x1-1][i] == x2) {
				return "SIM eles são vizinhos!";
			}
		}
		return "Não eles não são vizinhos!";
		
	}
	public void lista() {
		int cnt = 0;
		
		System.out.println("\n|vértice|lista de adjacência|");
		for (int i = 0; i < vertices.length; i++) {
			System.out.print("|   " + vertices[i][0] + "   |  ");
			for (int j = 1; j < vertices.length; j++) {
				if(vertices[i][j] != 0) {
					System.out.print(vertices[i][j] + ", ");
					cnt+=3;
				}
			}
			for (; cnt < 17; cnt++) {		// Isso é apenas uma configuração gráfica, na qual o ultimo traçado da							
				System.out.print(" ");		//		tabela se adapta a quantidade de números adjacentes
			}
			cnt = 0;
			System.out.print("|");
			System.out.print("\n");
		}
	}
}
