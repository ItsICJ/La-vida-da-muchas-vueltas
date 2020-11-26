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
public class Genero {
    /**
     * Esta clase realiza una función, llamada generoAleatorio, que devolverá un género aleatorio
     * gracias a un booleano. Las opciones serán hombre o mujer.
     * @return generoAleatorio.
     */

    public static Boolean generoAleatorio() {

        Random ran = new Random();
        boolean generoAleatorio = ran.nextBoolean();

        return generoAleatorio;
    }
}
