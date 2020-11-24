/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesPersonas;

import java.util.Random;
import java.util.Scanner;

/**
 * En esta clase creamos una función llamada nombreAleatorio que recibe por
 * argumentos un género y devuelve un nombre aleatorio entre un conjunto de
 * opciones distintas dependiendo de si el género es hombre o mujer
 *
 * @author noemi
 * @version 1.0
 */
public class Nombre {

    public static String nombreAleatorio(String genero) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        /**
         * La variable nombre tipo String almacena el género que el usuario
         * intriduce por teclado, por eso la declaramos vacía.
         */
        String nombre = "";
        /**
         * Este sout imprime el String genero, al cual se le da valor en el Main
         * de la clase principal.
         */
        System.out.println(genero);
        /**
         * Este DoWhile pedirá al usuaio tantas veces sea necesario que
         * introduzca su género hasta que sea igual a "femenino" o "masculino".
         */
        do {
            nombre = sc.nextLine();
            /**
             * Con .equalsIgnoreCase() conseguimos que obvie las mayúsculas y
             * así nos ahorramos el tener que especificar las 4 opciones
             * posibles como por ejemplo "femenino" y "Femenino"
             */
            if (!nombre.equalsIgnoreCase("mujer") && !nombre.equalsIgnoreCase("hombre")) {
                System.out.println("Escriba su género por favor");
            }
        } while (!nombre.equalsIgnoreCase("mujer") && !nombre.equalsIgnoreCase("hombre"));

        /**
         * Si el valor de la variable nombre de tipo String es igual a "hombre"
         * elegirá de forma aleatoria un nombre entre los case del switch.
         */
        if (nombre.equalsIgnoreCase("hombre")) {
            System.out.print("Nombre ");
            byte nombreH = (byte) ran.nextInt(6);
            switch (nombreH) {
                case 0:
                    System.out.print("Pedro ");
                    break;
                case 1:
                    System.out.print("Isaac ");
                    break;
                case 2:
                    System.out.print("Luís ");
                    break;
                case 3:
                    System.out.print("Manuel ");
                    break;
                case 4:
                    System.out.print("Abrahán ");
                    break;
                case 5:
                    System.out.print("Paco ");
                    break;
            }
        } 
        /**
         * Si el valor de la variable nombre de tipo String es igual a "mujer"
         * elegirá de forma aleatoria un nombre entre los case del switch.
         */
        else if (nombre.equalsIgnoreCase("mujer")) {
            System.out.print("Nombre ");
            byte nombreM = (byte) ran.nextInt(6);
            switch (nombreM) {
                case 0:
                    System.out.print("Toñi ");
                    break;
                case 1:
                    System.out.print("Sarai ");
                    break;
                case 2:
                    System.out.print("Mari ");
                    break;
                case 3:
                    System.out.print("Ana ");
                    break;
                case 4:
                    System.out.print("Loli ");
                    break;
                case 5:
                    System.out.print("Paqui ");
                    break;
            }
        }
        /**
         * Esta función no devuelve nada.
         */
        return null;
    }
}
