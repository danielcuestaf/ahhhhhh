/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simples;

import java.util.Scanner;

/**
 *
 * @author LA MATRIX
 */
public class Ejercicio20 {
    public void operacion() {

        Double a, b;

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la longitud (en metros) que desea convertir");
        a = entrada.nextDouble();
        b = (a * 39.27) / 12;

        System.out.println("el resultado de la distancia" + a + "m en pies es: " + b + "m");

    }
    
}

