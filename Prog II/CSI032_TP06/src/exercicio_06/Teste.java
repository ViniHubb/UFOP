package exercicio_06;

public class Teste {
	public static void main(String[] args) {
		
		SanduichesIngredientFactory cozinha;
		
		cozinha = new SanduichesIngredientFactoryCG();
		System.out.println("====================");
		System.out.println(cozinha);
		System.out.println("====================");
		
		cozinha = new SanduichesIngredientFactoryJP();
		System.out.println("====================");
		System.out.println(cozinha);
		System.out.println("====================");
		
		cozinha = new SanduichesIngredientFactoryRT();
		System.out.println("====================");
		System.out.println(cozinha);
		System.out.println("====================");
	}
}