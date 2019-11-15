package estructurasdecontrol;
import java.util.Scanner;
public class NotasMaxMin {

	public static void main(String[] args)
	{
		//Variables
		int nota;
		int notaMax = 0;
		int notaMin = 10; 
		boolean notaValida = false;
		
		Scanner entrada = new Scanner (System.in);
		//Pedir al usuario que introduzca la nota
		System.out.println("Introduce la nota: ");
		
		for(int i = 1; i <= 3; i++) 
		{
		
			do 
			{
				//Guardamos la nota y la validamos
				nota = entrada.nextInt();
				notaValida = (nota >= 1 && nota <= 10);
				if(!notaValida)
					System.out.println("La nota no es válida, tiene que estar entre 1 y 10");
				
			}while(!notaValida);
			
			//Comparamos las notas
			if(nota > notaMax)
				notaMax = nota;
			if(nota < notaMin)
				notaMin = nota;
				
		}
		
		//Enviamos a pantalla la nota maxima y la nota minima
		System.out.println("La nota minima es: " + notaMin);
		System.out.println("La nota maxima es: " + notaMax);
	}

}
