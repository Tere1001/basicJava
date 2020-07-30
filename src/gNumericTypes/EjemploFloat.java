package gNumericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
		System.out.println("Ingresa el valor de divisor : \n");
		float f = Input.get_float(); // Aqui se ingresa el divisor

		System.out.println("Ingresa el valor del dividendo:\n");
		float f2 = Input.get_float(); // Aqui se ingresa el dividendo
		
		Input.print("f/f2 = " + (f/f2)); // Realiza la operacion e imprime las variables y el resultado

	}

}
