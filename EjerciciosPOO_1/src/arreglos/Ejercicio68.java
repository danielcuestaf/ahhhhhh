/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author LA MATRIX
 */
public class Ejercicio68 {
    public void operacion(){
        
        int a, b;
        int matriz[][] = {{5, 6, 7, 9, 0}, {11, 8, 2, 0, 0}};
        
        System.out.println("***suma de filas de matrices***\n");
        System.out.println("matriz inicial\n");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        // suma de arrays
        for (int i = 0; i < 2; i++) {
            a = 0;
            for (int j = 0; j < 5; j++) {
                a = matriz[i][j] + a;
            }
            matriz[i][4] = a; 
        }
        System.out.println("");
        System.out.println("el resultado de la suma de filas esta en la ultima posicion\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
}
