package exercicio_03;

public class Calcular {
	
	public int calcular(int n) {
		if(n == 1) {
			return n;
		}
		else if(n == 2) {
			return n;
		}
		else {
			return (2*calcular(n-1)+(3*calcular(n-2)));
		}
	}
}