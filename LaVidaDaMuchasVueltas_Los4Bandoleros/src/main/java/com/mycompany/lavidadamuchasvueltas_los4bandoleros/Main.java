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

/**
 *
 * @author Iván Carrillo
 * @author Noemí Ortega
 * @version 1.0
 */
public class Main {

    /**
     * En esta clase se leerán las variables de cada una de las funciones del
     * fichero FuncionesPersona.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        PAPA
         */
        Boolean generoPapa = false;
        String nombrePapa = nombreAleatorio(generoPapa);
        String apellidosPapa = apellidoAleatorio() + " " + apellidoAleatorio();
        byte edadPapa = valorEstadisticaAleatorio((byte) 30, (byte) 100);
        String vivoPapa;

        byte sociabilidadPapa = valorEstadisticaAleatorio((byte) 50, (byte) 100);
        byte empatiaPapa = valorEstadisticaAleatorio((byte) 50);
        byte inteligenciaPapa = valorEstadisticaAleatorio((byte) 50);
        byte velocidadPapa = valorEstadisticaAleatorio((byte) 50);
        byte fuerzaPapa = valorEstadisticaAleatorio((byte) 50, (byte) 100);
        System.out.println(imprimePersona(nombrePapa, apellidosPapa, generoPapa, edadPapa, sociabilidadPapa, empatiaPapa, inteligenciaPapa, velocidadPapa, fuerzaPapa));
        System.out.println("");

        /*
        MAMA
         */
        Boolean generoMama = false;
        String nombreMama = nombreAleatorio(generoPapa);
        String apellidosMama = apellidoAleatorio() + " " + apellidoAleatorio();
        byte edadMama = valorEstadisticaAleatorio((byte) 30, (byte) 100);
        String vivaMama;

        byte sociabilidadMama = valorEstadisticaAleatorio((byte) 50, (byte) 100);
        byte empatiaMama = valorEstadisticaAleatorio((byte) 50);
        byte inteligenciaMama = valorEstadisticaAleatorio((byte) 50);
        byte velocidadMama = valorEstadisticaAleatorio((byte) 50);
        byte fuerzaMama = valorEstadisticaAleatorio((byte) 50, (byte) 100);
        System.out.println(imprimePersona(nombreMama, apellidosMama, generoMama, edadMama, sociabilidadMama, empatiaMama, inteligenciaMama, velocidadMama, fuerzaMama));
        System.out.println("");

        /*
        YO
         */
        Boolean generoYo = generoAleatorio();
        String nombreYo = nombreAleatorio(generoPapa);
        String apellidosYo = (apellidosPapa = apellidoAleatorio()) + (apellidosMama = apellidoAleatorio());
        byte edadYo = 0;
        String vivoYo;

        byte sociabilidadMaxYo = valorEstadisticaAleatorio((byte) 50, (byte) 100);
        byte empatiaMaxYo = valorEstadisticaAleatorio((byte) 50);
        byte inteligenciaMaxYo = valorEstadisticaAleatorio((byte) 50);
        byte velocidadMaxYo = valorEstadisticaAleatorio((byte) 50);
        byte fuerzaMaxYo = valorEstadisticaAleatorio((byte) 50, (byte) 100);
        System.out.println(imprimePersona(nombreYo, apellidosYo, generoYo, edadYo, sociabilidadMaxYo, empatiaMaxYo, inteligenciaMaxYo, velocidadMaxYo, fuerzaMaxYo));
        System.out.println("");


        /*
        HERMANOS
         */
        // HERMANO 1
        Boolean generoHermano1;
        String nombreHermano1;
        String apellidosHermano1;
        byte edadHermano1;

        byte sociabilidadHermano1;
        byte empatiaHermano1;
        byte inteligenciaHermano1;
        byte velocidadHermano1;
        byte fuerzaHermano1;

        // HERMANO 2
        Boolean generoHermano2;
        String nombreHermano2;
        String apellidosHermano2;
        byte edadHermano2;

        byte sociabilidadHermano2;
        byte empatiaHermano2;
        byte inteligenciaHermano2;
        byte velocidadHermano2;
        byte fuerzaHermano2;

        // HERMANO 3
        Boolean generoHermano3;
        String nombreHermano3;
        String apellidosHermano3;
        byte edadHermano3;

        byte sociabilidadHermano3;
        byte empatiaHermano3;
        byte inteligenciaHermano3;
        byte velocidadHermano3;
        byte fuerzaHermano3;

        Random ran = new Random();
        byte nHermanos = (byte) ran.nextInt(4);
        switch (nHermanos) {
            case 0:
                generoHermano3 = generoAleatorio();
                nombreHermano3 = nombreAleatorio(generoPapa);
                apellidosHermano3 = apellidosYo;
                edadHermano3 = valorEstadisticaAleatorio((byte) 0, (byte) 50);

                sociabilidadHermano3 = valorEstadisticaAleatorio((byte) 50, (byte) 100);
                empatiaHermano3 = valorEstadisticaAleatorio((byte) 50);
                inteligenciaHermano3 = valorEstadisticaAleatorio((byte) 50);
                velocidadHermano3 = valorEstadisticaAleatorio((byte) 50);
                fuerzaHermano3 = valorEstadisticaAleatorio((byte) 50, (byte) 100);
                System.out.println(imprimePersona(nombreHermano3, apellidosHermano3, generoHermano3, edadHermano3, sociabilidadHermano3, empatiaHermano3, inteligenciaHermano3, velocidadHermano3, fuerzaHermano3));
                System.out.println("");
            case 1:
                generoHermano2 = generoAleatorio();
                nombreHermano2 = nombreAleatorio(generoPapa);
                apellidosHermano2 = apellidosYo;
                edadHermano2 = valorEstadisticaAleatorio((byte) 0, (byte) 50);

                sociabilidadHermano2 = valorEstadisticaAleatorio((byte) 50, (byte) 100);
                empatiaHermano2 = valorEstadisticaAleatorio((byte) 50);
                inteligenciaHermano2 = valorEstadisticaAleatorio();
                velocidadHermano2 = valorEstadisticaAleatorio((byte) 50);
                fuerzaHermano2 = valorEstadisticaAleatorio((byte) 50, (byte) 100);
                System.out.println(imprimePersona(nombreHermano2, apellidosHermano2, generoHermano2, edadHermano2, sociabilidadHermano2, empatiaHermano2, inteligenciaHermano2, velocidadHermano2, fuerzaHermano2));
                System.out.println("");
            case 2:
                generoHermano1 = generoAleatorio();
                nombreHermano1 = nombreAleatorio(generoPapa);
                apellidosHermano1 = apellidosYo;
                edadHermano1 = valorEstadisticaAleatorio((byte) 0, (byte) 50);

                sociabilidadHermano1 = valorEstadisticaAleatorio((byte) 50, (byte) 100);
                empatiaHermano1 = valorEstadisticaAleatorio((byte) 50);
                inteligenciaHermano1 = valorEstadisticaAleatorio();
                velocidadHermano1 = valorEstadisticaAleatorio((byte) 50);
                fuerzaHermano1 = valorEstadisticaAleatorio((byte) 50, (byte) 100);
                System.out.println(imprimePersona(nombreHermano1, apellidosHermano1, generoHermano1, edadHermano1, sociabilidadHermano1, empatiaHermano1, inteligenciaHermano1, velocidadHermano1, fuerzaHermano1));
                System.out.println("");
            case 3:

                break;
        }

    }
}
