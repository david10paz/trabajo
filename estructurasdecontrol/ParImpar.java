package estructurasdecontrol;
import java.util.Scanner;
class ParImpar
{
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		 
		System.out.println("Introduce el numero entero que deseas saber si es par o impar");
		int num1 = entrada.nextInt();
		
		if (num1 %2  == 0) {
			System.out.println("El numero " + num1 + " es par");
		}
			else {
				System.out.println("El numero " + num1 + " es impar");
		}
	}
			
}