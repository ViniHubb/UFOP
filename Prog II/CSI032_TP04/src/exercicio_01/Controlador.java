package exercicio_01;

import java.util.Scanner;

public class Controlador {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int escolha;
		
		Form listaForms[] = new Form[4];
		
		listaForms[0] = new Form("Vini");
		listaForms[0].setMatricula("21.1.8008");
		listaForms[0].setCurso("Computação");
		
		listaForms[1] = new Form("Nanda");
		listaForms[1].setMatricula("20.1.0908");
		listaForms[1].setCurso("Computação");
		
		listaForms[2] = new Form("Boy");
		listaForms[2].setMatricula("19.1.3248");
		listaForms[2].setCurso("Computação");
		
		listaForms[3] = new Form("Girl");
		listaForms[3].setMatricula("20.2.8063");
		listaForms[3].setCurso("Computação");
		
		for (int i = 0; i < listaForms.length; i++) {
			System.out.println("Em qual formato gostaria, Console ou Arquivo.txt ??");
			System.out.println("1. Console");
			System.out.println("2. Arquivo.txt");
			escolha = sc.nextInt();
			
			if(escolha == 1) {
				listaForms[i].flush(listaForms[i], Out.CONSOLE);

			}else {
				listaForms[i].flush(listaForms[i], Out.ARQUIVO_DE_TEXTO);
			}
		}
		sc.close();
	}
}
