/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesPersona;

import java.util.Random;

/**
 *
 * @author Iván Carrillo
 * @author Noemí Ortega
 * @version 1.0
 */
public class Apellido {
    /**
     * Esta clase realiza una función ,llamada apellidosAleatorio,
     * que devolverá un apellido aleatorio entre las opciones que vemos.
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
