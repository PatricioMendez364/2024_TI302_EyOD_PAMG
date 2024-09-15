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


public class Arreglos {
    private int arr[] = new int [10]; 
    
    public void fill0to9(){ //1
        for(int i = 0; i<arr.length; i++){
            arr[i]= i;
        }
    }
    
    public void metodoClean(){ //2
        for(int i = 0; i<arr.length; i++){
            arr[i]= 0;
        }
    }
    
    public void metodo01(){ //3
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                arr[i]= 0;
            } else {
                arr[i]= 1;
            }
        }
    }
    
    public void metodo10(){ //4
        for(int i = 0; i<arr.length; i++){
            
            if(arr[i]%2 == 0){
                arr[i]= 1;
            } else {
                arr[i]= 0;
            }
        }
    }
    
    public void fill9to0(){ //5
        for(int i = 0; i<arr.length; i++){
            arr[i]= arr.length - i -1;
        }
    }
    
    public void shiftRight(){ //6
        int aux1 = arr[0];
        int aux2 = arr[0];
        for(int i = 0; i<arr.length - 1; i++){
            aux2 = arr[i+1];
            arr[i+1] =  aux1;
            aux1 = aux2;  
        }
        arr[0] = aux1;
    }

    @Override
    public String toString() {
        String str = "";
        
        for(int i = 0; i<arr.length ; i++)
            str += arr[i] + " ";
        
        return str;
    }
}


    





