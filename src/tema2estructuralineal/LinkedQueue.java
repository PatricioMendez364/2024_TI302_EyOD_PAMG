/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2estructuralineal;

/**
 *
 * @author patol
 */
public class LinkedQueue <E> implements QueueS<E>{
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();
    
    public LinkedQueue(){
        
    }
    
    public int size(){
        return list.size();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public void enqueue(E element){
        list.addLast(element);
    }
    
    public E first(){
        return list.first();
    }
    
    public E dequeue(){
        return list.removeFirst();
    }
            
    
}
