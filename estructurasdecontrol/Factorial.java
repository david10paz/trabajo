package estructurasdecontrol;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el factorial");
		int factorial = entrada.nextInt();
		
		int resultado = 1;
		
				
		for(int i = 1; i <= factorial; i++) {
			resultado = resultado * i;
			{
				if (i == factorial)
					System.out.println("El factorial de " + factorial + " es igual a " + resultado); 
					
			}
		}
		
		
	}

}
