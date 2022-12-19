package exercicio_03;

public class App {
	public static void main(String[] args) {
		
		Number num1 = new Number(11);

		Number num2 = new Number(22);
		
		System.out.println(num1 + "\n");
		
		System.out.println("O valor armazenado no objeto num1 �: " + num1.getValue() + "\n");
		System.out.println("O valor armazenado no objeto num2 �: " + num2.getValue() + "\n");
		
		System.out.println("Aqui podemos ver que o hash code foi alterado para " + num1.hashCode() + " portanto qulquer objeto Number criado ter� esse mesmo hash code\n");
		
		System.out.println("Aqui verificamos se a referencia dos objetos s�o iguais utilizando o m�todo 'equals(Object o)' sobrescrito: " + num1.equals(num2) + "\n");
		
		System.out.println("Para verificarmos se os valores dos membros s�o iguais temos que utilizar da sobrecarga do m�todo equals() pois ele nativamente n�o compara inteiros\n"
				+ "logo quando usamos a fun��o 'equals(int num)' obtemos: " + num1.equals(num2.getValue()));
	}
}
