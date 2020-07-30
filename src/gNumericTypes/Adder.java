package gNumericTypes;

import libs.Input;

public class Adder {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is: "); // imprimir en consola
	    int x = Input.get_int(); // almacena en variable el valor capturado
	    
	    // prompt user for y
	    System.out.print("y is: "); // imprime en consola leyenda
	    int y = Input.get_int(); // almacena el valor asignado a y
	    
	    // calculate sum for user
	    System.out.println("sum is " + (x + y) + "\n");    // realiza la operacion e imprime en consola
	}
}