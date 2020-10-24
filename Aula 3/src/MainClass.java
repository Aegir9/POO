import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Mochila [] mochilas = new Mochila[4];
//		Mochila [] mochilas = {new Mochila(),new Mochila(),new Mochila(),new Mochila()};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(mochilas.length);

		for(int i=0; i< mochilas.length; i++)
		{
			mochilas[i] = new Mochila(); 
			
			System.out.println("\nMochila "+ (i+1) + "\nCor:");
			mochilas[i].setCor(scanner.nextLine());
			
			System.out.println("Ano de Fabricação:");
			mochilas[i].setAnoFabricacao(scanner.nextInt());
			
			scanner.nextLine();
		}
		
		int media = 0;
		
		for(Mochila mochila : mochilas) {
			System.out.println("Cor: "+ mochila.getCor() +" | Ano de Fabricação: " +  mochila.getAnoFabricacao());
			media = media + mochila.getAnoFabricacao();
		}
		
		System.out.println("\n\nMédia dos anos de fabricação: " + media/mochilas.length);
	}
	
	
}
