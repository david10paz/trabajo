/* Introduce por teclado una respuesta valida
 * La respuesta es valida cuando se una 's' minuscula o una 'n' miniscula
 */
package estructurasdecontrol;

import java.io.IOException;

public class DoWhile1 {

	public static void main(String[] args) throws IOException {
		
		char respuesta;
		System.out.println("Introduce la respuesta: ");
		do {
			respuesta = (char) System.in.read();
			//Para que valga la respuesta tanto en minuscula como en mayuscula introducimos esto a continuacion
			respuesta = Character.toLowerCase(respuesta); 
			//Limpiamos el buffer de teclado
			System.in.skip(2);
			if(respuesta != 's' && respuesta!= 'n')
			System.out.println("ERROR: Teclea una s o una n");
			
		}while(respuesta != 's' && respuesta != 'n');
		
		System.out.println("El programa ha terminado");

	}

}
