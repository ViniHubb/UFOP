package exercicio_01;

public class Unica {
	
	private static Unica instance;
	
	private String nome;
	private int idade;
	
	private Unica() {
	}
	
	public static Unica conexao() {
		if(instance == null) {
			instance = new Unica();
		}
		return instance;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
