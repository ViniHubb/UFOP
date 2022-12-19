package exercicio_07;

public class Invoice {
	
	private int numeral;
	private String descricao;
	private int comprados;
	private double valor;
	
	Invoice(){
//		System.out.println("Criando...");
	}
	public void setNumeral(int numeral){
		this.numeral = numeral;
	}
	public void getNumeral() {
		System.out.println(numeral);
	}
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	public void getDescricao() {
		System.out.println(descricao);
	}
	public void setComprados(int comprados){
		this.comprados = comprados;
	}
	public void getComprados() {
		System.out.println(comprados);
	}
	public void setValor(double valor){
		this.valor = valor;
	}
	public void getValor() {
		System.out.println(valor);
	}
	
	public double getInvoiceAmount() {
		return (valor*comprados);
	}
}
