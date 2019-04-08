/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author LA MATRIX
 */
public class Ejercicio86 {
    public void operacion() {
        String a, b, d, e;
        int c;
        Scanner entrada = new Scanner(System.in);

        System.out.println("***cadena inversa***\n");

        System.out.println("ingresa un acadena de caracteres");
        b = entrada.nextLine();
        a = b.replace(" ", "");

        c = a.length();
        char[] cadena = new char[c];
        char[] inversa = new char[c];
        String[] cadena1 = new String[c];
        String[] cadena2 = new String[c];

        StringBuffer enlase = new StringBuffer();
        StringBuffer enlase2 = new StringBuffer();

        for (int i = 0; i < c; i++) {
            cadena[i] = a.charAt(i);
            cadena1[i] = Character.toString(cadena[i]);
            enlase = enlase.append(cadena1[i]);
        }
        d = enlase.toString();
        for (int i = 0; i < c; i++) {
            inversa[i] = cadena[c - (i + 1)];
            cadena2[i] = Character.toString(inversa[i]);
            enlase2 = enlase2.append(cadena2[i]);
        }
        e = enlase2.toString();
        if (d.equals(e)) {
            System.out.println("la frase " + b + " es un palindromo");
        } else {
            System.out.println("la frase " + b + " no es un palindromo");
        }
    }
    
}
