package exercicio_02;

public class Empregado extends Pessoa{
	
	private double salario;
	private String matricula;
	
	public double valorInss(){
		return Math.round(salario * 0.11);
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	protected void criaEmpregado() {
		super.criaPessoa();
		System.out.print("Salário: ");
		this.salario = sc.nextInt();
		sc.nextLine();
		System.out.print("Matrícula: ");
		this.matricula = sc.nextLine();
	}
	@Override
	public String toString() {
		String str;
		str = super.toString();
		str += "\nMatricula: ";
		str += matricula;
		str += "\nSalario: $";
		str += salario;
		str += "\nValor do INSS: $";
		str += valorInss();
		return str;
	}
}
