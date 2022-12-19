package exercicio_04;

public class Test {
	public static void main(String args[]){
		
		Oficina ofice = new Oficina();
		Veiculo v;
		
		System.out.println("\tBem vindo a oficina do tonho\n");
		
		for (int i = 0; i < 4; i++) {
			v = ofice.proximo();
			ofice.manutencao(v);
		}
		System.out.println("########################");
	}
}
