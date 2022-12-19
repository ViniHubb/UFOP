package exercicio_07;

public class Adaptador implements SomadorEsperado{
	public int somaVetor(int[] vetor) {
		int resultado = 0;
		for (int i : vetor) resultado += i;
		return resultado;

	}
}