
public class Cachorro {
	private int idade;
	private String nome;
	
	public Cachorro() {
		
	}
	public Cachorro(String n) {
		nome = n;
	}
	public Cachorro(String n, int i) {
		nome = n;
		idade = i;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String n) {
		nome = n;
	}
	public void getIdade(int i) {
		idade = i;
	}
}
