package exercicio_02;

import java.util.Scanner;

public class JogoDaVelha {
	private String casa[] = new String[9];
	private String simbolo1 = "X";
	private String simbolo2 = "O";
	private int fim = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public JogoDaVelha() {
		for (int i = 0; i < casa.length; i++) {
			casa[i] = String.valueOf(i+1);
			
			//casa[i] = " ";				//Essa é uma alternativa para o jogo ficar mais bonito
										//(recomendado somente depois que você entendeu como o jogo funciona)
		}
	}
	public void tabuleiro(int posicao, int player) {
		
		if(casa[(posicao-1)].equals(simbolo1) || casa[(posicao-1)].equals(simbolo2)) {
			System.out.println("VOCÊ ESCOLHEU UM POSIÇÂO JÁ OCUPADA, PERDEU SUA VEZ\n");
		}
		
		else if(player == 1) {
			casa[(posicao-1)] = this.simbolo1;
			fim++;
		}
		else if(player == 2) {
			casa[(posicao-1)] = this.simbolo2;
			fim++;
		}

		
		System.out.print("     |     |     \n");
		System.out.print("  " + casa[0] + "  |");
		System.out.print("  " + casa[1] + "  |");
		System.out.print("  " + casa[2]);
		System.out.print("\n_____|_____|_____\n");
		System.out.print("     |     |     \n");
		System.out.print("  " + casa[3] + "  |");
		System.out.print("  " + casa[4] + "  |");
		System.out.print("  " + casa[5]);
		System.out.print("\n_____|_____|_____\n");
		System.out.print("     |     |     \n");
		System.out.print("  " + casa[6] + "  |");
		System.out.print("  " + casa[7] + "  |");
		System.out.print("  " + casa[8]);
		System.out.print("\n     |     |     \n\n");
	}
	public boolean ganhador1() {
		
		for (int i = 0; i < casa.length; i++) {
			if(casa[i].equals(simbolo1)) {
				if(i == 0) {
					if(casa[1].equals(simbolo1)) {
						if(casa[2].equals(simbolo1)) {
							return true;
						}
					}
					if(casa[3].equals(simbolo1)) {
						if(casa[6].equals(simbolo1)) {
							return true;
						}
					}
					if(casa[4].equals(simbolo1)) {
						if(casa[8].equals(simbolo1)) {
							return true;
						}
					}
				}
				if(i == 1) {
					if(casa[4].equals(simbolo1)) {
						if(casa[7].equals(simbolo1)) {
							return true;
						}
					}
				}
				if(i == 2) {
					if(casa[5].equals(simbolo1)) {
						if(casa[8].equals(simbolo1)) {
							return true;
						}
					}
					if(casa[4].equals(simbolo1)) {
						if(casa[6].equals(simbolo1)) {
							return true;
						}
					}
				}
				if(i == 3) {
					if(casa[4].equals(simbolo1)) {
						if(casa[5].equals(simbolo1)) {
							return true;
						}
					}
				}
				if(i == 6) {
					if(casa[7].equals(simbolo1)) {
						if(casa[8].equals(simbolo1)) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	public boolean ganhador2() {
		
		for (int i = 0; i < casa.length; i++) {
			if(casa[i].equals(simbolo2)) {
				if(i == 0) {
					if(casa[1].equals(simbolo2)) {
						if(casa[2].equals(simbolo2)) {
							return true;
						}
					}
					if(casa[3].equals(simbolo2)) {
						if(casa[6].equals(simbolo2)) {
							return true;
						}
					}
					if(casa[4].equals(simbolo2)) {
						if(casa[8].equals(simbolo2)) {
							return true;
						}
					}
				}
				if(i == 1) {
					if(casa[4].equals(simbolo2)) {
						if(casa[7].equals(simbolo2)) {
							return true;
						}
					}
				}
				if(i == 2) {
					if(casa[5].equals(simbolo2)) {
						if(casa[8].equals(simbolo2)) {
							return true;
						}
					}
					if(casa[4].equals(simbolo2)) {
						if(casa[6].equals(simbolo2)) {
							return true;
						}
					}
				}
				if(i == 3) {
					if(casa[4].equals(simbolo2)) {
						if(casa[5].equals(simbolo2)) {
							return true;
						}
					}
				}
				if(i == 6) {
					if(casa[7].equals(simbolo2)) {
						if(casa[8].equals(simbolo2)) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	public String getSimbolo1() {
		return this.simbolo1;
	}
	public String getSimbolo2() {
		return this.simbolo2;
	}
	public void jogada() {
		int player = 1;
		while (this.fim < 9) {
			System.out.printf("Player %d\n", player);
			tabuleiro(sc.nextInt(), player);
			if(ganhador1() || ganhador2()) {
				break;
			}
			if(player == 1) {
				player++;
			}
			else if(player == 2) {
				player--;
			}
		}
		resultado();
	}
	public void resultado() {
		
		if(ganhador1()) {
			System.out.printf("=====================\n");
			System.out.printf(" THE " + Status.PLAYER_ONE + " WIN!");
			System.out.printf("\n=====================");
		}
		else if(ganhador2()){
			System.out.printf("=====================\n");
			System.out.printf(" THE "+ Status.PLAYER_TWO +" WIN!");
			System.out.printf("\n=====================");
		}
		else if (this.fim == 9) {
			System.out.printf("================\n");
			System.out.printf("   DEU VELHA    \n");
			System.out.printf(" THE GAME " + Status.DRAW + "!");
			System.out.printf("\n================");
		}
	}
}
