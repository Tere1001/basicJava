package gNumericTypes;

import libs.Input;

public class Ints {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is "); // solicita el valor a asignar para x
	    int x = Input.get_int(); // se realiza asignacion de valor para variable x
	    
	    // prompt user for y
	    System.out.print("y is "); // solicita el valor a asignar para y
	    int y = Input.get_int(); // se realiza asignacion de valor para variable y
	    
	    // perform calculations for user
	    System.out.print(x + " plus " + y + " is " + (x + y) + "\n"); // muestra resultado de la operacion suma asi como los valores usados
	    System.out.print(x + " minus " + y + " is " + (x - y) + "\n"); //muestra resultado de la operacion resta asi como los valores usados
	    System.out.print(x + " times " + y + " is " + (x * y) + "\n"); //muestra resultado de la operacion multiplicacion asi como los valores usados
	    System.out.print(x + " divided by " + y + " is " + (x / y) + "\n"); //muestra resultado de la operacion division asi como los valores usados
	    System.out.print("The reminder of " + x + " over "+ y + " is " + (x % y) + "\n"); // muestra resultado de la operacion modular asi como los valores usados
	}
}


