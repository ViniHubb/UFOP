package exercicio_02;

public class IncrementalSingleton {
	private static IncrementalSingleton instance;
	private static int count = 0;
	private int numero;
	
	private IncrementalSingleton() {
		numero = ++count;
	}
	
	public static IncrementalSingleton criador() {
		if(instance == null) {
			instance = new IncrementalSingleton();
		}
		return instance;
	}
	
	@Override
	public String toString() {
		return "Incremental " + numero;
	}
}
