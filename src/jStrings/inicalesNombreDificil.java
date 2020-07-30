package jStrings;

import libs.Input;

public class inicalesNombreDificil {
    public static void main(String[] args) {
        System.out.println("Captura tu nombre completo con formato de nombre, apellido paterno, apellido materno ;");
        String nombreCompleto= Input.get_string();
        String[] conjuntoNombres = nombreCompleto.split(" ");
if( conjuntoNombres.length >=3 ){
        char iniMaterno=conjuntoNombres[2].charAt(0);// sacar primer caracter de cadena Paterna
        char iniPaterno=conjuntoNombres[1].charAt(0);// sacar primer caracter de cadena Materna
        char iniNombre=conjuntoNombres[0].charAt(0);// sacar primer caracter de cadena Nombre
    if (iniPaterno  >= 'A' && iniPaterno >= 'Z' || iniMaterno  >= 'A' && iniMaterno >= 'Z'|| iniNombre  >= 'A' && iniNombre >= 'Z' ){
        if(Character.isUpperCase(iniPaterno) ||Character.isUpperCase(iniMaterno) ||Character.isUpperCase(iniNombre)){
        System.out.println("Para el nombre completo:" + nombreCompleto);
        System.out.println("Las primeras letras de  Nombre es "+ iniNombre);
        System.out.println("Las primeras letras de Apellido Paterno es "+ iniPaterno);
        System.out.println("Las primeras letras de Apellido Materno es "+ iniMaterno);

    }else {
        System.out.println("El inicio de los nombres por regla gramatical deberian de ir en mayuscula, sin embargo este es el resultado: ");
        System.out.println("Para el nombre completo:" + nombreCompleto);
        System.out.println("Las primeras letras de  Nombre es "+ iniNombre);
        System.out.println("Las primeras letras de Apellido Paterno es "+ iniPaterno);
        System.out.println("Las primeras letras de Apellido Materno es "+ iniMaterno);

      }
    }
}else {
    System.out.println("No cuenta con los parametros completos ( Nombre, Apellido Paterno, Apellido Materno)");
}

        }
    }





