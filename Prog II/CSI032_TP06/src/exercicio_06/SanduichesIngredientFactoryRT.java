package exercicio_06;

public class SanduichesIngredientFactoryRT extends SanduichesIngredientFactory{
	
	@Override
	public String pao() {
		return "Bola";
	}

	@Override
	public String presunto() {
		return "De Peru";
	}

	@Override
	public String queijo() {
		return "Cheddar";
	}

	@Override
	public boolean salada() {
		return false;
	}
	
	public String toString() {
		return "Sanduiche RT\n" + super.toString();
	}
}
