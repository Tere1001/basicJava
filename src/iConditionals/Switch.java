package iConditionals;

import libs.Input;

public class Switch {

public static void main(String args[])
{
	System.out.println("Introduce alguno de estos caracteres 'n' o 'y'");
	char c = Input.get_char(); // espera la captura de carcter para la variable c
	switch (c) // dependiendo del valor de c ( validando mayuscula y minuscula, manda a la opcion correspondiente )
	{
	case 'Y':
	case 'y':
		System.out.print("yes\n");
		break;
	case 'N':
	case 'n':
		System.out.print("no\n");
		break;
	default:
		System.out.print("error\n");
		break;
	}
}
}




