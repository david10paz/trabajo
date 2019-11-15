package estructurasdecontrol;
//Importamos el scanner
import java.util.Scanner;
class areaperimetro
{
	public static void main(String args[]) 
	{
		//Creamos un objeto tipo scanner
		Scanner entrada = new Scanner (System.in);
		
		//Introducimos por teclado los numeros
		System.out.println("La base mide ");
		double num1 = entrada.nextDouble();
		System.out.println("La altura mide ");
		double num2 = entrada.nextDouble();
		
		//Calculamos el area
		
		double suma = num1 * num2;
		System.out.println("El area del cono es de " + suma);
		
		//Calculamos el perímetro
		
		double suma1 = 2 *(num1 + num2);
		System.out.println("El perimetro del cono es de " + suma1);
		
		
		
	}
	
}