/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.util.Random;

/**
 *
 * @author Iván Carrillo
 * @author Noemí Ortega
 * @version 1.0
 */
public class FuncionesPersona {

    /**
     * Esta clase realiza una función, llamada generoAleatorio, que devolverá un
     * género aleatorio gracias a un booleano. Las opciones serán hombre o
     * mujer.
     *
     * @return generoAleatorio.
     */
    public static Boolean generoAleatorio() {
        Random ran = new Random();
        boolean generoAleatorio = ran.nextBoolean();

        return generoAleatorio;
    }

    /**
     * En esta clase creamos una función llamada nombreAleatorio que devuelve un
     * nombre aleatorio entre un conjunto de opciones distintas dependiendo de
     * si el género es hombre o mujer.
     *
     * @param genero
     * @return null.
     */
    public static String nombreAleatorio(boolean genero) {
        Random ran = new Random();

        int nombreAleatorio = ran.nextInt(5);

        if (genero) {
            String hombre = "Hombre";
            System.out.println("\tGÉNERO: " + hombre);
            System.out.print("\tNOMBRE: ");
            
            switch (nombreAleatorio) {//Nombre aleatorio.
                case 0 ->
                    System.out.println("Antonio ");
                case 1 ->
                    System.out.println("Iván ");
                case 2 ->
                    System.out.println("Roberto ");
                case 3 ->
                    System.out.println("Fernando ");
                case 4 ->
                    System.out.println("Miguel ");
            }
        } else {
            String mujer = "Mujer";
            System.out.println("\tGÉNERO: " + mujer);
            System.out.print("\tNOMBRE: ");
            switch (nombreAleatorio) {//Nombre aleatorio.
                case 0 ->
                    System.out.println("Noemí ");
                case 1 ->
                    System.out.println("Mariam ");
                case 2 ->
                    System.out.println("Francineia ");
                case 3 ->
                    System.out.println("Cristina ");
                case 4 ->
                    System.out.println("Silvia ");
            }
        }
        return null;

    }

    /**
     * Esta clase realiza una función ,llamada apellidosAleatorio, que devolverá
     * un apellido aleatorio entre las opciones que vemos.
     *
     * @return null
     */
    public static String apellidoAleatorio() {
        Random ran = new Random();
        int apellidoAleatorio = ran.nextInt(5);

        System.out.print("\tAPELLIDO: ");
        switch (apellidoAleatorio) {//Apellido aleatorio.
            case 0 ->
                System.out.print("Martín");
            case 1 ->
                System.out.print("Ortega");
            case 2 ->
                System.out.print("Aguirre");
            case 3 ->
                System.out.print("García");
            case 4 ->
                System.out.print("Baños");

        }
        return null;
    }

}
