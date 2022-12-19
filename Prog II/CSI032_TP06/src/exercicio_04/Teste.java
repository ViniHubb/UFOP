package exercicio_04;

public class Teste {
	public static void main(String[] args) {
		
		Sanduiches sanduba;
		
		System.out.println("===================");
		sanduba = FabricaSanduiche.cozinhar("CG");
		System.out.println(sanduba);
		sanduba = FabricaSanduiche.cozinhar("JP");
		System.out.println(sanduba);
		sanduba = FabricaSanduiche.cozinhar("RT");
		System.out.println(sanduba);
		
	}
}
