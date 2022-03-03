package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner S = new Scanner (System.in);

        int edad;
        double estatura;
        String nombre;
        String apellido;


        System.out.println("Bienvenido al programa de datos personales ");

        System.out.println("Por favor digite su nombre ");
        nombre = S.nextLine();

        System.out.println("Por favor digite su apellido ");
        apellido = S.nextLine();

        System.out.println("Por favor digite su edad  ");
        edad = Integer.parseInt(S.nextLine());

        System.out.println("Por favor digite su estatura ");
        estatura = Double.parseDouble(S.nextLine());

        System.out.println("SU INFORMACIÓN BÁSICA ES :" + " NOMBRE COMPLETO: "  + nombre + " " + apellido);
        System.out.println(" SU EDAD ES :"  + edad +" " + "años");
        System.out.println(" SU ESTATURA ES :"  + estatura);

        System.out.println("MUCHAS GRACIAS!!! ");
    }
}