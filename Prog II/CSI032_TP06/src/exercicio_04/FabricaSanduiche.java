package exercicio_04;

public class FabricaSanduiche {
	
	public static Sanduiches instance; 
	
	public static Sanduiches cozinhar(String lanchonete) {
		if(lanchonete == "CG") {
			instance = new SandubaCG("Integral", "Prato", "Frango", false);
		}
		if(lanchonete == "JP") {
			instance = new SandubaJP("Frances", "Mussarela", "Frango", true);
		}
		if(lanchonete == "RT") {
			instance = new SandubaRT("Bola", "Cheddar", "Peru", false);
		}
	
		return instance;
	}
}
