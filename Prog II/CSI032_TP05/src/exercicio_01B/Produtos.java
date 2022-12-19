package exercicio_01B;

public class Produtos {
	String nome;
	double preco;
	double id;
	
	public Produtos(String nome, double preco, double id) {
		this.nome = nome;
		this.preco = preco;
		this.id = id;
	}
	public Produtos() {
		
	}
	
	public String getNome() {
		return this.nome;
	}
	public double getPreco() {
		return this.preco;
	}
	public double getID() {
		return this.id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreço(double preco) {
		this.preco = preco;
	}
	public void setID(double id) {
		this.id = id;
	}
	@Override
	public String toString() {
		String str;
		str = "\nNome: " + this.getNome()
			+ "\nPreço: " + this.getPreco()
			+ "\nID: " + this.getID()
			+ "\n======================";
		return str;
	}
	@Override
	public boolean equals(Object o) {
		if(this.id == ((Produtos)o).getID())
			return true;
		else
			return false;
	}
}
