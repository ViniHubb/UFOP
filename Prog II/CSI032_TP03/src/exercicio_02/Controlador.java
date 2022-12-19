package exercicio_02;

import java.util.Scanner;

public class Controlador {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		BancoDados bd = new BancoDados();
		Gerente ger[] = new Gerente[10];
		Vendedor ven[] = new Vendedor[10];
		Cliente cli[] = new Cliente[10];
		for (int i = 0; i < 10; i++) {
			ger[i] = new Gerente();
			ven[i] = new Vendedor();
			cli[i] = new Cliente();
		}
		int desejo;
		int tipo;
		int numGer, numVen, numCli; numGer = numVen = numCli = 0;
		
		do {
			System.out.println("\nO que deseja fazer?");
			System.out.println("1. Ver o banco de dados \n2. Registrar uma pessoa \n3. Sair");
			desejo = sc.nextInt();
			sc.nextLine();
			
			if(desejo == 1) {
				bd.bancoDados(ger, ven, cli);
			}
			else if(desejo == 2) {
				System.out.println("\nQual tipo de pessoa?");
				System.out.println("1. Gerente \n2. Vendedor \n3. Cliente");
				tipo = sc.nextInt();
				sc.nextLine();
				if(tipo == 1) {
					ger[numGer].criaGerente();
					numGer++;
				}
				else if(tipo == 2) {
					ven[numVen].criaVendedor();
					numVen++;
				}
				else if(tipo == 3) {
					cli[numCli].criaCliente();
					numCli++;
				}
			}
			
		} while(desejo != 3);
			
		sc.close();
	}
}
