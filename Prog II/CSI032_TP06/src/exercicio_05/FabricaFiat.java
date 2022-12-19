package exercicio_05;

public class FabricaFiat{
	
	private static CarroSedan instanceSed;
	private static CarroPopular instancePop;
	
	
	private FabricaFiat() { }
	
	public static CarroSedan criarCarroSedan() {
		instanceSed = new Siena();
		return instanceSed;
	}
	public static CarroPopular criarCarroPopular() {
		instancePop = new Palio();
		return instancePop;
	}
}
