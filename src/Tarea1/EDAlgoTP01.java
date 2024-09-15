
package Tarea1;

/**
 *
 * @author patol
 */
public class EDAlgoTP01 {
    
   public static void problema1(){
       for(int i = 1; i <= 10; i++){ //filas
           for(int j = 1; j <= i; j++){ //columnas
               System.out.print("*");
           }
           System.out.println();
       }
   }
  
   public static void problema2(){
      for(int i = 1; i <= 10; i++){ //filas
           for(int j = 10; j >= i; j--){ //columnas
               System.out.print("*");
           }
           System.out.println();
       } 
   }
   
    class SalarioPorComision{
       
       private int [] ventas;
       private int [] histograma;
       private int[] salario;
       
       public enum rango { // El valor no puede inciar en numero, cualquier letra o un "_" sirve
           R200_299, R300_399, R400_499, R500_599, R600_699, R700_799, R800_899, R900_999 
       };
       
       public static final int NUMERO_DE_CASILLAS = 9;

        public  SalarioPorComision(int[] ventas, int[] histograma) {
            this.ventas = ventas;
            this.histograma = new int[9]; //es hasta el 8, pero empieza en 0
            this.salario = new int[ventas.length];
            //Crear espacio para los datos, en este caso, los arreglos
        }
       
       public void calcularSalario(){
           for(int i = 0; i < ventas.length; i++){
               salario[i] = (int) (200 + 0.09*ventas[i]);
           }
       }
       
       public void imprimir(){
           for(int i = 0; i < salario.length; i++){
               System.out.print(salario[i] + " ");
           }
           System.out.println();
           
           System.out.print("Salario: ");
           for(int i = 0; i < salario.length; i++){
               System.out.println(salario[i] + " ");
           }
           System.out.println("");
       }
   }
}



