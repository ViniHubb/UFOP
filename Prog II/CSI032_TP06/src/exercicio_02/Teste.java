package exercicio_02;

public class Teste {
	public static void main(String[] args) {

		System.out.println("Sem Singleton\n");
		for (int i = 0; i < 10; i++) {
			
			Incremental inc = new Incremental();
			System.out.println(inc);
			
		}
		
		System.out.println("\n========================\n");
		
		System.out.println("Com Singleton\n");
		for (int j = 0; j < 10; j++) {
			
			IncrementalSingleton incSingle = IncrementalSingleton.criador();
			System.out.println(incSingle);
			
		}
	}
}
