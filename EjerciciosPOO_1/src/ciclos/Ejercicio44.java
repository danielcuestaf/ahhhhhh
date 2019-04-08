/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author LA MATRIX
 */
public class Ejercicio44 {
    public void operacion(){
        
        int a,b,c,d;
        b = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("***Numero Factorial***\n");
        
        System.out.println("ingrese un numero");
        a = entrada.nextInt();
        for(int i = 1; i <= a; i++){
            b = i* b;
        }
        System.out.println(b);
        
    }
    
}
