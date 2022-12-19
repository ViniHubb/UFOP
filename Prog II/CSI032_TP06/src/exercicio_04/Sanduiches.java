package exercicio_04;

public abstract class Sanduiches {
	String pao;
	String queijo;
	String presunto;
	boolean salada;
	
	public Sanduiches(String pao, String queijo, String presunto, boolean salada) {
		this.pao = pao;
		this.queijo = queijo;
		this.presunto = presunto;
		this.salada = salada;
	}
	
	public String boolSalada() {
		if(this.salada)
			return "Sim";
		else
			return "N�o";
	}
	
	@Override
	public String toString() {
		return "P�o: " + this.pao +
			   "\nQueijo: " + this.queijo +
			   "\nPresunto: " + this.presunto +
			   "\nSalada : " + boolSalada() +
			   "\n===================";
	}
}
