package exercicio_07;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		
		SomadorExistente se = new SomadorExistente();
		
		List<Integer> ls = new ArrayList<Integer>();
		
		for (int i = 1; i < 10; i++) {
			ls.add(i);
		}
		
		System.out.println("SomadorExistente \nResultado: " + se.somaLista(ls));
		
		Adaptador adp = new Adaptador();
		
		Cliente cl = new Cliente(adp);
		
		System.out.println("\nSomador esperado");
		cl.executar();
		
	}
}
