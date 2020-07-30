package gNumericTypes;

import libs.Input;

public class Floats {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is "); // imprime leyenda de valor a solicitar
	    float x = Input.get_float(); // se realiza asignacion de valor en variable
	    
	    // prompt user for y
	    System.out.print("y is "); // imprime leyenda de valor solicitado
	    float y = Input.get_float(); // se realiza asignacion de valor a variable
	    
	    // perform division for user
	    System.out.print(x + " divided by " + y + " is " + ( x / y) + "\n"); // muestra los valores introducidos y su resultado
	}
}


