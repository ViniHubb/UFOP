package exercicio_02;

public class App {
	
	public static void main(String[] args) {
		
		CartaoWeb cartao[] = new CartaoWeb[3];
		cartao[0] = new DiaDosNamorados("Fulana");
		cartao[1] = new Natal("Ciclana");
		cartao[2] = new Aniversario("Beltrana");
		
		for (int j = 0; j < cartao.length; j++) {
			cartao[j].showMessage();
		}
	}
}
