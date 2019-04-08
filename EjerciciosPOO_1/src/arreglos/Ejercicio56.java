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
public class Ejercicio56 {
     public void operation(){
        int a,b,c,d;
        Scanner entrada = new Scanner(System.in);
        
        int[] numero = new int[5];
        int[] numeros = new int[5];
        
        System.out.println("desde donde deseas empesar la sucesion de numeros");
        a = entrada.nextInt();
        for(int i = 0; i < 5; i++){
            numero[i] = a + i;
        }
        System.out.println("datos del arreglo 1: \n");
        for(int i = 0; i < 5; i++){
            System.out.println("Dato "+(i+1)+": "+numero[i]);
        }
        
        for(int i = 0; i < 5 ; i++) {
           numeros[i] = numero[i];
        }
        System.out.println("datos del arreglo 2: \n");
        for (int i = 0; i < 5 ; i++){
            System.out.println("Dato "+(i+1)+": "+numeros[i]);
        }
    }
    
}
