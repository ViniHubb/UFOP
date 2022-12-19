package exercicio_04;

public class SandubaJP extends Sanduiches{

	public SandubaJP(String pao, String queijo, String presunto, boolean salada) {
		super(pao, queijo, presunto, salada);
	}
	@Override
	public String toString() {
		return "Sanduiche do JP\n" + super.toString();
	}
}
