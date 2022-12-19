package exercicio_04;

public class Automovel extends Veiculo{
	
	@Override
	public void listarVerificacoes() {
		System.out.println(" Verificando Automovel..."
				+ "\n Rodas ok"
				+ "\n Freios ok"
				+ "\n Combustivel ta caro!"
				+ "\n Oleo baixo");

	}
	
	@Override
	public void ajustar() {
		System.out.println(" Ajustando o Automovel...");
	}
	
	public void mudarOleo(){
		System.out.println(" Oleo trocado");
	}
	
	@Override
	public void limpar() {
		System.out.println(" Lava jato aberto..."
				+ "\n Automovel limpinho");
	}
}
