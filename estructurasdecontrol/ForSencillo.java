package estructurasdecontrol;

import java.io.IOException;
import java.util.Scanner;

public class ForSencillo {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Introduce un caracter: ");
		
		char car = (char)System.in.read();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantas veces: ");
		int veces = entrada.nextInt();
		
		for(int i=1; i<= veces; i++)
			System.out.print(car);
		
	}

}
