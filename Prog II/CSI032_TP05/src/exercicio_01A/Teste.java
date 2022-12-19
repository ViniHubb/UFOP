package exercicio_01A;

import java.util.HashSet;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> lista = new HashSet<>();
		
		String nome;
		int escolha;
		
		System.out.println("Escreva os nomes da lista, quando terminar digite \"sair\"");
		
		do {
			nome = sc.nextLine();
			if(!nome.equals("sair")) {
				lista.add(nome);
			}
		}while(!nome.equals("sair"));
				
		do {
			System.out.println("\nO que deseja agora?");
			System.out.println("1. Remover nome");
			System.out.println("2. Verificar nome na lista");
			System.out.println("3. Limapr lista");
			System.out.println("4. Sair");
		
			escolha = sc.nextInt();
			
			switch (escolha){
				case 1:
					System.out.println("Qual? ");
					nome = sc.next();
					lista.remove(nome);
					break;
				case 2:
					System.out.println("Qual? ");
					nome = sc.next();
					if(lista.contains(nome))
						System.out.println("Sim está na lista");
					else
						System.out.println("Não está na lista");
					break;
				case 3:
					lista.clear();
					break;
				default:
					escolha = 4;
			}
			
		}while(escolha != 4);
		
		sc.close();
		
		System.out.println(lista);
	}
}
