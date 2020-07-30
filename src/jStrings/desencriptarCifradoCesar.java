package jStrings;

public class desencriptarCifradoCesar {
    public static void main(String[] args) {
        int clave = 3;
        String cifrado = "KROD";
        for(int posicion = 0; posicion < cifrado.length(); posicion++) {
            char actual = cifrado.charAt(posicion);
            if(actual >= 'A' && actual <='Z'){
                int numeroActual = actual - clave;
                if(numeroActual < 65) {
                    numeroActual = numeroActual + 26;
                }
                char letraActual = (char) numeroActual;
                System.out.print(letraActual);
            }else{
                System.out.println(actual);
            }

        }
        System.out.println();
    }

}
