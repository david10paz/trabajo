package estructurasdecontrol;
//Importamos el scanner
import java.util.Scanner;
class MenorCorrecto
{
	public static void main (String args[])
	{
		//Creamos un objeto tipo Scanner
		 Scanner entrada = new Scanner (System.in);
		 
		//Introducimos por teclado los numeros
		 System.out.println("Introduce numero 1");
		 int num1 = entrada.nextInt();
		 System.out.println("Introduce numero 2");
		 int num2 = entrada.nextInt();
		 
		 //Calculamos que numero es el menor
		 
		 if (num1 < num2) {
			 System.out.println ("El numero menor es " + num1) ;	 
		 }
		 
		 else if(num2<num1){
				 System.out.println ("El numero menor es " + num2);
		 }
		 else {
			 System.out.println("Los numeros son iguales ");
			 
		 }
	}	  
}