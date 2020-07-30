package iLoops;

import libs.Input;

public class Buggy1 {

	public static void main(String[] args) {
	    int i = get_negative_int(); // llama la funcion para devolver un valor para i
	    Input.print(i + " is a negative integer\n"); // imprime en pantalla el valr de i
	}

	public static int get_negative_int()
	{
	    int n; // inicializa la variable n
	    do
	    {
	        Input.print("n is "); // solilcita en valor a asignar a n
	        n = Input.get_int(); // asigna el valor a la variable n
	    }
	    while (n > 0); // cuando n sea mayor a 0 , volver a preguntar el valor a asinar a n
	    return n;      // de lo contrario si es negativo el numero devolver el valor asinado a n
	}
}
