/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2estructuralineal;

import static tema2estructuralineal.ArrayStack.CAPACITY;

/**
 *
 * @author patol
 */
public class ArrayQueue <E> implements QueueS <E>{
    
    private E[] data;
    private int f = 0;
    private int sz;

    public ArrayQueue() {
        this(CAPACITY);
    }
    
    public ArrayQueue(int capacity){
        data = (E[]) new Object[capacity];
    }
        
    public int size(){
        return sz;
    }

    public boolean isEmpty(){
        return sz == 0;
    }
    
    public void ennqueue (E e) throws IllegalStateException{
        if(sz == data.length) throw new IllegalStateException(" Queue is full");
        int avail = (f + sz) % data.length;
        data[avail] = e;
        sz++;
    }
    
    public E dequeue(){
        if(isEmpty()) return null;
        E answer = data[f];
        data[f] = null;
        f = (f + 1) % data.length;
        sz--;
        return answer;
    }    

    @Override
    public void enqueue(E e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E first() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


    
  