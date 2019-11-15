package estructurasdecontrol;

class SumaNumeros
{
	public static void main(String[] args) 
	{
		int suma = 0;
		
		for(int num = 3; num <= 1500; num = num + 4) 
		{
			suma = suma +  num;
			
		}
		System.out.println("La suma es igual a: " + suma);
	}

}	
