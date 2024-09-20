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
    
    public static void E1() {
        int arrA[] = new int[11];
        int arrB[] = new int[34];
        int arrC[] = new int[100];
        int arrF[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arrG[] = new int[5];
        int arrW[] = new int[99];

        System.out.println("-E1-");

        // A)
        System.out.print(arrF[6]);
        System.out.println();

        // B) 
        for (int i = 0; i < 5; i++) {
            arrG[i] = 8;
            System.out.print(arrG[i]);
        }
        System.out.println();

        // C) 
        int suma = 0;
        for (int i = 0; i < arrC.length; i++) {
            arrC[i] = i;
            suma += arrC[i];
        }
        System.out.print(suma);
        System.out.println();

        // D) 
        for (int i = arrB.length - 1; i >= 0; i--) {
            arrB[i] = i;
            System.out.print(arrB[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = arrB[i];
            System.out.print(arrA[i] + " ");
        }
        System.out.println();

        // E) 
        int mayor = arrW[0];
        for (int i = 0; i < arrW.length; i++) {
            arrW[i] = i;
            if (arrW[i] > mayor) {
                mayor = arrW[i];
            }
        }
        System.out.println("El mayor valor es: " + mayor);
    }

    public static void E3() {
        // 7.11

        System.out.println("-E3-");
        
        // A) 
        int[] cuentas = new int[10];
        System.out.println("Asignar 0 a todos los elementos del arreglo cuentas:");
        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i] = 0;
            System.out.print(cuentas[i]);
        }

        // B) 
        int[] bono = new int[15];
        System.out.println("Sumar 1 a cada elemento del arreglo bono:");
        for (int i = 0; i < bono.length; i++) {
            bono[i] = i;
        }
        for (int i = 0; i < bono.length; i++) {
            bono[i] += 1;
            System.out.print(bono[i] + " ");
        }
        System.out.println();
        
        //C)
        int[] mejoresPuntuaciones = {12, 8, 16, 5, 9};  
        for (int i = 0; i < mejoresPuntuaciones.length; i++) {
            System.out.print(mejoresPuntuaciones[i]);
        }
        System.out.println();
        
        //7.12
        int[] numerosUnicos = new int[5]; 
        int contador = 0;

        System.out.println("Introduce 5 números entre 10 y 100 (inclusive):");

        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = i*10;

            if (numero < 10 || numero > 100) {
                System.out.println("El numero debe estar entre 10 y 100. Intenta de nuevo.");
                continue;
            }

            boolean duplicado = false;
            for (int j = 0; j < contador; j++) {
                if (numerosUnicos[j] == numero) {
                    duplicado = true;
                    break;
                }
            }

            if (duplicado == true) {
            } else {
                numerosUnicos[contador] = numero;
                contador++;
            }

            // Mostrar los números únicos ingresados hasta ahora
            System.out.print("Numeros unicos hasta ahora: ");
            for (int j = 0; j < contador; j++) {
                System.out.print(numerosUnicos[j] + " ");
            }
            System.out.println();
        }

        System.out.println("Conjunto final de numeros unicos:");
        for (int i = 0; i < contador; i++) {
            System.out.println(numerosUnicos[i] + " ");
        }
    }

    public static void E5() {
        Random random = new Random();
        int ganadas = 0;
        int perdidas = 0;
        int neutral = 0;
        int juegos = 0;

        System.out.println("-E5-");

        for (int i = 0; i < 1000000; i++) { // Se itera 1 millón de veces
            juegos++;
            int dado1 = random.nextInt(6) + 1; // Valores entre 1 y 6
            int dado2 = random.nextInt(6) + 1; // Valores entre 1 y 6
            int punto = dado1 + dado2;

            switch (punto) {
                case 7:
                case 11:
                    ganadas++;
                    break;
                case 2:
                case 3:
                case 12:
                    perdidas++;
                    break;
                default:
                    neutral++;
                    int tiradan = punto;
                    while (true) {
                        tiradan = random.nextInt(6) + 1 + random.nextInt(6) + 1;
                        if (tiradan == punto) {
                            ganadas++;
                            break;
                        } else if (tiradan == 7) {
                            perdidas++;
                            break;
                        }
                    }
            }
        }

        double porcentajeGanadas = (double) ganadas / juegos * 100;
        double porcentajePerdidas = (double) perdidas / juegos * 100;

        System.out.println("De " + juegos + " juegos, los resultados son:");
        System.out.println("Las partidas ganadas son el " + porcentajeGanadas);
        System.out.println("Las partidas perdidas son el " + porcentajePerdidas);
    }
}





