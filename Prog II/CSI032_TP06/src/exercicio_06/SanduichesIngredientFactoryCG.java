package exercicio_06;

public class SanduichesIngredientFactoryCG extends SanduichesIngredientFactory{
	
	@Override
	public String pao() {
		return "Integral";
	}

	@Override
	public String presunto() {
		return "De Frango";
	}

	@Override
	public String queijo() {
		return "Prato";
	}

	@Override
	public boolean salada() {
		return false;
	}
	
	public String toString() {
		return "Sanduiche CG\n" + super.toString();
	}
}
