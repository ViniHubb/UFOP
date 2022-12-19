package exercicio_03;

public class Pentagono extends Formas{
	public Pentagono() {
		super(5);
	}
	public void desenhar() {
		System.out.println("Pentagono, " + super.lados + " lados");
	}
}
