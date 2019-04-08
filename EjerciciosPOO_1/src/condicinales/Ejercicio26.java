/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicinales;

import java.util.Scanner;

/**
 *
 * @author LA MATRIX
 */
public class Ejercicio26 {
     public void operacion() {

        int a, b, c;
        Scanner entrada = new Scanner(System.in);
        System.out.println("***numeros pares e impares***\n");

        System.out.println("diigite un numero");
        a = entrada.nextInt();
        b = a % 2;
        if (b == 0) {
            System.out.println("el numero "+ a +" es par");
        } else {
            System.out.println("el numero "+ a +" es impar");
        }
    }
    
}
