package exercicio_02;

public class Natal extends CartaoWeb{
	public Natal(String destinatario) {
		super.setDestina(destinatario);
	}
	
	@Override
	public void showMessage() {
		System.out.println(super.getDestina() + ",\n"
				+ "Desejo que a magia do Natal te faça relembrar a pureza e inocência da sua infância, e que encha a sua vida de fé, amor e esperança. Feliz Natal!!\n\n");
	}
}
