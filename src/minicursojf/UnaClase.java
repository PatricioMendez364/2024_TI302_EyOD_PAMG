/*
ITESS
TICS
Agosto - Diciembre 2024
Estructura y organizacion de datos
Profesor Francisco Javier Montecillo Puente
Programador Patricio Arturo Mendez Gonzalez
Desctripcion: -Tipo de estructura de una clase-
2 de septiembre
*/


//Ptimera linea valida de un codigo: el package.
package minicursojf;


//Segunda linea es el o los importes.
import java.util.*;

        
//Tercela linea es el "class", ya sea public o no. Si es public, debe tener el nombre del archivo.
public class UnaClase {
    //Se pueden crear clases adentro de otras clases.
       //Los atributos de una clase
        private int numero = 18;
        private double numero2 = 32;
        private float numero3 = 31;

    public UnaClase(int numero, double numero2, float numero3) {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public float getNumero3() {
        return numero3;
    }

    public void setNumero3(float numero3) {
        this.numero3 = numero3;
    }

    @Override
    public String toString() {
        return "UnaClase{" + "numero=" + numero + ", numero2=" + numero2 + ", numero3=" + numero3 + '}';
    }
 
    }



