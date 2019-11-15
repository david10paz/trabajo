package estructurasdecontrol;
import java.util.Scanner;
class NegativoPositivo
{
	public static void main (String args[])
			{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce el numero ");
		int num1 = entrada.nextInt();
		
		if (num1 < 0) {
			System.out.println("El numero es negativo");
		}
			else if (num1 > 0) {
				System.out.println("El numero es positivo");
			}
				
				else {
					System.out.println("El numero es igual a 0");
			
		}
			}
}