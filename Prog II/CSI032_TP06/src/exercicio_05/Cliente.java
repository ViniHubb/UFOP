package exercicio_05;

public class Cliente {
	public static void main(String[] args) {
		
		FabricaDeCarro.criarCarroSedan("Fiat").exibirInfoSedan();
		
		FabricaDeCarro.criarCarroSedan("Ford").exibirInfoSedan();
		
		FabricaDeCarro.criarCarroPopular("Fiat").exibirInfoPopular();
		
		FabricaDeCarro.criarCarroPopular("Fiat").exibirInfoPopular();
		
	}
}
