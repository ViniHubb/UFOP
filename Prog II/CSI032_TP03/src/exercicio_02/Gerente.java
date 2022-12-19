package exercicio_02;

public class Gerente extends Empregado{
	
	private String nomeGerencia;
	
	public String getNomeGerencia(){
		return this.nomeGerencia;
	}
	public void setNomeGerencia(String nomeGerencia){
		this.nomeGerencia = nomeGerencia;
	}
	public void criaGerente() {
		super.criaEmpregado();
		System.out.print("Nome da gerencia: ");
		this.nomeGerencia = sc.nextLine();
	}
	@Override
	public String toString() {
		String str;
		str = super.toString();
		str += "\nNome da gerencia: ";
		str += this.nomeGerencia;
		str += "\n==========================";
		return str;
	}
}
