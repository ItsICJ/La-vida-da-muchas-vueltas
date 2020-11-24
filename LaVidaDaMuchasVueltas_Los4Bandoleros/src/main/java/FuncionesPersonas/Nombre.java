/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesPersonas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author noemi
 */
public class Nombre {

    public static void nombreAleatorio() {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        byte nPerson;

        /*NÚMERO PERSONAS*/
        System.out.println("¿Cuántas personas quieres generar?");
        do {
            nPerson = Byte.parseByte(sc.nextLine());
            if (nPerson < 1 || nPerson > 5) {
                System.out.println("¡Mínimo 1 y máximo 5!");
            }
        } while (nPerson < 1 || nPerson > 5);

        for (int i = 1; i <= nPerson; i++) {
            System.out.println(i + "º Persona:");
            /**
             * *********DNI**********
             */
            /*NÚMERO*/
            System.out.print("\tDNI ");
            for (int j = 0; j < 8; j++) {
                int dniN = ran.nextInt(9);
                System.out.print(dniN);
            }

            /*LETRA*/
            char dniL = (char) (ran.nextInt(90 - 65) + 'A');

            System.out.println(dniL);

            /**
             * *********GÉNERO**********
             */
            boolean genero = ran.nextBoolean();
            if (genero == true) {
                System.out.println("\tGÉNERO Hombre");
                /**
                 * *********NOMBRE**********
                 */
                /*HOMBRE*/
                System.out.print("\tNOMBRE ");
                byte nombreH = (byte) ran.nextInt(5);
                switch (nombreH) {
                    case 0:
                        System.out.print("Alejandro ");
                        break;
                    case 1:
                        System.out.print("Juan ");
                        break;
                    case 2:
                        System.out.print("Jorge ");
                        break;
                    case 3:
                        System.out.print("Pedro ");
                        break;
                    case 4:
                        System.out.print("Mariano ");
                        break;
                }
            } else {
                System.out.println("\tGÉNERO Mujer");
                /*MUJER*/
                System.out.print("\tNOMBRE ");
                byte nombreM = (byte) ran.nextInt(5);
                switch (nombreM) {
                    case 0:
                        System.out.print("Raquel ");
                        break;
                    case 1:
                        System.out.print("Marta ");
                        break;
                    case 2:
                        System.out.print("Sandra ");
                        break;
                    case 3:
                        System.out.print("Esther ");
                        break;
                    case 4:
                        System.out.print("Rocío ");
                        break;
                }
            }
            /**
             * *********APELLIDO**********
             */
            byte apellido = (byte) ran.nextInt(5);
            switch (apellido) {
                case 0:
                    System.out.println("Ramírez");
                    break;
                case 1:
                    System.out.println("González");
                    break;
                case 2:
                    System.out.println("Carrión");
                    break;
                case 3:
                    System.out.println("Piñas");
                    break;
                case 4:
                    System.out.println("Peña");
                    break;
            }
            /**
             * *********EDAD**********
             */
            int edad = ran.nextInt(90 - 18) + 0;
            System.out.println("\tEDAD " + edad);
        }
    }

}
