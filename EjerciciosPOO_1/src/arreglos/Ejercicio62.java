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
public class Ejercicio62 {

    public void operation() {
        int a, b, c, d;

        int[] numeros = new int[10];

        Scanner entrada = new Scanner(System.in);

        System.out.println("***programa de ubicacion del mayor y menor dato***\n");

        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese el dato " + (i + 1) + ":");
            numeros[i] = entrada.nextInt();
        }
        a = 0;
        b = 0;
        for (int i = 0; i < 10; i++) {

            if (numeros[i] >= numeros[a]) {
                a = i;
            }
            if (numeros[i] <= numeros[b]) {
                b = i;
            }
        }
        System.out.println("la posicion del numero menor es: " + b + " correspondiente a " + numeros[b]);
        System.out.println("la posicion del numero mayor es: " + a + " correspondiente a " + numeros[a]);
    }

}
