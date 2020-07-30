package iLoops;

import libs.Input;

public class cancioElefanteCuantos {
    public static void main (String[] args) {
        System.out.println("Cancion de los Elefantes 2");
        System.out.println("¿Cuantos Elefantes quieres que se canten?");
        int e= Input.get_int();
        cuentaElefantes(e);

    }

    private static void cuentaElefantes(int e) {

        System.out.println("Un elefante se columpiaba sobre la tela de una araña, \n como vehia que resistia fue a invitar a otro elefante \n \n ");

        for(int c = 2; c <= e ; c++ ){
            System.out.println(c +" elefantes se columpiaban sobre la tela de una araña, \n como vehian que resistia fueron a invitar a otro elefante \n \n ");
        }
    }
}
