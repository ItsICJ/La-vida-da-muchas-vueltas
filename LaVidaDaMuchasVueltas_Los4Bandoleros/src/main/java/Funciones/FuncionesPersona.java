/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.util.Random;

/**
 * Funciones para asignar valor a las variables de cada persona.
 *
 * @author Iván Carrillo
 * @author Noemí Ortega
 * @version 1.0
 */
public class FuncionesPersona {

    /**
     * Creamos la función generoAleatorio, que devolverá un género aleatorio
     * mediante un booleano, las opciones serán hombre(true) o mujer(false).
     *
     * @return generoAleatorio(hombre(true) o mujer(false))
     */
    public static Boolean generoAleatorio() {
        Random ran = new Random();
        boolean genero = ran.nextBoolean();
        return genero;
    }

    /**
     * Creamos la función nombreAleatorio que generará un nombre aleatorio entre
     * un conjunto de opciones distintas dependiendo de si el género que recibe
     * por argumentos es hombre o mujer
     *
     * @param genero
     * @return retA(nombre de hombre o mujer)
     */
    public static String nombreAleatorio(boolean genero) {
        String retA = "";

        if (genero) {//si es verdadero el nombre es de hombre.
            Random r = new Random();
            String[] nombresHombre = {"Eustaquio", "Fernando", "Mariano", "Antón", "Claudio",
                "Koldo", "Patricio", "Alexis", "Manuel", "Rafael", "Mauricio", "Gregorio",
                "Íker", "Carlos", "Javier", "Francisco", "Nemesio", "Anselmo", "Miguel",
                "Ignacio", "Óscar", "Alex", "Juán", "Lander", "Agustín", "César", "Nacho",
                "Javier", "Jorge", "Pablo", "Guillermo", "Pepe", "Gabriel", "Francisco",
                "Franco", "Miguel", "Gonzalo", "Abrahán", "Luís", "Rafael", "Alberto", "Raúl",
                "Abel", "Antonio", "Enrique", "José", "Adrián", "Darío", "Mateo", "Alejandro",
                "Leandro", "Enzo", "Paco", "Amador", "Félix"};
            retA = (nombresHombre[r.nextInt(nombresHombre.length)] + " ");
        } else {//si es falso el nombre es de mujer.
            Random r = new Random();
            String[] nombresMujer = {"Cristobalina", "Paca", "Presentación", "Sarai", "Antonia",
                "Loli", "Juani", "Olga", "Susana", "Ruth", "Eustaquia", "Josefina", "Úrsula", "Angie",
                "Carla", "Isabel", "Marta", "Dolores", "Sonia", "Raquel", "Esther", "Érika", "Luisa",
                "Natalia", "Almudena", "Laura", "Kassandra", "Violeta", "María", "Mery", "Susana",
                "Daniela", "Rebeca", "Herminia", "Sandra", "Lorena", "Paula", "Ainhoa", "Mar",
                "Manoli", "Julia", "Rocío", "Marina", "Arelis", "Blanca", "Celeste", "Yolanda",
                "Noemí", "Nuria", "Carmen", "Sheila", "Lucía", "Alma", "Cristina", "Lucy",
                "Tamara", "Victoria"};
            retA = (nombresMujer[r.nextInt(nombresMujer.length)] + " ");
        }
        return retA;

    }

    /**
     * Creamos la función apellidosAleatorio, que devolverá un apellido
     * aleatorio entre las distintas opciones.
     *
     * @return retB(apellido aletorio)
     */
    public static String apellidoAleatorio() {
        String retB = "";
        Random r = new Random();
        String[] apellidos = {"Fernández", "De todos los santos", "Heredia", "Aguirre", "Del Piero",
            "Pérez", "Reverte", "Rojas", "Muñoz", "de la Rosa", "Guiérrez", "Molina", "López", "Romero",
            "León", "Martínez", "Fernández", "Bas", "Ortega", "Córdoba", "Vega", "Guzmán", "Varo",
            "Páramos", "Vivo", "Pernas", "García", "Laago", "Pinto", "Pintor", "Delgado", "Vietes",
            "Portero", "Pestaña", "Guerrero", "Sardà", "Reyes", "Callado", "Santisteban", "Rubio",
            "Flores", "Carmona", "Gallego", "Ventura", "Melero", "Morales", "Soldado", "Silva",
            "Hernández", "Ruíz", "Machís", "Duarte", "Díaz", "Vico", "Montoro", "Reyero", "Gamarra"};
        retB = (apellidos[r.nextInt(apellidos.length)]);
        return retB;
    }

    /**
     * Esta función sin argumentos genera un número entre 0 y 100.
     *
     * @return el número random creado por sí misma
     */
    public static byte valorEstadisticaAleatorio() {
        Random ran = new Random();
        return (byte) ran.nextInt(100);
    }

    /**
     * Esta función recibe un argumento numérico llamado min, genera un número
     * aleatorio entre min y 100.
     *
     * @param min
     * @return a(número aleatorio entre min y 100 creado por sí misma)
     */
    public static byte valorEstadisticaAleatorio(byte min) {
        Random ran = new Random();
        byte a = (byte) (ran.nextInt((100 - min)) + min);
        return a;
    }

    /**
     * Esta función recibe dos argumentos numéricos, llamados min y max,
     * generará y devolverá un número aleatorio entre min y max, con ambos
     * incluídos.
     *
     * @param min
     * @param max
     * @return b(número aleatorio entre min y max creado por sí misma)
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
     * @param nombre (nombre de la persona según su género)
     * @param apellidos (apellidos de la persona)
     * @param genero (hombre o mujer)
     * @param sociabilidad (valor numérico random referente a la sociabilidad de
     * la persona)
     * @param empatia(valor numérico random referente a la empatía de la
     * persona)
     * @param inteligencia(valor numérico random referente a la inteligencia de
     * la persona)
     * @param velocidad(valor numérico random referente a la velocidad de la
     * persona)
     * @param fuerza(valor numérico random referente a la fuerza de la persona)
     * @return retC(el valor de todos los parámetros creados por las funciones
     * anteriores)
     */
    public static String imprimePersona(String nombre, String apellidos, boolean genero, byte edad, byte sociabilidad,
            byte empatia, byte inteligencia, byte velocidad, byte fuerza) {
        String retC = "";
        retC = nombre + apellidos + "(" + (genero ? "hombre" : "mujer") + ")" + "\n----------------------------------" + "\nEdad= " + edad + "\nSociabilidad= " + sociabilidad
                + "\nEmpatía= " + empatia + "\nInteligencia= " + inteligencia
                + "\nVelocidad= " + velocidad + "\nFuerza= " + fuerza;
        return retC;
    }

}
