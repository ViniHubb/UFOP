package exercicio_05;

public class Girar {
	public void girar(int[][] matriz) {
		
		int i, j;
		
		System.out.print("===========\n");
		for(i = 0; i < 3; i++) {
			for(j = 2; j >= 0; j--) {
				System.out.print(" " + matriz[j][i]);
			}
			System.out.print("\n");
		}
		System.out.print("=======\n");
	}
}
