/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tema2estructuralineal;

/**
 *
 * @author patol
 */
public interface QueueS <E> {
    
    int size();
    boolean isEmpty();
    void enqueue(E e);
    E first();
    E dequeue();
    
}
