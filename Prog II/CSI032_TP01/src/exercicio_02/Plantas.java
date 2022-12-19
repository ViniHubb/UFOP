package exercicio_02;

public class Plantas {
	
	public String[] nome = new String[50] ;
	public int[] stq = new int[50];
	public int[] stqideal = new int[50];
	
	public void setNome(String nome, int cnt) {
		this.nome[cnt] = nome;
	}
	public void getNome(int cnt) {
		System.out.println(nome[cnt]);
	}
	public void setStq(int stq, int cnt) {
		this.stq[cnt] = stq;
	}
	public void getStq(int cnt) {
		System.out.println(stq[cnt]);
	}
	public void setStqIdeal(int stqideal, int cnt) {
		this.stqideal[cnt] = stqideal;
	}
	public void getStqIdeal(int cnt) {
		System.out.println(stqideal[cnt]);
	}
	public int getVerificar(int cnt) {
		int[] compra = new int[50];
		compra[cnt] = (stqideal[cnt] - stq[cnt]);
		return compra[cnt];
	}
	public void getCompra(int cnt) {
		int[] compra = new int[50];
		compra[cnt] = (stqideal[cnt] - stq[cnt]);
		if (compra[cnt] != 0) {
			System.out.printf("%d", compra[cnt]);
		}
	}
	
	public void getTabela(int cnt) {
		getVerificar(cnt);
		if (getVerificar(cnt) != 0) {
			System.out.printf(" Nome: ");
			getNome(cnt);
			System.out.printf(" Comprar: ");
			getCompra(cnt);
		}
	}
}
