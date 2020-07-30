package iLoops;

import libs.Input;

public class CicloFor {

	public static void main(String[] args) {
//		int numero  = 0;
//		while(numero <= 10) {
//			Input.print(numero);
//			Input.print("  ");
//			numero += 1;
//		}
//		Input.print("\n");
		
		for(int num = 0; num <= 10 ; num += 1) { // ejecuta e imprime el primer ciclo hasta terminar imcrementando la variable del contador
			
			Input.print(num);
			Input.print("  ");
			
		}
		
		for(int num = 10; num >= 0 ; num--) {  // ejecuta e imprime el segundo ciclo hasta terminar decrementando la variable del contador
			
			Input.print(num);
			Input.print("  ");
			
		}

	}

}
