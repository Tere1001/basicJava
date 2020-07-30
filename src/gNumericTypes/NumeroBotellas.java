package gNumericTypes;

import libs.Input;

public class NumeroBotellas {

    public static void main(String[] args) {
        System.out.println("¿Cuanton minuticos duras bañandote?");
        int minuticos= Input.get_int();
        int botellas = minuticos * 12;
        System.out.println("!Gastas mucha agua! son "+ botellas + " botellas");
    }
}
