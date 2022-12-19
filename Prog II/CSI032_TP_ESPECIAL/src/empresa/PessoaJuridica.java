package empresa;

public class PessoaJuridica extends Pessoa {
	
	int cnpj;
	boolean situacaoCadastral;
	
	public PessoaJuridica(String nome, int idade, int cnpj, boolean cad){
		super(nome, idade);
		setCnpj(cnpj);
		setSituacaoCadastral(cad);
	}

	public int getCnpj(){
		return this.cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getSituacaoCadastral(){
		if (this.situacaoCadastral) {
			return "Ativo";
		}
		else {
			return "Inativo";
		}
	}
	public void setSituacaoCadastral(boolean cad) {
		this.situacaoCadastral = cad;
	}
	
	@Override
	public String toString() {
		return "======================="
				+ "\nNome: " + getNome()
				+ "\nIdade: " + getIdade()
				+ "\nCNPJ: " + getCnpj()
				+ "\nSit. Cadastral: " + getSituacaoCadastral()
				+ "\n=======================";
	}
}
