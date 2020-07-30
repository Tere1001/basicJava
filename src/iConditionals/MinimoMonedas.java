package iConditionals;

import libs.Input;

public class MinimoMonedas {
    public static void main(String[] args) {
        double cambioTotal = pedirCambio(); //  la funcion regresa un valor y lo asigna a la variable tipo double
        calcularMinimoMonedas(cambioTotal); // entra a la funcion y envia la variable con valor previamente guardado

    }

    private static double pedirCambio() {
        double cambio = -1.25; // se asigna valor a al variable
        while(cambio < 0 ) { // valida que el valor de la variable de manera inicial y entra al ciclo
            System.out.println("Cuanto te debo?");  // muestra el mensaje en consola
            cambio = Input.get_double(); // setea el valor de la variable con el valor capturado
        }
        return cambio; // devuleve la variable con el nuevo valor seteado
    }

    private static void calcularMinimoMonedas(double cambioTotal) { // entra en la funcion recibiendo el valor a trbajar
        int numCentavos = (int) (cambioTotal * 100); // guarda el valor covertido en centavos para agilizar el manejo de datos
        int numMonedas  = 0; // inicializa la variable
        int numeroMonedas25;
        int numeroMonedas10;
        int numeroMonedas5;
        int numeroMonedas1;
        numeroMonedas25 = numCentavos / 25; // realiza la operacion para obtener cuantas monedas de 25 centavos se ocuparan
        numCentavos = numCentavos % 25; // realiza operacion para obtener la parte sobrante
        numeroMonedas10  = numCentavos / 10;
        numCentavos = numCentavos % 10;
        numeroMonedas5 = numCentavos / 5;
        numCentavos = numCentavos % 5;
        numeroMonedas1 = numCentavos;
        numMonedas = numeroMonedas1 + numeroMonedas5 + numeroMonedas10 + numeroMonedas25;
        System.out.println("Para " + cambioTotal + " se requieren");
        System.out.println(numeroMonedas25 + " monedas de 25c");
        System.out.println(numeroMonedas10 + " monedas de 10c");
        System.out.println(numeroMonedas5 + " monedas de 5c");
        System.out.println(numeroMonedas1 + " monedas de 1c");
    }
}
