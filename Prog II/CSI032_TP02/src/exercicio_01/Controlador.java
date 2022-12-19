package exercicio_01;

import java.util.Scanner;

public class Controlador {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Grafos gr;
		int pontos, origem, chegada;
		int decisao = 1, x1, x2;
		String sn;
		
		System.out.println("Quantos pontos terá seu grafo?");
		pontos = sc.nextInt();
		gr = new Grafos(pontos);
		
		do {
			
			System.out.println("Escolha um ponto de origem");
			origem = sc.nextInt();
	
			System.out.println("Escolha um ponto de chegada");
			chegada = sc.nextInt();
			gr.setCaminhos(origem, chegada);
			
			System.out.println("Deseja adcionar mais caminhos? (s/n)");
			sn = sc.next();
			
		} while(sn.equals("s"));
		
		while(decisao == 1) {
			System.out.println("\nO que deseja fazer agora?");
			System.out.println("1. Verificar vizinhaça de vértices");
			System.out.println("2. Ver a lista de adjacência");
			decisao = sc.nextInt();
			if(decisao == 1) {
				System.out.println("Primeiro vertice: ");
				x1 = sc.nextInt();
				System.out.println("Segundo vertice: ");
				x2 = sc.nextInt();
				System.out.println(gr.verificaVizinho(x1, x2));
			}
		}
		gr.lista();
		
		sc.close();
	}
}
