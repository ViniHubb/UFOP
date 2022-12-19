package exercicio_04;

public class Calcular {
	public void total(int[][] tab) {
		
		int i, j;
		int mnsl, anl; mnsl = anl = 0;
		
		System.out.print("================\n");
		for (i = 0; i < 12; i++) {
			mnsl = 0;
			for(j = 0; j < 4; j++) {
				mnsl += tab[i][j];
			}
			System.out.print(" " + (i+1) + "° mês = ");
			System.out.print("R$" + mnsl + "\n");
		}
		System.out.print("======================\n");
		
		for (i = 0; i < 12; i++) {
			for(j = 0; j < 4; j++) {
				anl += tab[i][j];
			}
		}
		System.out.print(" Total no ano R$" + anl);
		System.out.print("\n======================");
	}
}
