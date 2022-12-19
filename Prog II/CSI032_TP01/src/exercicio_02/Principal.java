package exercicio_02;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Plantas plnt = new Plantas();
		
		String nome;
		String sn = "s";
		int stq;
		int stqideal;
		int cnt = 0;
		
		while(!sn.equals("n")) {
			System.out.println("Deseja cadastrar um nova planta? (s/n)");
			sn = sc.next();
			if(sn.equals("n")) {break;}
			System.out.printf("Nome: ");
			nome = sc.next();
			plnt.setNome(nome, cnt);
			System.out.printf("Estoque ideal: ");
			stqideal = sc.nextInt();
			plnt.setStqIdeal(stqideal, cnt);
			System.out.printf("Em estoque: ");
			stq = sc.nextInt();
			plnt.setStq(stq, cnt);
			cnt++;
		}
		sc.close();
		
		cnt--;
		
		System.out.println("\nLista de Compras");
		while (cnt >= 0) {
			System.out.println("================");
			plnt.getTabela(cnt);
			cnt--;
		}
		System.out.println("\n================");
	}
}
