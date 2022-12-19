package exercicio_03;

public class Circulo extends Formas{
	public Circulo() {
		super(1);
	}
	public void desenhar() {
		System.out.println("Circulo, " + super.lados + " lado");
	}
}
