package iLoops;

import libs.Input;

public class Ciclos {

	public static void main(String[] args) {
		//imprimir numeros del 0 al 10 (0  1  2  3  4  5  6  7  8  9  10)
		int numero  = 0;
		while(numero <= 10) {
			Input.print(numero);
			Input.print("  ");
			numero += 1;
		}
		Input.print("\n");
		//imprimir la cuenta regresiva de un cohete,  cuando llegue a cero, diga 'despegar'
		numero=10;
		while (numero >= 0) { // mientras numero sea mayor o = a cero , entrara
			if(numero == 0) { // cuando la variable sea igual a 0 entrara y mostrara el mensaje despegar!
				Input.print("Despegar");
				
			} else { // de lo contrario mostrara el valor de numero
				Input.print(numero);
				Input.print("  ");
				
			}
			numero -= 1; // decrementa el valor de numero con cada vuelta que da
		}

		Input.print("\n");

	System.out.println("Cuantas repeticiones quieres? ");
		int numeroRepeticiones = Input.get_int(); // asigna el valor de las repeticiones a la variable
		for(int i = 0; i < numeroRepeticiones; i++) { // inicializa el valor del contador, mientras el contador sea menor al numero de repeticiones
			hagoAlgo();    // manda llamar la funcion cada que entra
		}
	}

	private static void hagoAlgo() {
		System.out.println("repeticion"); // imprime en consula el mensaje repeticion cuantas veces sea invocado en el for
	}


}
