/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesPersona;

import java.util.Random;

/**
 *
 * @author Ivan
 */
public class Genero {

    public static String generoAleatorio() {

        Random ran = new Random();
        boolean generoAleatorio = ran.nextBoolean();

        if (generoAleatorio) {
            System.out.println("\tGENERO: Hombre");
        } else {
            System.out.println("\tGENERO: Mujer");
        }
        return null;

    }

}
