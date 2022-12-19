package exercicio_03;

public class Number {
	public int membro;
	
	public Number(int numero) {
		setValue(numero);
	}

	public int getValue() {
		return this.membro;
	}
	public void setValue(int numero) {
		this.membro = numero;
	}
	
	public boolean compara(int numero) {
		if(this.membro == numero) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean equals(Object o){
		if (o == this){
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean equals(int num){
		if (num == this.membro){
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode(){
		return 404;
	}

	@Override
	public String toString() {
		return "ToString: Aqui podemos ver que eu posso substituir a saida padrão toString por qualquer texto.";
	}
}
