package gNumericTypes;

public class Overflow {

	public static void main(String args[])
	{
		int n = 1; // se inicializa variable
	    for (int i = 0; i < 64; i++) // se inicializa variable, se define cuantas veces repetira el ciclo y se hace un incremento en el contador
	    {
	    	System.out.print("n: " + n + "\n"); // imprime en pantalla la variable y su nuevo valor conforme entra en cada ciclo
	        n = n * 2; // realiza la operacion y guarda el nuevo valor a la variable
	        // para la vuelta 31, mostrara 0 ya que el numero es mayor a lo que soporta el tipo de dato
	    }
	}
}



