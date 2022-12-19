package exercicio_02;

import java.util.Scanner;

public class Pessoa {
	private String nome;
	private String sexo;
	private int idade;
	
	Scanner sc = new Scanner(System.in);
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	protected void criaPessoa() {
		System.out.println("\nInforme os dados a seguir");
		System.out.print("Nome: "); 
		this.nome = sc.nextLine();
		System.out.print("Sexo: ");
		this.sexo = sc.nextLine();
		System.out.print("Idade: ");
		this.idade = sc.nextInt();
		sc.nextLine();
	}
	@Override
	public String toString() {
		String str;
		str = "Nome: ";
		str += nome;
		str += "\nSexo: ";
		str += sexo;
		str += "\nIdade: ";
		str += idade;
		return str;
	}
}
