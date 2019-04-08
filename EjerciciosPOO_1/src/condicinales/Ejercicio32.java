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
public class Ejercicio32 {
    public void operacion(){
        int a,b,c;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("***ejercicio 32***\n");
        System.out.println("formato (horas,minutos,segundos)");
        System.out.println("ingrese una hora");
        a = entrada.nextInt();
        if(a > 24){
            System.out.println("algo no ha salido como se esperaba......");
            System.exit(0);
        }
        System.out.println("ingrese los minutos");
        b = entrada.nextInt();
        if(b > 60){
            System.out.println("algo no ha salido como se esperaba......");
            System.exit(0);
        }
        System.out.println("ingrese los segundos");
        c = entrada.nextInt();
        if(a > 60){
            System.out.println("algo no ha salido como se esperaba......");
            System.exit(0);
        }
        c = c+1;
        
        if(c == 60){
            c = 0;
            b = b + 1;
        }
        if(b == 60){
            b = 0;
            a = a + 1;
        }
        if(a == 24){
            a = 0;
        }
        System.out.println("la nueva hora es: "+a+" : "+b+" : "+c);
    }
    
}
