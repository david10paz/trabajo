package estructurasdecontrol;
import java.util.Scanner;
class ConjuntoNumeros
{
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		
		System.out.println("Introduce un numero");
		
		for (int i=1; i<=6; i++) {
			
			int numero = entrada.nextInt();
			System.out.println("Introduce un numero");
			
			if (numero < 15)
				contador1++;
			else if (numero > 55)
				contador2++;
			else if (numero >= 45 && numero <=55)
				contador3++;
		}
		System.out.println("El contador menor que 15 es de " + contador1);
		System.out.println("El contador mayor que 55 es de " + contador2);
		System.out.println("El contador entre 45 y 55 es de " + contador3);
		
	}
}