package iConditionals;

import libs.Input;

public class Logical {

	public static void main(String args[])
	{

		System.out.println("Sabes programar en Java? ( introduce 'y' o 'n' ) \n"); // muestra mensaje en consola
		char c = Input.get_char(); // recibe valor a asignar en variable tipo caracter
	    if (c == 'Y' || c == 'y')  // valida si el valor de la variable es 'Y' en mayuscula o minuscula, y manda mensaje 'si'
	    {
	    	System.out.print("yes\n");
	    }
	    else if (c == 'N' || c == 'n') // de lo contrario valida si el caracter es 'N' en mayuscula o minuscula y manda mensaje `no
	    {
	    	System.out.print("no\n");
	    }
	    else // de lo contrario muestra un mensaje de error
	    {
	    	System.out.print("error\n");
	    }
	
	}
}



