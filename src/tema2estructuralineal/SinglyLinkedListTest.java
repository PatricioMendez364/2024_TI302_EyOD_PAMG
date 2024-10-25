 /*
ITESS
TICS
Agosto - Diciembre 2024
Estructura y organizacion de datos
Profesor Francisco Javier Montecillo Puente
Programador Patricio Arturo Mendez Gonzalez
Desctripcion: -Tarea 1-
25 de septiembre
*/
package tema2estructuralineal;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList<String> sll = new SinglyLinkedList();
        CircularlyLinkedList <String> cll = new CircularlyLinkedList();
        
        sll.addFirst("A");
        sll.addFirst("B");
        sll.addFirst("C");
        sll.addFirst("D");
        
        System.out.println("Primer elemento: " + sll.first());
        System.out.println("Ultimo elememto: " + sll.last());
        System.out.println("Tamano: " + sll.size());
        
        String dato = null;
        
        while((dato = sll.removeFirst()) != null){
            System.out.print(dato + " ");
            System.out.println("");
        }
    }
}
