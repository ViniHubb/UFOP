package exercicio_03;

public class Triangulo extends Formas{
	public Triangulo() {
		super(3);
	}
	public void desenhar() {
		System.out.println("Triangulo, " + super.lados + " lados");
	}
}
