/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usofor;

/**
 *
 * @author Jose
 */
public class UsoFor {

    /**
     * @param args the command line arguments
     */
     //agrego comentario
    //Agrego otro Comentario
    //agrego comentario Alumno.
    public static void main(String[] args) {
        // TODO code application logic here
        int acumulador=0;
      //for sencillo imprime los numero del 1 al 100
        for(int x=1;x<=100;x++)
        {
          System.out.println(x);
        }
      //for sencillo para sumar los primeros 100 numeros
        for(int x=1;x<=100;x++)
        {
          acumulador=acumulador+x;
        }
        System.out.println("La suma de los primeros cien numeros es: "+acumulador);
        
      //for anidado imprimir las tablas de multiplicar
        for(int tabla=1;tabla<=10;tabla++) //Controlar la tabla de multiplicar
        {
          for(int mult=1;mult<=10;mult++) //controlar el numero que multipliza la tabla
           {
            System.out.println(tabla + " x " + mult + " = " + tabla*mult);
           }
        }
    }
}
