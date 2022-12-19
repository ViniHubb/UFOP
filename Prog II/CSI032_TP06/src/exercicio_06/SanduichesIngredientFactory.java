 package exercicio_06;

public abstract class SanduichesIngredientFactory implements PaoIF, PresuntoIF, QueijoIF, SaladaIF{
	
	@Override
	public abstract String pao();

	@Override
	public abstract String presunto();

	@Override
	public abstract String queijo();

	@Override
	public abstract boolean salada();
	
	@Override
	public String toString() {
		return "Pao: " + pao() +
				"\nPresunto: " + presunto() +
				"\nQueijo: " + queijo() + 
				"\nSalada: " + salada();
	}
	
}
