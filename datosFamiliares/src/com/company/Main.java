package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        String nombre;
        String apellido;
        String NomPadre;
        String ApePadre;
        String NomMadre;
        String ApeMadre;


        System.out.println(" **Bienvenido al programa de Datos Personales y Familiares**");
        System.out.println("Por favor diligencie los siguientes datos ");

        System.out.println("Por favor digite su nombre ");
        nombre = s.nextLine();

        System.out.println("Por favor digite su apellido ");
        apellido = s.nextLine();

        System.out.println (" Para completar su información personal por favor responda las siguientes preguntas");

        System.out.println("¿ Como se llama su padre ? ");
        NomPadre = s.nextLine();

        System.out.println(" ¿ Cual es el apellido de su padre ?");
        ApePadre = s.nextLine();

        System.out.println("¿ Como se llama su madre ? ");
        NomMadre = s.nextLine();

        System.out.println(" ¿ Cual es el apellido de su madre ?");
        ApeMadre = s.nextLine();

        System.out.println(" Yo " +  nombre + " " + apellido
                            + " soy hija de " +  NomPadre + " "+ ApePadre + " " + " y " + NomMadre + " "+ ApeMadre );


        System.out.println("**MUCHAS GRACIAS!!!** ");


    }
}