package iConditionals;

import libs.Input;

public class Positive {

	public static void main(String args[])
	{
		int i = get_positive_int(); // invoca la funcion para asignar valor a la variable i
		System.out.print(i + " is a positive integer\n"); // una vez ingresado un valor positivo, muestra el mensaje con el
		                                                 // valor asignado a ' i ' asi como el mensaje de es positivo
	}

	public static int get_positive_int()
	{
	    int n; // inicializa variable
	    do
	    {
	    	System.out.print("n is "); // solicita valor de n
	        n = Input.get_int(); // setea el valor de n, con lo capturado
	    }
	    while (n < 1);  // valida y en caso de que sea menor a 2, el ciclo se repetira
	    return n;       // de lo contrario se devuelve el valor de n
	}
}


