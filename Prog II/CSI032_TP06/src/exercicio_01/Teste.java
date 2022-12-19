package exercicio_01;

public class Teste {
	public static void main(String[] args) {
		
		Unica um = Unica.conexao();
		Unica dois = Unica.conexao();
		
		System.out.println("Objeto \"um\" e objeto \"dois\" são iguais?");
		System.out.println(um.equals(dois));
	}
}
