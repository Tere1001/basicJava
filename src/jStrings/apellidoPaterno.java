package jStrings;

import libs.Input;

public class apellidoPaterno {
    public static void main(String[] args) {
        System.out.println("Captura tu nombre completo con formato de nombre, apellido paterno, apellido materno ;");
        String nombreCompleto= Input.get_string();
        String[] nombres = nombreCompleto.split(" ");
        if(nombres.length>=3){
            int posicionMaterno= nombres.length-1;
            int posicionPaterno= nombres.length-2;
            System.out.println(nombres.length);
            System.out.println("El apellido paterno es: "+nombres[posicionPaterno]);
            System.out.println("El apellido materno es: "+nombres[posicionMaterno]);
        }else{
            System.out.println("Tu nombre esta muy corto o no incluye ambos apellidos.");
        }


    }
}
