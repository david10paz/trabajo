package estructurasdecontrol;

import java.util.Scanner;

class Llamada
{
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in); 
		boolean  duracionValida;
		//Le pedimos al usuario que nos de la duracion de la llamada con un valor entero
		System.out.println("Introduce la duracion con un valor entero en minutos de la llamada:");
		int duracion;
		int costeLlamada;
		//Validamos la duracion
		do {
			
			duracion = entrada.nextInt();
			duracionValida = (duracion > 0);
			if (!duracionValida) {
				System.out.println("La duracion tiene que ser mayor que 0");
			}
			
		}while(!duracionValida);

		
		final int COSTE_MINIMO = 20;
		final int DURACION_MINIMA = 3;
		final int COSTE_MINUTO_ADICIONAL = 15;
		
		if (duracion > DURACION_MINIMA) {
			
			int tiempoAdicional = duracion - DURACION_MINIMA;
			int recargo = tiempoAdicional * COSTE_MINUTO_ADICIONAL;
		    costeLlamada = recargo + COSTE_MINIMO;
			System.out.println("La llamada tiene un precio de " + costeLlamada + " ptas");
		}
		else
			System.out.println("La llamada tiene un precio de " + COSTE_MINIMO + " ptas");
	}
}