package exercicio_05;

public class FabricaDeCarro {
	
	private FabricaDeCarro() {
	}
	
	public static CarroSedan criarCarroSedan(String marca) {
		if(marca.equals("Fiat")) {
			return FabricaFiat.criarCarroSedan();
		}
		if(marca.equals("Ford")) {
			return FabricaFord.criarCarroSedan();
		}
		else {
			System.out.println("Não fabricamos esse tipo de carro!");
			return null;	
		}
	}
	public static CarroPopular criarCarroPopular(String marca) {
		if(marca.equals("Fiat")) {
			return FabricaFiat.criarCarroPopular();
		}
		if(marca.equals("Ford")) {
			return FabricaFord.criarCarroPopular();
		}
		else {
			System.out.println("Não fabricamos esse tipo de carro!");
			return null;	
		}
	}
	
}
