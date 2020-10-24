
public class TestaCachorro {
	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		Cachorro c2 = new Cachorro("Bidu");
		Cachorro c3 = new Cachorro("Pluto",10);
		
		
		
		System.out.println(c.getNome() + " | Idade:" + c.getIdade());
		System.out.println(c2.getNome() + " | Idade:" + c2.getIdade());
		System.out.println(c3.getNome() + " | Idade:" + c3.getIdade());
		
		c.setNome("bento");
		System.out.println(c.getNome() + " | Idade:" + c.getIdade());
		
		System.out.println(Calculadora.somar(15, 14));
	}
}
