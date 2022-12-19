package exercicio_04;

public class Tabela {
	public static void main(String[] args) {
		
		Calcular tot = new Calcular();
		
		int i, j;
		
		int tab[][] = { { 1,2,3,4 }, { 5,6,7,8 }, { 9,1,2,3 }, { 4,5,6,7 }, 
						{ 1,2,3,4 }, { 5,6,7,8 }, { 9,1,2,3 }, { 4,5,6,7 }, 
						{ 1,2,3,4 }, { 5,6,7,8 }, { 9,1,2,3 }, { 4,5,6,7 } };
		
		System.out.print("===============\n");
		for (i = 0; i < 12; i++) {
			System.out.print("   ");
			for(j = 0; j < 4; j++) {
				System.out.print(" " + tab[i][j]);
			}
			System.out.print("\n");
		}
		tot.total(tab);
	}
}
