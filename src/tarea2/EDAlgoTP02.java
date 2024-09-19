 /*
ITESS
TICS
Agosto - Diciembre 2024
Estructura y organizacion de datos
Profesor Francisco Javier Montecillo Puente
Programador Patricio Arturo Mendez Gonzalez
Desctripcion: -Tarea 2 -
18 de septiembre
*/
package tarea2;

import java.util.Random;

public class EDAlgoTP02 {
    
    private int arrA[];
    private int arrB[];
    private int arrC[];
    private int arrF[];
    private int arrG[];
    private int arrW[];
    
    
    
    
    public static void E1(){
        
    }
    
    public static void E5(){
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        
        int tiradan;
        
        System.out.println("¡Bienvenido!");
        System.out.println("Tiro de dado 1: " + dado1);
        System.out.println("Tiro de dado 2: " + dado2);
        
        int punto = dado1 + dado2;
        
        System.out.println("El punto es: " + punto);
                    
        switch (punto) {
            case 7 -> System.out.println("¡Ganaste!");
            case 11 -> System.out.println("¡Ganaste!");
            case 2 -> System.out.println("¡Perdiste!");
            case 3 -> System.out.println("¡Perdiste!");
            case 12 -> System.out.println("¡Perdiste!");
            default -> {
                System.out.println("Sigues jugando...");
                
                tiradan = punto;
                
                int n = 0;
                while(tiradan != 7){
                    tiradan = random.nextInt(6) + 1 + random.nextInt(6) + 1;
                    n = n + 1;
                    System.out.println("Tirada " + n + " da como resultado: " + tiradan);
                    if(tiradan == punto){
                        System.out.println("¡Ganaste!");
                    } else if(tiradan == 7){
                            System.out.println("¡Perdiste!");
                            
                        }
                    }
                }
            }
        }
    }




