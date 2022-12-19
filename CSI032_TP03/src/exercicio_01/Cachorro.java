package exercicio_01;

public class Cachorro extends Animal {
	
	private String raca;
	
	
	public Cachorro(String nome) {
		super(nome);
	}
	public String getRaca() {
		return this.raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	@Override
	public String toString() {
		String str;
		str = super.toString();
		str += "\nRaça: " + raca;
		return str;
	}
}
