package empresa;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class Container {
	
	String str = "";
	
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	
	public void adiciona(Pessoa pessoa) {
		listaPessoas.add(pessoa);
	}
	
	public void flush(ArrayList<Pessoa> listaPessoas) {
		for (int i = 0; i < listaPessoas.size() ;i++) {
			str += listaPessoas.get(i).toString() + "\n";
		}
	}
	
	public void print(OutputStream out) throws IOException {
		flush(listaPessoas);
		out.write(str.getBytes());
	}
}
