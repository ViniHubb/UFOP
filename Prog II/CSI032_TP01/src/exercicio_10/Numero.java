package exercicio_10;

import java.util.Scanner;

public class Numero {
	
	public static void main(String[] args) {
		
		int num;
		int cont;
		int fator;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num = sc.nextInt();
		sc.close();
		
		NumeroFatores numFat = new NumeroFatores();
		
		System.out.println("================================");
		System.out.println("Este número tem " + numFat.numFatores(num) + " fatores primos");
		System.out.println("Sendo eles: ");
		for (cont = 0; cont < numFat.numFatores(num); cont++) {
			fator = numFat.fatores(num, numFat.numFatores(num), cont);
			System.out.print("|" + fator);
		}
		System.out.println("|\n================================");
	}
}
