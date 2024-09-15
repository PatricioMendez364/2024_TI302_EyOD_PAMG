/*
ITESS
TICS
Agosto - Diciembre 2024
Estructura y organizacion de datos
Profesor Francisco Javier Montecillo Puente
Programador Patricio Arturo Mendez Gonzalez
Desctripcion: -Practica de arreglos-
3 de septiembre
*/

package minicursojf;


public class ArreglosTest {
    public static void main(String[] args) { //el "args es otro objeto ya que es un arregloñ
        Arreglos arreglo = new Arreglos();
        
        arreglo.fill0to9(); //1
        System.out.println(arreglo.toString());
        
        arreglo.metodoClean(); //2
        System.out.println(arreglo.toString());
        
        arreglo.metodo01(); //3
        System.out.println(arreglo.toString());
        
        arreglo.metodo10(); //4
        System.out.println(arreglo.toString());
        
        arreglo.fill9to0(); //5
        System.out.println(arreglo.toString());
        
        arreglo.shiftRight();
        System.out.println(arreglo.toString());
        
        }
}

