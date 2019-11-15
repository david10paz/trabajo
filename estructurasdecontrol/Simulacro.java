package estructurasdecontrol;

public class Simulacro {

	public static void main(String[] args) {
		
		int altura = 3;
		for(int fila = 1; fila<= altura; fila++) 
		{
			for(int columna = fila; columna <= altura; columna++) 
			{
				System.out.print('G');
			}
			System.out.println();
		}

	}

}
