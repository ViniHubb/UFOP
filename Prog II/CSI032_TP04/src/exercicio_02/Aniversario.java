package exercicio_02;

public class Aniversario extends CartaoWeb{
	public Aniversario(String destinatario) {
		super.setDestina(destinatario);
	}
	
	@Override
	public void showMessage() {
		System.out.println(super.getDestina() + ",\n"
				+ "Felicidades! Desejo que todas as suas buscas cheguem aos seus objetivos, e que consiga ser mais feliz do que é hoje!\n"
				+ "Muito sucesso e muitas alegrias! Feliz Aniversário!\n\n");
	}
}
