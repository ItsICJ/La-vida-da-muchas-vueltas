/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lavidadamuchasvueltas_los4bandoleros;

import static FuncionesPersona.Nombre.nombreAleatorio;
import static FuncionesPersona.Genero.generoAleatorio;
import static FuncionesPersona.Apellidos.apellidosAleatorio;

import java.util.Random;

/**
 *
 * @author Ivan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boolean generoYo = generoAleatorio();
        String nombreYo = nombreAleatorio();
        String apellidoYo = apellidosAleatorio();

    }
}
