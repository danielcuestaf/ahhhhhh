/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

/**
 *
 * @author LA MATRIX
 */
public class Ejercicio50 {
    public void operacion() {

        int a, b, c, d, e, media1, media2;
        System.out.println("***suma de numeros pares e inpares de 1 a 200***\n");
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        for (int i = 0; i <= 200; i++) {
            a = i % 2;
            if (a == 0) {
                b = b + i;
                c = c + 1;
            } else {
                d = d + i;
                e = e + 1;
            }
        }
        media1 = d / e;
        media2 = b / c;
        System.out.println("la suma de los numeros pares hasta el 200 es: " + b);
        System.out.println("la media de los numeros pares hasta el 200 es: " + media2 + "\n");
        System.out.println("la suma de los numeros impares hasta el 200 es: " + d);
        System.out.println("la media de los numeros impares hasta el 200 es: " + media1);
    }
    
}
