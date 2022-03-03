package com.company;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner s = new Scanner (System.in);

        int edadMascota;
        String nombreCompleto;
        String nombreMascota;
        String TipoMascota;
        String Raza;

        System.out.println(" Bienvenido al programa de Datos Personales y Familiares");

        System.out.println("Por favor digite su nombre ");
        nombreCompleto = s.nextLine();

        System.out.println("Por favor digite su apellido ");
        nombreMascota = s.nextLine();

        System.out.println (" Para completar su información personal por favor responda las siguientes preguntas");

        System.out.println("¿ Como se llama su Padre ? ");
        edadMascota= Integer.parseInt(s.nextLine());

        System.out.println(" ¿ Cual es el apellido de su Padre ?");
        TipoMascota = s.nextLine();

        System.out.println("¿ Como se llama su Madre ? ");
        Raza = s.nextLine();

        System.out.println(  nombreMascota + "   " + "es un " + TipoMascota+ " " + "quien tiene " + edadMascota
                +"   " + " años de edad"+ " " + "y" + nombreCompleto + " " + "es su dueño(a) actualmente");

        System.out.println("**MUCHAS GRACIAS!!!** ");
    }
}
