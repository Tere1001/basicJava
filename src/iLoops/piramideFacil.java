package iLoops;

import libs.Input;

public class piramideFacil {
    public static void main(String[] strings){
        int niv= obtenerNivel();

    }

    private static int obtenerNivel() {
        System.out.println("¿Cuantos niveles ocupas en la piramide?");
        int nivel= Input.get_int();

        creaPiramide(nivel);
        return nivel;
    }
    private static void creaPiramide(int nivel) {
        int espacio =0;
        int gatito =0;

        for (int n=1; n <= nivel; n ++){
            if (n == 1){
                espacio = nivel - 1;
                gatito = 2;
            }
            else{
                gatito += 1;
                espacio -= 1;
            }

         ponerEspacio(espacio);
         imprimirGatito(gatito);
         }
    }


    private static void imprimirGatito(int gatito) {
        for (int c = 0; c < gatito ; c ++){
            System.out.print("#");
        }
        System.out.print("\n");
    }

    private static void ponerEspacio(int espacio) {
        for( int cont= 0; cont < espacio ; cont ++){
            System.out.print(" ");
        }
    }


}
