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
        Boolean generoPapa = true;
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
        yo
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
    }
}
