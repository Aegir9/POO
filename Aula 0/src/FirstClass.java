
public class FirstClass {
	public static void main(String[] args) {
		System.out.println("Inicio do programa.");
		
		Cachorro c = new Cachorro();
		c.idade = 10;
		c.nome = "Billy";
		System.out.println("Nome: " + c.nome + ". Idade: " + c.idade);
		c.latir();
		
		Cachorro c2 = new Cachorro();
		c2.nome = "Frederico";
		c2.latir();
		
		System.out.println("Fim do programa!");
	}
}
