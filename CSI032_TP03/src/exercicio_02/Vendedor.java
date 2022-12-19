package exercicio_02;

public class Vendedor extends Empregado{
	
	private double valorVendas;
	private int qntVendas;
	
	public double getValorVendas(){
		return this.valorVendas;
	}
	public void setValorVendas(double valorVendas){
		this.valorVendas = valorVendas;
	}
	public int getQntVendas(){
		return this.qntVendas;
	}
	public void setQntVendas(int qntVendas){
		this.qntVendas = qntVendas;
	}
	public void criaVendedor() {
		super.criaEmpregado();
		System.out.print("Quantidade vendida: ");
		this.qntVendas = sc.nextInt();
		sc.nextLine();
	}
	@Override
	public String toString() {
		String str;
		str = super.toString();
		str += "\nQuantidade vendida: ";
		str += this.qntVendas;
		str += "\n==========================";
		return str;
	}
}
