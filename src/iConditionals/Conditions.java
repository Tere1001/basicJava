package iConditionals;

import libs.Input;

public class Conditions {

	public static void main(String args[])
	{
		System.out.print("Dame un numero: "); // pide valor en consula
		int i = Input.get_int(); //  asigna valor a la variable i
		if (i < 0) // valida si el numero capturado es menor a 0 entonces muestra mensaje ' negativo '
		{
			System.out.print("negative\n");
		}
		else if (i > 0) // valida si no , si el numero es mayor a 0, entonces muestra mensaje 'positivo'
		{
			System.out.print("positive\n");
		}
		else // de lo contrario muestra el mensaje de que es zero
		{
			System.out.print("zero\n");
		}
	}
}
