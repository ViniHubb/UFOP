package exercicio_04;

import java.util.Random;

public class Oficina{
	
	Random rand = new Random();
	Veiculo v;
	
	public Veiculo proximo() {
		if(rand.nextInt(2) == 1) {
			v = new Bicicleta();
		}
		else {
			v = new Automovel();
		}
		return v;
	}
	
	public void manutencao(Veiculo v) {
		System.out.println("########################");
		System.out.println("      ANALISANDO...\n");
		v.listarVerificacoes();
		System.out.println("------------------------");
		v.ajustar();
		if(v.getClass().toString().equals("class exercicio_04.Automovel")) {
			((Automovel)v).mudarOleo();
		}
		System.out.println("------------------------");
		v.limpar();
		System.out.println("\n      Volte sempre!");
		
	}
}
