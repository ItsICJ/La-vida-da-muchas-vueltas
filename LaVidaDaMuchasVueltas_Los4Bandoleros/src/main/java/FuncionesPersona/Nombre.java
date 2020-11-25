/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesPersona;

import java.util.Random;
import static FuncionesPersona.Genero.generoAleatorio;

/**
 * En esta clase creamos una función llamada nombreAleatorio que devuelve un
 * nombre aleatorio entre un conjunto de opciones distintas dependiendo de si el
 * género es hombre o mujer.
 *
 * @author Noemí Ortega
 * @author Iván Carrillo
 * @version 1.0
 */
public class Nombre {

    public static String nombreAleatorio() {
        Random ran = new Random();

        int nombreAleatorio = ran.nextInt(5);

        if (generoAleatorio()) {
            String hombre="Hombre";
            System.out.println("\tGÉNERO: "+hombre);
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
            String mujer="Mujer";
            System.out.println("\tGÉNERO: "+mujer);
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
}
