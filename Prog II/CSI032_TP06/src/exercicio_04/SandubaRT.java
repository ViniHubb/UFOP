package exercicio_04;

public class SandubaRT extends Sanduiches{

	public SandubaRT(String pao, String queijo, String presunto, boolean salada) {
		super(pao, queijo, presunto, salada);
	}
	@Override
	public String toString() {
		return "Sanduiche do RT\n" + super.toString();
	}
}
