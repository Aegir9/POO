
public class MainClass {
	public static void main(String[] args) {
		
		for(int i = 10; i> 0; --i){
			
			if (i == 5) continue;
			System.out.println(i);
			
		}
		
		int a1 = 10;
		int b1 = a1++;
		
		System.out.println("A1 = " + a1 + " | B1 = " + b1);
		
		int a2 = 10;
		int b2 = ++a2;
		
		System.out.println("A2 = " + a2 + " | B2 = " + b2);
		
	}
}
