/*Convierte una notal alfabetica anumerica 
 * Utilizando la estructura Switch
 */
package estructurasdecontrol;

import java.io.IOException;

public class ConversorNotas 
{
	public static void main(String[] args) throws IOException 
	{
		//Introducimos por teclado la nota alfabetica
		System.out.println("Introduce la nota alfabetica ");
		char notaAlfab = (char) System.in.read();
		//Declaramos una nota numérica
		int notaNumerica = 0;
		//Variable booleana para comprabar si la nota es lógica
		boolean notaCorrecta = false;
		//Convertimos la nota alfabetica a numerica
		switch (notaAlfab)
		{
		case 'I': 
		case 'i':
			notaNumerica = 4;
			break;
		case 'F':
			notaNumerica = 5;
			break;
		case 'B':
		    notaNumerica = 6;
		    break;
		case 'N':
			notaNumerica = 7;
			break;
		case 'S':
			notaNumerica = 9;
			break;
		
		default:
			System.out.println("La nota alfabetica introducida no es válida, ERROR 404");
			notaCorrecta = true;
			break;
		}
	
    //Comprobamos si la nota es correcta
	if(!notaCorrecta)
	{
		//Enviamos a pantalla
				System.out.println("La nota numerica es " + notaNumerica);
	}
	
	}

}
