package exercicio_01;

public class Peixe extends Animal {
	
	private String tipoHabitat;
	
	public Peixe(String nome) {
		super(nome);
	}
	
	public String getRaca() {
		return this.tipoHabitat;
	}
	public void setHbitat(String habitat) {
		this.tipoHabitat = habitat;
	}
	@Override
	public String toString() {
		String str;
		str = super.toString();
		str += "\nHabitat: " + tipoHabitat;
		return str;
	}
}
