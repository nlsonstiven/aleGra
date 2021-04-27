/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alejandragrajales;

import java.util.Scanner;

/**
 *
 * @author ncuellar
 */
public class AlejandraGrajales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        /**
         * Aca creamos el cuadro sin pedir variables , en este caso haremos 
         * un cuadro de 10x10
         **/
        
        
        //Primer Cuadro relleno
        
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(" - ");
            }
            System.out.print("\n");
        }
        
        System.out.print("\n\n");
        
        
        //Segundo Cuadro solo Borde
        
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(j==0 || j==9 || i==0 || i==9)
                {
                    System.out.print(" - ");
                }
                else{
                    //Este salto de linea es para que al finalizar una fila 
                    //brinque y no quede todo en una sola linea
                   System.out.print("   "); 
                }
            }
            System.out.print("\n");
        }
        
        
        
        
        /**
         * Aca vamnos a crear el cuadro pidiendo el ancho por el alto
         */
        
        
        //Declaramos dos variables enteras para el ancho y el alto del cuadro
        int ancho, alto;
        
        
        //Llamamos nuestra libreria para recibir datos por consola
        Scanner ingresoDatos = new Scanner(System.in);
        
        //Pedimos el valor del ancho
        System.out.print("Ingrese un numero entero para determinar el ancho del cuadro:");
        ancho = ingresoDatos.nextInt();
        System.out.print("\n");
        
        //Pedimos el ancho del cuadro
        System.out.print("Ingrese un numero entero para determinar el alto del cuadro:");
        alto = ingresoDatos.nextInt();
        System.out.print("\n");
        
        
        //Empezamos a pintar el cuadro
        
        for(int an=1;an<=ancho;an++){
            for(int alt = 1;alt<=alto;alt++){
                System.out.print(" - ");
            }
            System.out.print("\n");
        }
        
        
        
        System.out.print("\n\n");
        
        
        
    }
    
}
