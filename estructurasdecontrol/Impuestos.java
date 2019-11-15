package estructurasdecontrol;
import java.util.Scanner;
class Impuestos
{
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce tu renta anual");
		int renta = entrada.nextInt();
		int impuesto = 0;
		if(renta <= 0)
			System.out.println("La renta tiene que ser mayor que 0");
		else {
			 if(renta < 10000)
				impuesto= 5;
	    else if(renta < 20000)
	    	    impuesto = 15;
	    else if(renta < 35000)
    	        impuesto = 20;
	    else if(renta < 60000)
    	        impuesto = 30;
	    else
	    	    impuesto = 45;
		System.out.println("El tipo impositivo " + impuesto + "%");
		}
	}
}