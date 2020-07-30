package iLoops;

import java.util.ArrayList;
import java.util.List;

public class EncontrarCancion {
    public static void main(String[] args) {
//        //navegar a la pagina
//        //dar click en songs
//        //obtener el texto de todas las canciones y meterla a la lista de canciones
        List<String> listaCanciones = new ArrayList<String>();
        listaCanciones.add("My way");
        listaCanciones.add("Elefante");
        listaCanciones.add("Uno mas");
        listaCanciones.add("Pollito Verde");
        listaCanciones.add("Prueba");
        int tamanoLista = listaCanciones.size();
          // por cada cancion, obtener el texto del elemento de la lista
        for(int i = 0; i < tamanoLista; i++) {
//            //sacar el texto del elemento de la cancion
            String textoCancion= listaCanciones.get(i);
            if(textoCancion.contains("Pollito Verde")) {
                System.out.println("Se encontro la cancion Pollito Verde y se dara clic :) ");
               //click();
                break;
            }
        }
//        // hacer la comparacion.  si es igual a pollito verde, darle click


    }
}
