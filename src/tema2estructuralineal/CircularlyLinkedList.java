 /*
ITESS
TICS
Agosto - Diciembre 2024
Estructura y organizacion de datos
Profesor Francisco Javier Montecillo Puente
Programador Patricio Arturo Mendez Gonzalez
Desctripcion: -Tarea 1-
27 de septiembre
*/
package tema2estructuralineal;

public class CircularlyLinkedList <E> {
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

    private Node <E> tail;
    private int size;

    public CircularlyLinkedList() {   
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
        return tail.getNext().Element;
    }
    
    public E last(){
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }
    
    public void addFirst (E e){ 
        if(size == 0){
            tail =  new Node <> (e, null);
            tail.setNext(tail);
        } else { 
            Node<E> newest = new Node<E>(e, tail.getNext());
        }      
        size++;
    }
    
    public void addLast (E e){
        addFirst(e);
        tail = tail.getNext();
    }
    
    public E removeFirst(){
        if(isEmpty()){
            return null;
        }
        Node<E> head = tail.getNext();
        if(head == tail){
            tail = null;
        } else {
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }            
    
    public void rotate(){
        if(tail != null)
            tail = tail.getNext();
        
    }
}
