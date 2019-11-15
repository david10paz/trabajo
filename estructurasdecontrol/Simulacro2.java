package estructurasdecontrol;
import java.util.Scanner;
public class Simulacro2 {

	public static void main(String[] args) {
		
		final int pin = 1213;
		int introducido;
		boolean salir = false;
		Scanner teclado = new Scanner(System.in);
		
		int intentos = 3;
		
		do {
			System.out.println("Introduce el codigo pin: ");
			introducido = teclado.nextInt();
			
			if(introducido != pin) 
			{
				intentos--;
				System.out.println("Pin incorrecto. Te quedan " + intentos);
			} 
			else
				salir = true;
			
		}  while(!salir && intentos > 0);
		
		if (salir)
			System.out.println("Pin correcto");
		else
			System.out.println();

	}

}
