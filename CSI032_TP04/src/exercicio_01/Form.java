package exercicio_01;

public class Form implements Container{
	private String nome;
	private String matricula;
	private String curso;
	
	public Form(String nome) {
		this.setNome(nome);
	}
	
	public String getNome() {
		return this.nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return this.curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public void print(Out o) {
		if (o == Out.ARQUIVO_DE_TEXTO) {
			flush(this, o);
		}
		if (o == Out.CONSOLE) {
			flush(this, o);
		}
	}

	@Override
	public void flush(Form f, Out o) {
		if (o == Out.ARQUIVO_DE_TEXTO) {
			System.err.println("Os Forms foram gravados com sucesso em \"d:\\ListaDeFOrularios.txt\".\n");
		}
		if (o == Out.CONSOLE) {
			System.out.println("======================");
			System.out.println(" Nome: " + this.getNome());
			System.out.println(" Matricula: " + this.getMatricula());
			System.out.println(" Curso: " + this.getCurso());
			System.out.println("======================\n");
		}
		
	}
}
