package exercicio_01B;

import java.util.HashSet;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<Produtos> lista = new HashSet<>();
		
		Produtos produto;
		
		String nome;
		double preco;
		double id;
		boolean bi;
		
		System.out.println("Cadastre os produtos da lista, quando terminar digite o nome \"sair\"");
		
		do {
			bi = false;
			
			System.out.print("Nome: ");
			nome = sc.next();
			
			if(nome.equals("sair"))
				break;
			
			System.out.print("Preço: ");
			preco = sc.nextDouble();
			
			System.out.print("ID: ");
			id = sc.nextDouble();
			
			produto = new Produtos(nome, preco, id);
			
			for(Produtos analise : lista) {
				if(analise.equals(produto)) {
					bi = true;
				}
			}
			
			if(bi) {
				System.out.println("Esse produto ja foi adicinado");
			}else {	
				lista.add(produto);
			}
			
		}while(!nome.equals("sair"));
		
		sc.close();
		System.out.print("======================");
		System.out.println(lista);
	}
	
}
