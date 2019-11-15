package estructurasdecontrol;
import java.util.Scanner;
class Bucle
{
	public static void main (String args[])
	{
		Scanner entrada = new Scanner(System.in);
	
		
		int contAlum = 1;
		int sumaNotas = 0;
		
		System.out.println("La nota del alumno es");
		int nota = entrada.nextInt();
		do {
			sumaNotas = sumaNotas + nota;
			contAlum++;
		} while (contAlum <= 3);
		System.out.println("Nota media " + (sumaNotas/contAlum));
		
	}
}