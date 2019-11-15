package estructurasdecontrol;

import java.io.IOException;
import java.util.Scanner;

public class ForAnidado {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Introduce un caracter: ");
		
		char car = (char) System.in.read();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la base");
		int base = entrada.nextInt();
		System.out.println("Introduce la altura");
		int altura = entrada.nextInt();
		
		for (int j = 1; j <= altura; j++) 
		{
			for(int i=1; i<= base; i++)
				System.out.print(car);
			//Salto a la siguente linea
			System.out.println();
		}
		
		
		
		
	}

}
