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
public class Ejercicio80 {
    public void operation(){
        String a;
        int b,c;
        Scanner entrada = new Scanner(System.in);
        System.out.println("***programa de encriotacion de numeros***\n");
        System.out.println("digite una cadena de numeros");
        a = entrada.nextLine();
        
        b = a.length();
        
        char[] numeros = new char[b];
        String[] letras = new String[b];
        int[] numero = new int[b];
       
        for(int i = 0; i < b; i++){
            numeros[i] = a.charAt(i);
            letras[i] = Character.toString(numeros[i]) ;
            numero[i] = Integer.parseInt(letras[i]);
            c = i%2;
            if(c == 0){
                numero[i] = (numero[i] + 2);
            }else{
                numero[i] = (numero[i] + 3);
            }
            System.out.println(numero[i]);
        }
        
    }
}
