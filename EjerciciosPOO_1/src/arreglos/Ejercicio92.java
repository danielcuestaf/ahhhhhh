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
public class Ejercicio92 {
    Double preciototal;
    Double porcentaje;
    Double precios;
    String descuentos;
    
    public void ventas(Double unidades,Double precio){
        preciototal = precio*unidades;
        
        if (12 <= unidades){
           descuentos = "10%"; 
           porcentaje = (10 * preciototal)/100; 
        }
        if( 6 <= unidades && unidades < 12) {
            descuentos = "4%";
            porcentaje = (4 * preciototal)/100;
        }else{
            descuentos = "0%";
            porcentaje = 0.0;
        }
    }
    
    public void preciofinal(){
        precios = preciototal - porcentaje;
        System.out.println("el precio total con el descuento del "+descuentos+" es: "+precios);
    }
    
}
