package exercicio_02;

public class Natal extends CartaoWeb{
	public Natal(String destinatario) {
		super.setDestina(destinatario);
	}
	
	@Override
	public void showMessage() {
		System.out.println(super.getDestina() + ",\n"
				+ "Desejo que a magia do Natal te fa�a relembrar a pureza e inoc�ncia da sua inf�ncia, e que encha a sua vida de f�, amor e esperan�a. Feliz Natal!!\n\n");
	}
}
