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

        byte sopaciabilidadPapa = valorEstadisticaAleatorio((byte) 50, (byte) 100);
        byte empatiaPapa = valorEstadisticaAleatorio((byte) 50);
        byte inteligenciaPapa = valorEstadisticaAleatorio();
        byte velocidadPapa = valorEstadisticaAleatorio((byte) 50);
        byte fuerzaPapa = valorEstadisticaAleatorio((byte) 50, (byte) 100);
        System.out.println(imprimePersona(nombrePapa, apellidosPapa, generoPapa, sopaciabilidadPapa, empatiaPapa, inteligenciaPapa, velocidadPapa, fuerzaPapa));
        System.out.println("");

        /*
        MAMA
         */
        Boolean generoMama = false;
        String nombreMama = nombreAleatorio(generoPapa);
        String apellidosMama = apellidoAleatorio() + " " + apellidoAleatorio();

        byte sopaciabilidadMama = valorEstadisticaAleatorio((byte) 50, (byte) 100);
        byte empatiaMama = valorEstadisticaAleatorio((byte) 50);
        byte inteligenciaMama = valorEstadisticaAleatorio();
        byte velocidadMama = valorEstadisticaAleatorio((byte) 50);
        byte fuerzaMama = valorEstadisticaAleatorio((byte) 50, (byte) 100);
        System.out.println(imprimePersona(nombreMama, apellidosMama, generoMama, sopaciabilidadMama, empatiaMama, inteligenciaMama, velocidadMama, fuerzaMama));
        System.out.println("");

        /*
        YO
         */
        Boolean generoYo = generoAleatorio();
        String nombreYo = nombreAleatorio(generoPapa);
        String apellidosYo = apellidoAleatorio() + " " + apellidoAleatorio();

        byte sopaciabilidadYo = valorEstadisticaAleatorio((byte) 50, (byte) 100);
        byte empatiaYo = valorEstadisticaAleatorio((byte) 50);
        byte inteligenciaYo = valorEstadisticaAleatorio();
        byte velocidadYo = valorEstadisticaAleatorio((byte) 50);
        byte fuerzaYo = valorEstadisticaAleatorio((byte) 50, (byte) 100);
        System.out.println(imprimePersona(nombreYo, apellidosYo, generoYo, sopaciabilidadYo, empatiaYo, inteligenciaYo, velocidadYo, fuerzaYo));
        System.out.println("");


        /*
        HERMANOS
         */
        // HERMANO 1
        Boolean generoHermano1;
        String nombreHermano1;
        String apellidosHermano1;

        byte sopaciabilidadHermano1;
        byte empatiaHermano1;
        byte inteligenciaHermano1;
        byte velocidadHermano1;
        byte fuerzaHermano1;

        // HERMANO 2
        Boolean generoHermano2;
        String nombreHermano2;
        String apellidosHermano2;

        byte sopaciabilidadHermano2;
        byte empatiaHermano2;
        byte inteligenciaHermano2;
        byte velocidadHermano2;
        byte fuerzaHermano2;

        // HERMANO 3
        Boolean generoHermano3;
        String nombreHermano3;
        String apellidosHermano3;

        byte sopaciabilidadHermano3;
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
                apellidosHermano3 = apellidoAleatorio() + " " + apellidoAleatorio();

                sopaciabilidadHermano3 = valorEstadisticaAleatorio((byte) 50, (byte) 100);
                empatiaHermano3 = valorEstadisticaAleatorio((byte) 50);
                inteligenciaHermano3 = valorEstadisticaAleatorio();
                velocidadHermano3 = valorEstadisticaAleatorio((byte) 50);
                fuerzaHermano3 = valorEstadisticaAleatorio((byte) 50, (byte) 100);
                System.out.println(imprimePersona(nombreHermano3, apellidosHermano3, generoHermano3, sopaciabilidadHermano3, empatiaHermano3, inteligenciaHermano3, velocidadHermano3, fuerzaHermano3));
                System.out.println("");
            case 1:
                generoHermano2 = generoAleatorio();
                nombreHermano2 = nombreAleatorio(generoPapa);
                apellidosHermano2 = apellidoAleatorio() + " " + apellidoAleatorio();

                sopaciabilidadHermano2 = valorEstadisticaAleatorio((byte) 50, (byte) 100);
                empatiaHermano2 = valorEstadisticaAleatorio((byte) 50);
                inteligenciaHermano2 = valorEstadisticaAleatorio();
                velocidadHermano2 = valorEstadisticaAleatorio((byte) 50);
                fuerzaHermano2 = valorEstadisticaAleatorio((byte) 50, (byte) 100);
                System.out.println(imprimePersona(nombreHermano2, apellidosHermano2, generoHermano2, sopaciabilidadHermano2, empatiaHermano2, inteligenciaHermano2, velocidadHermano2, fuerzaHermano2));
                System.out.println("");
            case 2:
                generoHermano1 = generoAleatorio();
                nombreHermano1 = nombreAleatorio(generoPapa);
                apellidosHermano1 = apellidoAleatorio() + " " + apellidoAleatorio();

                sopaciabilidadHermano1 = valorEstadisticaAleatorio((byte) 50, (byte) 100);
                empatiaHermano1 = valorEstadisticaAleatorio((byte) 50);
                inteligenciaHermano1 = valorEstadisticaAleatorio();
                velocidadHermano1 = valorEstadisticaAleatorio((byte) 50);
                fuerzaHermano1 = valorEstadisticaAleatorio((byte) 50, (byte) 100);
                System.out.println(imprimePersona(nombreHermano1, apellidosHermano1, generoHermano1, sopaciabilidadHermano1, empatiaHermano1, inteligenciaHermano1, velocidadHermano1, fuerzaHermano1));
                System.out.println("");
            case 3:
                
                break;
        }

    }
}
