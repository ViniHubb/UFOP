package exercicio_02;

public class Controlador {
public static void main(String[] args) {
		
		int posicao = 1;
		int player = 3;
		
		JogoDaVelha jv = new JogoDaVelha();
		System.out.println("\tO jogo comoçou\n");
		System.out.println("===============");
		System.out.println(" Player 1 : " + jv.getSimbolo1());
		System.out.println(" Player 2 : " + jv.getSimbolo2());
		System.out.println("===============\n");
		jv.tabuleiro(posicao, player);
		
		System.out.println("Player 1 começa, escolha uma posição");
		jv.jogada();
	}
}
