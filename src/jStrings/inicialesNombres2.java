package jStrings;
import libs.Input;
public class inicialesNombres2 {
    public static void main(String[] args) {
        System.out.println("Captura tu nombre completo con formato de nombre, apellido paterno, apellido materno ;");
        String nombreCompleto = Input.get_string().toUpperCase();
        String[] conNombres = nombreCompleto.split(" ");
        int actual = conNombres.length;
        try {
            for (int i = 0; i < actual; i++) {
                   if (!conNombres[i].isEmpty() && conNombres[i] != "" && conNombres[i].length() != 0) {
                    String inicial = conNombres[i];
                    System.out.println(inicial.charAt(0)  + " valor inicial de : " + inicial);
                }
            }
    }catch( StringIndexOutOfBoundsException e){
            System.out.println("catch");
    }
  }
}
