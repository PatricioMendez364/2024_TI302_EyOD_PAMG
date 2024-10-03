 /*
ITESS
TICS
Agosto - Diciembre 2024
Estructura y organizacion de datos
Profesor Francisco Javier Montecillo Puente
Programador Patricio Arturo Mendez Gonzalez
Desctripcion: -Tarea 1-
123 de septiembre
*/
package tema2estructuralineal;

public class SinglyLinkedList <E> {
    private static class Node <E> {
        private E Element;
        private Node <E> next;

        public Node(E element, Node E) {
            this.Element = element;
            this.next = next;
        }
        
        

        public E getElement() {
            return Element;
        }

        public Node <E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        
             
    }

    private Node <E>head;
    private Node <E> tail;
    private int size;

    public SinglyLinkedList() {   
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public E first(){
        if(isEmpty()){
            return null;
        }
        return head.getElement();
    }
    
    public E last(){
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }
    
    public void addFirst (E e){ 
        head = new Node(e, head);
        if( size == 0){
            tail = head;
        }
        size++;            
    }
    
    public void addLast (E e){
        Node <E> newest = new Node <> (e, null);
        if(isEmpty()) head = newest;
        else tail.setNext(newest);
        
        size++;
    }
    
    public E removeFirst(){
        if(isEmpty()) return null;
        E answer = head.getElement();
        size--;
        if(size == 0)
            tail = null;
        return answer;
    }            
}
