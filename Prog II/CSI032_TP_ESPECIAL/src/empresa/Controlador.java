package empresa;

import java.io.FileOutputStream;
import java.io.IOException;

public class Controlador {
	public static void main(String[] args) throws IOException {
		
		Container c = new Container();
		
		Pessoa p[] = new Pessoa[4];
		
		p[0] = new PessoaFisica("Vinicius", 20, 80843223, true);
		p[1] = new PessoaFisica("Nanda", 22, 85494704, false);
		p[2] = new PessoaJuridica("Google", 25, 987654390, false);
		p[3] = new PessoaJuridica("Hotmart", 29, 1234567892, true);
		
		for (int i = 0; i < p.length; i++) {
			
			c.adiciona(p[i]);
			
		}
		
		FileOutputStream file = new FileOutputStream("Arquivo.txt");
		c.print(file);
		
	}
}
