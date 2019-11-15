/* Introduce por teclado un conjunto de notas
 * hasta que teclees el flag o bandera -99
 * visualizando en pantalla la nota media
 * La nota es válida si esta comprendida entre 1 y 10
 * 
 */
package estructurasdecontrol;

import java.util.Scanner;

class MediaNotas
{
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		//Variable que controla la salida del bucle
		boolean salir = false;
		//Contador de notas o alumnos
		int contadorNotas = 0;
		//Declaramos un acumulador
		float sumaNotas = 0;
		//Decaramos la nota
		float nota = 0;
		//Pedimos la nota
		System.out.println("Introduce la nota, teclea -99 para salir si lo desea");
		do {
			
			nota = entrada.nextFloat();
			salir = (nota == -99);
			boolean notaValida = (nota > 0 && nota <= 10);
			
			if (!salir && notaValida) {
				sumaNotas = sumaNotas + nota;
				
				contadorNotas++;
			} else if (!salir) {
				System.out.println("Error: La nota no es valida");
			}
				
		}while (!salir);
		
		if (contadorNotas > 0)
		{
			//Calculamos la nota media
			float media = sumaNotas / contadorNotas;
			System.out.println("La nota media es " + media);
		}
		else
			System.out.println("No ha introducido una nota correcta");
		    System.out.println("FIN DE PROGRAMA.");
	}
	
}