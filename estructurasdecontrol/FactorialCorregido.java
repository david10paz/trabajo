package estructurasdecontrol;

import java.util.Scanner;

public class FactorialCorregido {

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero");
		int numero = entrada.nextInt();
		int resultado = 1;
		
				
		for(int i = numero; i > 0; i--) 
		{
		
			resultado = resultado * i;
		}
		System.out.println("El factorial del numero " + numero + " es " + resultado);
	}
}
		
