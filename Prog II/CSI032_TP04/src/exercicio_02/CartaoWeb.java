package exercicio_02;

public abstract class CartaoWeb {
	
	private String destinatario;
	
	public String getDestina() {
		return this.destinatario;
	}
	public void setDestina(String destina) {
		this.destinatario = destina;
	}
	
	public void showMessage() {
		System.out.println("Cartão Generico!\n");
	}
}
