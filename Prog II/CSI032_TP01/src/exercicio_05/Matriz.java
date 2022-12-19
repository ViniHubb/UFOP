package exercicio_05;

public class Matriz {
	public static void main(String[] args) {
		
		int matriz[][] = { { 1,2,3 }, { 4,5,6 }, { 7,8,9 } };
		int i, j;
		
		Girar gr = new Girar();
		
		System.out.print("=======\n");
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				System.out.print(" " + matriz[i][j]);
			}
			System.out.print("\n");
		}
		System.out.print("===========\n");
		
		System.out.print("Girando 90° \n");
		gr.girar(matriz);
	}
}
