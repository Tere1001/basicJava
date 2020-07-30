package jStrings;

import libs.Input;

public class covertidorFechas {
    public static void main(String[] args) {
        System.out.println("Introduce una fecha (dd/mm/aaaa): ");
        String fecha= Input.get_string();
        String[] fechaParte = fecha.split("/");

        int numeroDia= Integer.parseInt(fechaParte[0]);
        int numeroMes= Integer.parseInt(fechaParte[1]);
        int numeroAnio= Integer.parseInt(fechaParte[2]);

        if(numeroMes >=1 && numeroMes <= 12 && numeroDia>=1 && numeroDia<=30){
            System.out.println(fechaParte[0] + " Dia");
            System.out.println(fechaParte[1] + " Mes");
            System.out.println(fechaParte[2] + " Año");
        }else {
            System.out.println("La fecha esta equivocada "+ fecha);
        }


        //pedir al usuario una fecha
        //la vamos a imprimir
        //dia:
        //mes:
        //anio:
    }
}
