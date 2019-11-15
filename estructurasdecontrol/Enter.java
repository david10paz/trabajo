package estructurasdecontrol;

import java.io.IOException;

public class Enter {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Introduce frase (enter para terminar)");
		
		char car = (char) System.in.read();
		
		while (car!= '\n') {
			
			System.out.println(car);
			car= (char)System.in.read();
			
		}
    //fin mientras
	} //fin main

} //fin class
