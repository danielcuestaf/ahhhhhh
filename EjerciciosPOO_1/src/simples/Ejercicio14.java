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
public class Ejercicio14 {
    public void operacion() {

        Double a, b, c, resultado;
        System.out.println("***evaluando la ecuacion cuadratica***");
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el valor de a");
        a = entrada.nextDouble();
        System.out.println("ingrese el valor de b");
        b = entrada.nextDouble();
        System.out.println("ingrese el valor de c");
        c = entrada.nextDouble();

        resultado = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * c);
        System.out.println("evaluando la ecuacion cuadratica donde a ="+a+" b= "+b+" c= "+c+" da como resultado "+resultado);

    }
}
