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
public class Ejercicio8 {
    public void operacion(){
        
        Double a,b,area;
        
        System.out.println("***calculadora de el area del triangulo***");
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la base del triangulo");
        b = entrada.nextDouble();
        System.out.println("ingrese la altura del triangulo");
        a = entrada.nextDouble();
        
        area = (b*a)/2;
        
        System.out.println("el area del triangulo de base "+ b +" y de altura "+ a +" es: "+ area);
        
    }  
}
