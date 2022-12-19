package exercicio_03;

public class Teste {
	public static void main(String[] args) {
		
		for (int i = 1; i < 6; i++) {
			Formas forma = FabricaFormas.cria(i);
			forma.desenhar();
		}
	}
}
