package exercicio_02;

public class Cliente extends Pessoa{
	
	private double valorDivida;
	private int anoNasc;
	
	public double getValorDivida() {
		return this.valorDivida;
	}
	public void setValorDivida(double divida) {
		this.valorDivida = divida;
	}
	public int getAnoNascimento() {
		return this.anoNasc;
	}
	public void setAnoNascimento(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	public void criaCliente() {
		super.criaPessoa();
		System.out.print("Valor da divida: ");
		this.valorDivida = sc.nextDouble();
		sc.nextLine();
		System.out.print("Ano que nasceu: ");
		this.anoNasc = sc.nextInt();
		sc.nextLine();
	}
	@Override
	public String toString() {
		String str;
		str = super.toString();
		str += "\nValor da divida: $";
		str += this.valorDivida;
		str += "\nAno que nasceu: ";
		str += this.anoNasc;
		str += "\n==========================";
		return str;
	}
}
