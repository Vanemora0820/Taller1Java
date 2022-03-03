package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner lectura = new Scanner (System.in);

        System.out.println("Bienvenido al programa de Capitales ");

        System.out.println("Ingrese el nombre de una ciudad capital: ");
        String ciudadCapital = lectura.next();

        System.out.println("¿ A que Pais corresponde ? ");
        String pais = lectura.next();

        System.out.println(" La ciudad de  "  + ciudadCapital + " es la capital de " + pais);
    }
}