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
 */
public class Apellidos {

    public static String apellidosAleatorio() {

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
