package estructurasdecontrol;

public class ForAbecedario {

	public static void main(String[] args) {

		int tamAbc = 'Z'-'A'+ 1;
		for (char letra = 'A'; letra <= 'Z'; letra++) 
		{
			System.out.print(letra + "  ");
		}
		System.out.println("\n\n");
		
		for (int i= 'A'; i <= 'Z'; i++)
		{
			System.out.print(i+ "  ");
		}
		
	}

}
