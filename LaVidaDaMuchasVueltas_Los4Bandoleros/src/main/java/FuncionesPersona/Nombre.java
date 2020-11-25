/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesPersona;

import java.util.Random;
import static FuncionesPersona.Genero.generoAleatorio;
/**
 * En esta clase creamos una función llamada nombreAleatorio que recibe por
 * argumentos un género y devuelve un nombre aleatorio entre un conjunto de
 * opciones distintas dependiendo de si el género es hombre o mujer.
 *
 * @author Noemí Ortega
 * @author Iván Carrillo
 * @version 1.0
 */
public class Nombre {

    public static String nombreAleatorio() {
        
        boolean genero = Boolean.parseBoolean(generoAleatorio());
        Random ran = new Random();
      
        int nombreAleatorio = ran.nextInt(5);
        
        if (genero) {
            
            System.out.print("\tNOMBRE: ");
            
            switch (nombreAleatorio) {//Nombre aleatorio.
                case 0 ->
                    System.out.print("Antonio ");
                case 1 ->
                    System.out.print("Iván ");
                case 2 ->
                    System.out.print("Roberto ");
                case 3 ->
                    System.out.print("Fernando ");
                case 4 ->
                    System.out.print("Miguel ");
            }
            
        } else {//Género mujer.
            
            System.out.print("\tNOMBRE: ");
            switch (nombreAleatorio) {//Nombre aleatorio.
                case 0 ->
                    System.out.print("Noemí ");
                case 1 ->
                    System.out.print("Mariam ");
                case 2 ->
                    System.out.print("Francineia ");
                case 3 ->
                    System.out.print("Cristina ");
                case 4 ->
                    System.out.print("Silvia ");
            }

        }
        return null;

    }
}
