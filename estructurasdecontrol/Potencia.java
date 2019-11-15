package estructurasdecontrol;
import java.util.Scanner;
class Potencia
{
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce la base de la potencia");
		int base = entrada.nextInt();
		System.out.println("Introduce el exponente de la potencia");
		int exponente = entrada.nextInt();
		
		int resultado = 1;
		for (int i = 1 ; i <= exponente ; i++) {
			resultado = resultado * base;
			
		}
		System.out.println("La potencia de base " + base + " y de de exponente " + exponente + " es igual " + resultado);
	}
}