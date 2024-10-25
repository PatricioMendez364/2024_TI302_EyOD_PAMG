/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2estructuralineal;

/**
 *
 * @author patol
 */
public class Josephus {
    public static <E>E Josephus(CircularQueue<E> queue, int k){
        if(queue.isEmpty()) return null;
        while(queue.size() > 1){
            for(int i = 0; i < k - 1; i++)
                queue.rotate();
            E e = queue.dequeue();
            System.out.println("    " + e + " is out");
        }
        return queue.dequeue();
    }    
}

