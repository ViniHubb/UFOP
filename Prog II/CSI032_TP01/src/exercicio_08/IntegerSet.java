package exercicio_08;

import java.util.Scanner;

public class IntegerSet {
	
	boolean x[] = new boolean[10]; // (0 a 2)
	boolean y[] = new boolean[10]; // (0 a 5)
	boolean z[] = new boolean[10]; // (0 a 10)
	
	Scanner sc = new Scanner(System.in);
	
	int cnt = 0;
	int contaX;
	int contaY;
	int contaZ;
	
	public IntegerSet() {
		for (cnt = 0; cnt < 10; cnt++) {
			x[cnt] = false;
			y[cnt] = false;
			z[cnt] = false;
		}
	}
	public void setX(int x) {
		if (x >= 0 && x <= 2) {
			this.x[contaX] = true;
			contaX++;
		}else {
			this.x[contaX] = false;
			contaX++;
		}
	}
	public void setY(int y) {
		if (y >= 0 && y <= 5) {
			this.y[contaY] = true;
			contaY++;
		}else {
			this.y[contaY] = false;
			contaY++;
		}
	}
	public void setZ(int z) {
		if (z >= 0 && z <= 10) {
			this.z[contaZ] = true;
			contaZ++;
		}else {
			this.z[contaZ] = false;
			contaZ++;
		};
	}
	public void casoSim() {
		String xyz;
		
		System.out.println("Em qual conjunto?");
		System.out.println("X (0 a 2)");
		System.out.println("Y (0 a 5)");
		System.out.println("Z (0 a 10)");
		xyz = sc.next();
		System.out.println("Qual valor?");
		
		switch (xyz) {
			case "x":
				setX(sc.nextInt());
				break;
			case "y":
				setY(sc.nextInt());
				break;
			case "z":
				setZ(sc.nextInt());
				break;
		}
		System.out.println("Deseja inserir outro número? (s/n)");
	}
	public boolean verBooleans(String xyz, int cnt) {
		if (xyz.equals("x")) {
			return x[cnt];
		}
		else if (xyz.equals("y")) {
			return y[cnt];
		}
		else if (xyz.equals("z")) {
			return z[cnt];
		}
		else {
			return false;
		}
	}
	public void deletConj(String xyz) {
		for (cnt = 0; cnt < 10; cnt++) {
			if (xyz.equals("x")) {
				x[cnt] = false;
				contaX = 0;
			}
			if (xyz.equals("y")) {
				y[cnt] = false;	
				contaY = 0;
			}
			if (xyz.equals("z")) {
				z[cnt] = false;
				contaZ = 0;
			}
		}
	}
}
