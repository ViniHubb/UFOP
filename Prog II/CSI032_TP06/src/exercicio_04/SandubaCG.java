package exercicio_04;

public class SandubaCG extends Sanduiches{	
	
	public SandubaCG(String pao, String queijo, String presunto, boolean salada) {
		super(pao, queijo, presunto, salada);
	}
	@Override
	public String toString() {
		return "Sanduiche do CG\n" + super.toString();
	}
}
