package exercicio_02;

public class DiaDosNamorados extends CartaoWeb {
	public DiaDosNamorados(String destinatario) {
		super.setDestina(destinatario);
	}
	
	@Override
	public void showMessage() {
		System.out.println(super.getDestina() + ",\n"
				+ "Você inspira um amor dentro de mim que eu achei que fosse impossível.\r\n"
				+ "Eu espero pela noite para te ter comigo.\r\n"
				+ "Eu tenho sorte de ter você comigo hoje, amanhã e para sempre.\r\n"
				+ "Você faz o meu coração acelerar e meus lábios formarem um sorriso frouxo.\r\n"
				+ "Existe um milhão de razões pelas quais eu te amo e eu não sei nem por onde começar.\n\n");
	}
}
