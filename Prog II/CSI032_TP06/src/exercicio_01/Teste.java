package exercicio_01;

public class Teste {
	public static void main(String[] args) {
		
		Unica um = Unica.conexao();
		Unica dois = Unica.conexao();
		
		System.out.println("Objeto \"um\" e objeto \"dois\" s�o iguais?");
		System.out.println(um.equals(dois));
	}
}
