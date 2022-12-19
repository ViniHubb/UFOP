package exercicio_10;

public class NumeroFatores {
	public int numFatores(int num) {
		
		int x = 2;
		int numFat = 0;
		
		while (num > 1){ 
			if (num % x == 0) {
				num = num / x;
				x = 2;
				numFat++;
			} 
			else {
				do {
					x++;
				}while (VerificaPrimo(x) == false);
			}
		}
		return numFat;
	}
	public static boolean VerificaPrimo(int x) {
		int cont = x-1;

		while (cont > 1) {
			if (x % cont == 0) {
				return false;
			}
			cont--;
		}
		return true;
	}
	public int fatores(int num, int numFat, int cont) {
		
		int todosFatores[] = new int[numFat];
		
		int x = 2;
		int fator = 0;
		
		while (num > 1){ 
			if (num % x == 0) {
				num = num / x;
				todosFatores[fator] = x;
				x = 2;
				fator++;
			} 
			else {
				do {
					x++;
				}while (VerificaPrimo(x) == false);
			}
		}
		return todosFatores[cont];
		
	}
}
