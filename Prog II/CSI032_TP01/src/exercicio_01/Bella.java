package exercicio_01;

import java.util.Scanner;

public class Bella {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float[] valor = new float[5];
		
		System.out.println("Sempre Bela\n");
		System.out.println("Digite o valor arrecadado");
		for (int cnt = 0; cnt < 5; cnt++) {
			System.out.printf("Funcionaria %d: ", cnt+1);
			valor[cnt] = sc.nextFloat();
		}
		sc.close();
		
		for (int cnt = 0; cnt < 5; cnt++) {
			System.out.printf("\nO valor a ser repassado para a %d° funcionaria é de R$%.2f", cnt+1, valor[cnt]/2);
		}
	}
}