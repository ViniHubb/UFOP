package exercicio_06;

public class SanduichesIngredientFactoryJP extends SanduichesIngredientFactory{
	
	@Override
	public String pao() {
		return "Francês";
	}

	@Override
	public String presunto() {
		return "De frango";
	}

	@Override
	public String queijo() {
		return "Mussarela";
	}

	@Override
	public boolean salada() {
		return true;
	}
	
	public String toString() {
		return "Sanduiche JP\n" + super.toString();
	}
}
