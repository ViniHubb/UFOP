package exercicio_01;

import java.util.Scanner;

public class Animal {

	Scanner sc = new Scanner(System.in);

	private String nome;
	private double peso;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public double getPeso(){
		return this.peso;
	}
	public void setPeso(double peso){
		this.peso = peso;
	}
		
	@Override
	public String toString() {
		return "Nome: " + nome + "\nPeso: " + peso;
	}
}
