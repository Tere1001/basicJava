package jStrings;

import libs.Input;

public class inicialesNombre {
    public static void main(String[] args) {
        System.out.println("Captura tu nombre completo con formato de nombre, apellido paterno, apellido materno ;");
        String nombreCompleto= Input.get_string();
        for(int posicion = 0 ; posicion < nombreCompleto.length(); posicion++){ // recorre la cadena en las posiciones
            char caracterActual=nombreCompleto.charAt(posicion);// sacar cadena
            if(Character.isUpperCase(caracterActual)){ // compara cadena
                Input.print(nombreCompleto.charAt(0));
            }
        }
    }
}
