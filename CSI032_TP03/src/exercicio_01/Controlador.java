package exercicio_01;

import java.util.Scanner;

public class Controlador {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Animal animal;
		Peixe peixe;
		Cachorro cachorro;
		
		System.out.println("Olá, vamos criar um animal genérico!");
		System.out.print("Indique seu nome: ");
		animal = new Animal(sc.nextLine());
		System.out.print("Seu peso: ");
		animal.setPeso(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("\nAgora vamos criar um peixe!");
		System.out.print("Indique seu nome: ");
		peixe = new Peixe(sc.nextLine());
		System.out.print("Seu peso: ");
		peixe.setPeso(sc.nextDouble());
		sc.nextLine();
		System.out.print("E seu habitat: ");
		peixe.setHbitat(sc.nextLine());
		
		System.out.println("\nAgora vamos criar um cachorro!");
		System.out.print("Indique seu nome: ");
		cachorro = new Cachorro(sc.nextLine());
		System.out.print("Seu peso: ");
		cachorro.setPeso(sc.nextDouble());
		sc.nextLine();
		System.out.print("E sua raça: ");
		cachorro.setRaca(sc.nextLine());
		
		sc.close();
	
		System.out.println("\nVamos ver o que criamos!");
		System.out.println("=================");
		System.out.println("Animal genérico");
		System.out.println(animal);
		System.out.println("=================");
		System.out.println("Peixe");
		System.out.println(peixe);
		System.out.println("=================");
		System.out.println("Cachorro");
		System.out.println(cachorro);
		System.out.println("=================");
		
	}
}
