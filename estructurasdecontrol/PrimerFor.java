package estructurasdecontrol;
class PrimerFor
{
	public static void main (String args[])
	{
		//Acumulador
		int producto = 1;
		 
		for (int i=1; i<=4; i++) {
		producto = producto * i;
		System.out.println("La sucesion de productos es... " + producto) ;
		}
	}
}