package exercicio_08;

import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		IntegerSet inter = new IntegerSet();
		
		int quest = 7;
		int cnt;
		int stop = 1;
		String xyz;
		String sn = "s";
		
		System.out.println("Deseja inserir um número? (s/n)");
		sn = sc.next();
		do {
			
			if (sn.equals("s")) {
				inter.casoSim();
				sn = sc.next();
			}
			if (!sn.equals("s")){
				System.out.println("\nO que deseja fazer?");
				System.out.println("1 Ver o boolean dos conjuntos");
				System.out.println("2 Deletar um cojunto");
				System.out.println("3 Adicionar um numero");
				System.out.println("4 Sair");
				quest = sc.nextInt();
				
				switch (quest) {
					case 1:
						System.out.println("X Y ou Z ?");
						xyz = sc.next();
						for (cnt = 0; cnt < 10; cnt++) {
							System.out.print("|" + inter.verBooleans(xyz, cnt));
						}
						System.out.print("|\n");
						break;
					case 2:
						System.out.println("X Y ou Z ?");
						inter.deletConj(sc.next());
						break;
					case 3:
						sn = "s";
						break;
					case 4:
						stop = 0;
						break;
				}
			}
		} while (stop == 1);

		sc.close();
	}
}
