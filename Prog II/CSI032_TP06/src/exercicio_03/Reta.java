package exercicio_03;

public class Reta extends Formas{
	public Reta() {
		super(2);
	}
	public void desenhar() {
		System.out.println("Reta, " + super.lados + " lados");
	}
}
