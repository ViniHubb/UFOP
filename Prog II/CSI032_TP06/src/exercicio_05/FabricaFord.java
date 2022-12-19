package exercicio_05;

public class FabricaFord {
	
	private static CarroSedan instanceSed;
	private static CarroPopular instancePop;
	
	private FabricaFord() { }
	
	public static CarroSedan criarCarroSedan() {
		instanceSed = new FiestaSedan();
		return instanceSed;
	}
	public static CarroPopular criarCarroPopular() {
		instancePop = new Fiesta();
		return instancePop;
	}
	
}
