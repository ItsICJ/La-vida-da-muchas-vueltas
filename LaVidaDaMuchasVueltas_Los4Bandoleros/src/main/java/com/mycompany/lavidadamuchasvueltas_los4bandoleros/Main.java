/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lavidadamuchasvueltas_los4bandoleros;

import static Funciones.FuncionesPersona.nombreAleatorio;
import static Funciones.FuncionesPersona.apellidoAleatorio;
import static Funciones.FuncionesPersona.generoAleatorio;
import static Funciones.FuncionesPersona.valorEstadisticaAleatorio;
import static Funciones.FuncionesPersona.imprimePersona;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase principal del juego.
 *
 * @author Iván Carrillo
 * @author Noemí Ortega
 * @version 1.0
 */
public class Main {

    /**
     * En este main se codificará todo lo necesario para ejecutar el juego.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Declaramos e inicializamos las variables correspondientes a PAPA.
         */
        Boolean generoPapa = true;
        String nombrePapa = nombreAleatorio(generoPapa);
        String apellidoPapa1 = apellidoAleatorio();
        String apellidoPapa2 = apellidoAleatorio();
        String apellidosPapa = apellidoPapa1 + " " + apellidoPapa2;
        byte edadPapa = valorEstadisticaAleatorio((byte) 30, (byte) 100);
        boolean vivoPapa;

        byte sociabilidadPapa = valorEstadisticaAleatorio((byte) 50, (byte) 100);
        byte empatiaPapa = valorEstadisticaAleatorio((byte) 50);
        byte inteligenciaPapa = valorEstadisticaAleatorio((byte) 50);
        byte velocidadPapa = valorEstadisticaAleatorio((byte) 50);
        byte fuerzaPapa = valorEstadisticaAleatorio((byte) 50, (byte) 100);

        /**
         * Declaramos e inicializamos las variables correspondientes a MAMA.
         */
        Boolean generoMama = false;
        String nombreMama = nombreAleatorio(generoMama);
        String apellidoMama1 = apellidoAleatorio();
        String apellidoMama2 = apellidoAleatorio();
        String apellidosMama = apellidoMama1 + " " + apellidoMama2;
        byte edadMama = valorEstadisticaAleatorio((byte) 30, (byte) 100);
        boolean vivaMama;

        byte sociabilidadMama = valorEstadisticaAleatorio((byte) 50, (byte) 100);
        byte empatiaMama = valorEstadisticaAleatorio((byte) 50);
        byte inteligenciaMama = valorEstadisticaAleatorio((byte) 50);
        byte velocidadMama = valorEstadisticaAleatorio((byte) 50);
        byte fuerzaMama = valorEstadisticaAleatorio((byte) 50, (byte) 100);

        /**
         * Declaramos e inicializamos las variables correspondientes a YO.
         */
        Boolean generoYo = generoAleatorio();
        String nombreYo = nombreAleatorio(generoYo);
        String apellidosYo = apellidoPapa1 + " " + apellidoMama1;
        byte edadYo = 0;
        boolean vivoYo = generoAleatorio();

        byte sociabilidadYo;
        byte sociabilidadMaxYo;
        if (sociabilidadPapa > sociabilidadMama) {
            sociabilidadMaxYo = valorEstadisticaAleatorio((byte) sociabilidadMama, (byte) sociabilidadPapa);
        } else {
            sociabilidadMaxYo = valorEstadisticaAleatorio((byte) sociabilidadPapa, (byte) sociabilidadMama);
        }

        byte empatiaYo;
        byte empatiaMaxYo;
        if (empatiaPapa > empatiaMama) {
            empatiaMaxYo = valorEstadisticaAleatorio((byte) empatiaMama, (byte) empatiaPapa);
        } else {
            empatiaMaxYo = valorEstadisticaAleatorio((byte) empatiaPapa, (byte) empatiaMama);
        }

        byte inteligenciaYo;
        byte inteligenciaMaxYo;
        if (inteligenciaPapa > inteligenciaMama) {
            inteligenciaMaxYo = valorEstadisticaAleatorio((byte) inteligenciaMama, (byte) inteligenciaPapa);
        } else {
            inteligenciaMaxYo = valorEstadisticaAleatorio((byte) inteligenciaPapa, (byte) inteligenciaMama);
        }
        byte velocidadYo;
        byte velocidadMaxYo;
        if (velocidadPapa > velocidadMama) {
            velocidadMaxYo = valorEstadisticaAleatorio((byte) velocidadMama, (byte) velocidadPapa);

        } else {
            velocidadMaxYo = valorEstadisticaAleatorio((byte) velocidadPapa, (byte) velocidadMama);

        }
        byte fuerzaYo;
        byte fuerzaMaxYo;
        if (fuerzaPapa > fuerzaMama) {
            fuerzaMaxYo = valorEstadisticaAleatorio((byte) fuerzaMama, (byte) fuerzaPapa);
        } else {
            fuerzaMaxYo = valorEstadisticaAleatorio((byte) fuerzaPapa, (byte) fuerzaMama);

        }
        byte iniciativaYo = 2;

        /**
         * Declaramos las variables correspondientes a HERMANO.
         */
        // HERMANO 1
        boolean generoHermano1 = false;
        String nombreHermano1 = "";
        String apellidosHermano1 = "";
        byte edadHermano1 = 0;
        boolean vivoHermano1;

        byte sociabilidadHermano1 = 0;
        byte empatiaHermano1 = 0;
        byte inteligenciaHermano1 = 0;
        byte velocidadHermano1 = 0;
        byte fuerzaHermano1 = 0;

        // HERMANO 2
        boolean generoHermano2 = false;
        String nombreHermano2 = "";
        String apellidosHermano2 = "";
        byte edadHermano2 = 0;
        boolean vivoHermano2;

        byte sociabilidadHermano2 = 0;
        byte empatiaHermano2 = 0;
        byte inteligenciaHermano2 = 0;
        byte velocidadHermano2 = 0;
        byte fuerzaHermano2 = 0;

        // HERMANO 3
        boolean generoHermano3 = false;
        String nombreHermano3 = "";
        String apellidosHermano3 = "";
        byte edadHermano3 = 0;
        boolean vivoHermano3;

        byte sociabilidadHermano3 = 0;
        byte empatiaHermano3 = 0;
        byte inteligenciaHermano3 = 0;
        byte velocidadHermano3 = 0;
        byte fuerzaHermano3 = 0;

        /**
         * A continuación se inicializarán las variables correspondientes a
         * HERMANO de la siguiente manera: se creará un número random entre 0 y
         * 3(número de hermanos que tendré), y dependiendo del número de
         * hermanos que tenga de forma directa crearé un número de personas.
         */
        Random ran = new Random();
        byte nHermanos = (byte) ran.nextInt(4);
        switch (nHermanos) {
            case 0:
                generoHermano3 = generoAleatorio();
                nombreHermano3 = nombreAleatorio(generoHermano3);
                apellidosHermano3 = apellidosYo;
                edadHermano3 = valorEstadisticaAleatorio((byte) 0, (byte) 50);

                sociabilidadHermano3 = valorEstadisticaAleatorio((byte) 50, (byte) 100);
                empatiaHermano3 = valorEstadisticaAleatorio((byte) 50);
                inteligenciaHermano3 = valorEstadisticaAleatorio((byte) 50);
                velocidadHermano3 = valorEstadisticaAleatorio((byte) 50);
                fuerzaHermano3 = valorEstadisticaAleatorio((byte) 50, (byte) 100);

            case 1:
                generoHermano2 = generoAleatorio();
                nombreHermano2 = nombreAleatorio(generoHermano2);
                apellidosHermano2 = apellidosYo;
                edadHermano2 = valorEstadisticaAleatorio((byte) 0, (byte) 50);

                sociabilidadHermano2 = valorEstadisticaAleatorio((byte) 50, (byte) 100);
                empatiaHermano2 = valorEstadisticaAleatorio((byte) 50);
                inteligenciaHermano2 = valorEstadisticaAleatorio();
                velocidadHermano2 = valorEstadisticaAleatorio((byte) 50);
                fuerzaHermano2 = valorEstadisticaAleatorio((byte) 50, (byte) 100);
            case 2:
                generoHermano1 = generoAleatorio();
                nombreHermano1 = nombreAleatorio(generoHermano1);
                apellidosHermano1 = apellidosYo;
                edadHermano1 = valorEstadisticaAleatorio((byte) 0, (byte) 50);

                sociabilidadHermano1 = valorEstadisticaAleatorio((byte) 50, (byte) 100);
                empatiaHermano1 = valorEstadisticaAleatorio((byte) 50);
                inteligenciaHermano1 = valorEstadisticaAleatorio();
                velocidadHermano1 = valorEstadisticaAleatorio((byte) 50);
                fuerzaHermano1 = valorEstadisticaAleatorio((byte) 50, (byte) 100);
            case 3:

                break;
        }

        /**
         * Con este if conseguimos que si vivoYo tiene como valor true de paso a
         * un juego que se explicará en las siguientes documentaciones.
         */
        byte opcion = 0;
        Scanner sc = new Scanner(System.in);
        if (vivoYo) {
            /**
             * Este DoWhile te ofrece continuamente un menú de 5 opciones hasta
             * que elijas la opción 5 que equivale a morir o agluna de las otras
             * opciones, aunque solamente saldrá del juego elijiendo la opción
             * 5, las opciones del 1 al 4 tiene objetivos varios que se
             * explicarán a continuación.
             */
            while (opcion != 5) {
                System.out.println("Elige una opción:"
                        + "\n\t1 - Impimir mi información."
                        + "\n\t2 - Imprimir información de mi familia."
                        + "\n\t3 - Hacer cosas."
                        + "\n\t4 - Crecer."
                        + "\n\t5 - Terminar (morir).");

                do {
                    opcion = Byte.parseByte(sc.nextLine());
                    if (opcion < 1 || opcion > 5) {
                        System.out.println("Elige una de las opciones del menú.");
                    }
                } while (opcion < 1 || opcion > 5);

                /**
                 * Cada case de este switch equivale a cada opción del menú.
                 */
                switch (opcion) {
                    /**
                     * Este case imprime el valor de las variables referentes a
                     * YO.
                     */
                    case 1:
                        System.out.println(imprimePersona(nombreYo, apellidosYo, generoYo, edadYo, sociabilidadMaxYo, empatiaMaxYo, inteligenciaMaxYo, velocidadMaxYo, fuerzaMaxYo));
                        System.out.println("");
                        break;

                    /**
                     * Este case imprime el valor de las variables referentes a
                     * PAPA,MAMA y HERMANO(en caso de que tenga).
                     */
                    case 2:
                        System.out.println(imprimePersona(nombrePapa, apellidosPapa, generoPapa, edadPapa, sociabilidadPapa, empatiaPapa, inteligenciaPapa, velocidadPapa, fuerzaPapa));
                        System.out.println("");
                        System.out.println(imprimePersona(nombreMama, apellidosMama, generoMama, edadMama, sociabilidadMama, empatiaMama, inteligenciaMama, velocidadMama, fuerzaMama));
                        System.out.println("");
                        switch (nHermanos) {
                            case 0:
                                System.out.println(imprimePersona(nombreHermano3, apellidosHermano3, generoHermano3, edadHermano3, sociabilidadHermano3, empatiaHermano3, inteligenciaHermano3, velocidadHermano3, fuerzaHermano3));
                                System.out.println("");
                                System.out.println(imprimePersona(nombreHermano2, apellidosHermano2, generoHermano2, edadHermano2, sociabilidadHermano2, empatiaHermano2, inteligenciaHermano2, velocidadHermano2, fuerzaHermano2));
                                System.out.println("");
                                System.out.println(imprimePersona(nombreHermano1, apellidosHermano1, generoHermano1, edadHermano1, sociabilidadHermano1, empatiaHermano1, inteligenciaHermano1, velocidadHermano1, fuerzaHermano1));
                                System.out.println("");
                                break;
                            case 1:
                                System.out.println(imprimePersona(nombreHermano2, apellidosHermano2, generoHermano2, edadHermano2, sociabilidadHermano2, empatiaHermano2, inteligenciaHermano2, velocidadHermano2, fuerzaHermano2));
                                System.out.println("");
                                System.out.println(imprimePersona(nombreHermano1, apellidosHermano1, generoHermano1, edadHermano1, sociabilidadHermano1, empatiaHermano1, inteligenciaHermano1, velocidadHermano1, fuerzaHermano1));
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println(imprimePersona(nombreHermano1, apellidosHermano1, generoHermano1, edadHermano1, sociabilidadHermano1, empatiaHermano1, inteligenciaHermano1, velocidadHermano1, fuerzaHermano1));
                                System.out.println("");
                                break;
                        }
                        break;

                    /**
                     * No tenemos nociones de lo que hace este case.
                     */
                    case 3:

                        break;

                    /**
                     * Este case incrementa la edad de todos más uno.
                     */
                    case 4:
                        edadPapa++;
                        edadMama++;
                        edadYo++;
                        break;

                    /**
                     * Este case finaliza el juego, bueno tu elejiste morir así
                     * que...
                     */
                    case 5:
                        System.out.println("Suicidiiiioooo");
                        break;

                }
            }
        }

    }
}
