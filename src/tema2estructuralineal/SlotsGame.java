 /*
ITESS
TICS
Agosto - Diciembre 2024
Estructura y organizacion de datos
Profesor Francisco Javier Montecillo Puente
Programador Patricio Arturo Mendez Gonzalez
Desctripcion: -Tarea 1-
2 de octubre
*/
package tema2estructuralineal;

public class SlotsGame {
    public static void main(String[] args) {
        CircularlyLinkedList<String> cll1 = new CircularlyLinkedList<>();
        CircularlyLinkedList<String> cll2 = new CircularlyLinkedList<>();
        
        cll1.addFirst("1");
        cll1.addFirst("2");
        
        cll2.addFirst("1");
        cll2.addFirst("2");
        
       int nRotations1 =  (int) (Math.random() * 10 + 1);
       
       for(int i = 1; i <= nRotations1; i++){
           cll1.rotate();
       }
       
       int nRotations2 =  (int) (Math.random() * 10 + 1);
       
       for(int i = 1; i <= nRotations2; i++){
           cll2.rotate();
       }
       
        System.out.println(cll1.first());
        System.out.println(cll2.first());
       
    }

}
