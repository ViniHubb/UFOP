package exercicio_03;

import java.util.Scanner;

public class Funcao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calcular calc = new Calcular();
		
		int n = 0;
		int resu;
		
		System.out.printf("Escolha um valor: ");
		n = sc.nextInt();
		
		sc.close();
		
		resu = calc.calcular(n);
		System.out.println("===========================\n");
		System.out.println("  O valor de F(" + n + ") é " + resu);
		System.out.println("\n===========================");
	}
}
