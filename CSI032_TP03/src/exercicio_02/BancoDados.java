package exercicio_02;

public class BancoDados {
	
	public void bancoDados(Gerente ger[], Vendedor ven[], Cliente cli[]) {
		
		System.out.println("\n==========================");
		System.out.println("         GERENTES         ");
		
		if(ger[0].getNome() != null) {
			System.out.println("==========================");
			for (int i = 0; i < ger.length; i++) {
				if(ger[i].getNome() != null) {
					System.out.println(ger[i]);
				}
			}
		}
		else { 
			System.out.println("       SEM REGISTRO       ");
			System.out.println("==========================");
		}
		System.out.println("==========================");
		System.out.println("        VENDEDORES        ");
		
		if(ven[0].getNome() != null) {
			System.out.println("==========================");
			for (int i = 0; i < ven.length; i++) {
				if(ven[i].getNome() != null) {
					System.out.println(ven[i]);
				}
			}
		}
		else { 
			System.out.println("       SEM REGISTRO       ");
			System.out.println("==========================");
		}		
		System.out.println("==========================");
		System.out.println("         CLIENTES         ");
		
		if(cli[0].getNome() != null) {
			System.out.println("==========================");
			for (int i = 0; i < cli.length; i++) {
				if(cli[i].getNome() != null) {
					System.out.println(cli[i]);
				}
			}
		}
		else { 
			System.out.println("       SEM REGISTRO       ");
			System.out.println("==========================");
		}
		System.out.println("==========================");
	}
}
