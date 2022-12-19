package empresa;

public abstract class Pessoa {
	String nome;
	int idade;
	
	public Pessoa(String nome, int idade){
		setNome(nome);
		setIdade(idade);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	protected void setNome(String nome){
		this.nome = nome;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
}
