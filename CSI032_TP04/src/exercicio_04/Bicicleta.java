package exercicio_04;

public class Bicicleta extends Veiculo{

	@Override
	public void listarVerificacoes() {
		System.out.println(" Verificando a Bike..."
				+ "\n Rodas ok"
				+ "\n Freios ok"
				+ "\n Corrente ok");
	}

	@Override
	public void ajustar() {
		System.out.println(" Ajustando a Bike..."
				+ "\n Bike ajustada");

	}

	@Override
	public void limpar() {
		System.out.println(" Um banho na Bike agora"
				+ "\n Bike limpinha");

	}

}
