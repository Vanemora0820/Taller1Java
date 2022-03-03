package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner s = new Scanner (System.in);
    String nombre;
    String apellido;

        System.out.println("Bienvenido al programa de datos personales ");
        System.out.println("Por favor diligencie los siguientes datos ");

        System.out.println("Ingrese sus nombres: ");
        nombre = s.nextLine();
        System.out.println("Ingrese sus apellidos: ");
        apellido = s.nextLine();

        System.out.println("Su nombre completo es: "  + nombre + " " + apellido);
        System.out.println("Muchas Gracias!!! ");
    }
}
