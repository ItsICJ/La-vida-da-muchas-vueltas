/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lavidadamuchasvueltas_los4bandoleros;

import static Funciones.FuncionesPersona.nombreAleatorio;
import static Funciones.FuncionesPersona.apellidoAleatorio;
import static Funciones.FuncionesPersona.generoAleatorio;

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
        Boolean generoPapa = generoAleatorio();
        String nombrePapa = nombreAleatorio(generoPapa);
        String apellidosPapa = apellidoAleatorio() + " " + apellidoAleatorio();

        byte sociabilidadPapa;
        byte empatiaPapa;
        byte inteligenciaPapa;
        byte velocidadPapa;
        byte fuerzaPapa;

        /*
        MAMA
         */
        Boolean generoMama = generoAleatorio();
        String nombreMama = nombreAleatorio(generoMama);
        String apellidosMama = apellidoAleatorio() + " " + apellidoAleatorio();

        byte sociabilidadMama;
        byte empatiaMama;
        byte inteligenciaMama;
        byte velocidadMama;
        byte fuerzaMama;

        /*
        yo
         */
        Boolean generoYo = generoAleatorio();
        String nombreYo = nombreAleatorio(generoYo);
        String apellidoYo = apellidoAleatorio() + " " + apellidoAleatorio();

        int sociabilidadMaxYo;
        int empatiaMaxYo;
        int inteligenciaMaxYo;
        int velocidadMaxYo;
        int fuerzaMaxYo;

    }
}
