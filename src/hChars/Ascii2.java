package hChars;

import libs.Input;

public class Ascii2 {

	public static void main(String[] args) {
		for (char c = 'A'; c <= 'Z'; c++) // se tipea la el codigo ascii con la letra que se mostrara definiendo desde la A a la Z
	    {
	        Input.print(c + " is " + (int) c + "\n" ); // imprime en pantalla que letra es y  hace un cast para mostrar su codigo ascii correspondiente
	    }

	}

}
