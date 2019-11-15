package estructurasdecontrol;
import java.util.Scanner;
class DivisionFloat
{
	public static void main (String args [])
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("El numero del dividendo, por favor ");
		float num1 = entrada.nextFloat();
		
		System.out.println("El numero del divisor, por favor ");
		float num2 = entrada.nextFloat();
		
		float resultado = num1 / num2 ;
		float resto = num1 % num2;
		
		if (num2 != 0) {
			System.out.println("El resultado de la division es " + resultado);
			System.out.println("El resto de la division es " + resto);
		}
			
			else {
				System.out.println ("ERROR 404");
			
		}
		
		
	}
}