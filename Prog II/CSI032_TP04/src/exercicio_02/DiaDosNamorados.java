package exercicio_02;

public class DiaDosNamorados extends CartaoWeb {
	public DiaDosNamorados(String destinatario) {
		super.setDestina(destinatario);
	}
	
	@Override
	public void showMessage() {
		System.out.println(super.getDestina() + ",\n"
				+ "Voc� inspira um amor dentro de mim que eu achei que fosse imposs�vel.\r\n"
				+ "Eu espero pela noite para te ter comigo.\r\n"
				+ "Eu tenho sorte de ter voc� comigo hoje, amanh� e para sempre.\r\n"
				+ "Voc� faz o meu cora��o acelerar e meus l�bios formarem um sorriso frouxo.\r\n"
				+ "Existe um milh�o de raz�es pelas quais eu te amo e eu n�o sei nem por onde come�ar.\n\n");
	}
}
