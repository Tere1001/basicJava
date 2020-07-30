package bHolaMundo.fHelloWorld;

import libs.Input;

public class Hello2 {

	public static void main(String args[])
	{
		System.out.println("Cual es tu nombre? "); // Muestra en pantalla el texto
		String name = Input.get_string();         // Quda en espera de ingresar el valor del no mbre y lo almacena en una variable
		System.out.println("hello, "+ name ); // imprime en consola el texto : Hello , y el valor de la variable
	}
}