package exercicio_03;

public class Quadrado extends Formas{
	public Quadrado() {
		super(4);
	}
	public void desenhar() {
		System.out.println("Quadrado, " + super.lados + " lados");
	}
}
