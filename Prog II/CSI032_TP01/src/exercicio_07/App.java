package exercicio_07;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		int i = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas entradas? ");
		num = sc.nextInt();
		
		Invoice inv[] = new Invoice[num];		
		
		for (i = 0; i < inv.length; i++) {
			inv[i] = new Invoice();
		}
		
		for (i = 0; i < inv.length; i++) {
			System.out.print("=================\n");
			System.out.print("Descrição: ");
			inv[i].setDescricao(sc.next());
			System.out.print("Numeral: ");
			inv[i].setNumeral(sc.nextInt());
			System.out.print("Valor: ");
			inv[i].setValor(sc.nextDouble());
			System.out.print("Quantidade: ");
			inv[i].setComprados(sc.nextInt());
		}
		System.out.print("=====================\n");
		
		for (i = 0; i < inv.length; i++) {
			System.out.print("A fatura do produto "); inv[i].getNumeral();
			System.out.print("\t" + inv[i].getInvoiceAmount());
			System.out.print("\n");
			System.out.print("=====================\n");
		}
	}
}
