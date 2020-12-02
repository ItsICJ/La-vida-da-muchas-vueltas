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
        boolean genero = ran.nextBoolean();
        return genero;
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
        String retA = "";
        int nombreAleatorio = ran.nextInt(5);

        if (genero) {
            switch (nombreAleatorio) {//Nombre aleatorio si es hombre.
                case 0:
                    retA = "Antonio ";
                    break;
                case 1:
                    retA = "Iván ";
                    break;
                case 2:
                    retA = "Roberto ";
                    break;
                case 3:
                    retA = "Fernando ";
                    break;
                case 4:
                    retA = "Miguel ";
                    break;
            }
        } else {
            switch (nombreAleatorio) {//Nombre aleatorio si es mujer.
                case 0:
                    retA = "Noemí ";
                    break;
                case 1:
                    retA = "Mariam ";
                    break;
                case 2:
                    retA = "Francineia ";
                    break;
                case 3:
                    retA = "Cristina ";
                    break;
                case 4:
                    retA = "Silvia ";
                    break;
            }
        }
        return retA;

    }

    /**
     * Esta clase realiza una función ,llamada apellidosAleatorio, que devolverá
     * un apellido aleatorio entre las opciones que vemos.
     *
     * @return null
     */
    public static String apellidoAleatorio() {
        Random ran = new Random();
        String retB = "";
        int apellidoAleatorio = ran.nextInt(5);

        switch (apellidoAleatorio) {//Apellido aleatorio.
            case 0:
                retB = "Martín ";
                break;
            case 1:
                retB = "Ortega ";
                break;
            case 2:
                retB = "Aguirre ";
                break;
            case 3:
                retB = "García ";
                break;
            case 4:
                retB = "Baños ";
                break;

        }
        return retB;
    }

    /**
     * Esta función sin argumentos genera un número entre 0 y 100 y lo
     * devolverá.
     *
     * @return
     */
    public static byte valorEstadisticaAleatorio() {
        Random ran = new Random();
        return (byte) ran.nextInt(100);
    }

    /**
     * Esta función recibe un argumento numérico llamado min, genera un número
     * aleatorio entre min y 100 y lo devolverá.
     *
     * @param min
     * @return
     */
    public static byte valorEstadisticaAleatorio(byte min) {
        Random ran = new Random();
        byte a = (byte) (ran.nextInt((100 - min)) + min);
        return a;
    }

    /**
     * Esta función recibe dos argumentos numéricos, llamados min y max,
     * generará y devolverá un valor aleatorio entre min y max, con ambos
     * incluídos.
     *
     * @param min
     * @param max
     * @return
     */
    public static byte valorEstadisticaAleatorio(byte min, byte max) {
        Random ran = new Random();
        byte b = (byte) (ran.nextInt((max - min)) + min);
        return b;
    }

    /**
     * Esta función devuelve, concatenada en un String, toda la información de
     * una persona..
     *
     * @param nombre
     * @param apellidos
     * @param genero
     * @param sociabilidad
     * @param empatia
     * @param inteligencia
     * @param velocidad
     * @param fuerza
     * @return
     */
    public static String imprimePersona(String nombre, String apellidos, boolean genero, byte sociabilidad,
            byte empatia, byte inteligencia, byte velocidad, byte fuerza) {
        String retC = "";
        retC = nombre + apellidos + "(" + (genero ? "hombre" : "mujer") + ")" + "\n----------------------------------" + "\nSociabilidad= " + sociabilidad
                + "\nEmpatía= " + empatia + "\nInteligencia= " + inteligencia
                + "\nVelocidad= " + velocidad + "\nFuerza= " + fuerza;
        return retC;
    }

}
