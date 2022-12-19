package empresa;

public class PessoaFisica extends Pessoa {
	
	int cpf;
	boolean conjuge;
	
	public PessoaFisica(String nome, int idade, int cpf, boolean conjugue){
		super(nome, idade);
		setCpf(cpf);
		setConjuge(conjugue);
	}
	
	public int getCpf(){
		return this.cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String getConjuge(){
		if (this.conjuge) {
			return "Sim";
		}
		else {
			return "Não";
		}
	}
	public void setConjuge(boolean conj) {
		this.conjuge = conj;
	}
	
	@Override
	public String toString() {
		return "======================="
				+ "\nNome: " + getNome()
				+ "\nIdade: " + getIdade()
				+ "\nCPF: " + getCpf()
				+ "\nConjugue: " + getConjuge()
				+ "\n=======================";
	}
}
