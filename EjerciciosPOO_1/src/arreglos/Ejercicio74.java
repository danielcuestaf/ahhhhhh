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
public class Ejercicio74 {
     public void operacion(){
        String a;
        int c;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("***cadena inversa***\n");
        
        System.out.println("ingresa un acadena de caracteres");
        a = entrada.nextLine();
        
        c = a.length();
        char[] cadena = new char[c];
        char[] inversa = new char[c];
        
        System.out.println("cadena original");
        for(int i = 0; i < c; i++){
            cadena[i] = a.charAt(i);
            System.out.print(cadena[i]);
        }
        System.out.println("");
        System.out.println("cadena inversa");
        for(int i = 0; i < c; i++){
            inversa[i] = cadena[c-(i+1)];
            System.out.print(inversa[i]);
        }
        System.out.println("");
    }
    
}
