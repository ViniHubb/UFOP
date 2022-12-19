package exercicio_03;

public class FabricaFormas {
	
	public static Formas instance;
	
	public static Formas cria(int lados) {
		if (lados == 1) {
			instance = new Circulo();
		}
		else if (lados == 2) {
			instance = new Reta();
		}
		else if (lados == 3) {
			instance = new Triangulo();
		}
		else if (lados == 4) {
			instance = new Quadrado();
		}
		else if (lados == 5) {
			instance = new Pentagono();
		}
		else if (lados > 5) {
			instance = new Googol();
		}
		return instance;
	}
}
