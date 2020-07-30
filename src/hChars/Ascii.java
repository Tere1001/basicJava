package hChars;

import libs.Input;

public class Ascii {

	public static void main(String[] args) {
	    for (int i = 65; i < 65 + 26; i++)
	    {
	        Input.print((char) i + " is " + i + "\n"); // castea el valor de i y lo muestra como la letra
														//agrega texto y el valor puro de la variable 65
														// que es con el valor que inicializa la variable
	    }

	}

}
