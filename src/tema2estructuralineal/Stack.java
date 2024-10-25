/*ITESS-TICS
AGOSTO-DICIEMBRE 2024
EyOD
Montecillo Puente
@Autor - Erik Stiven Aguilar Martinez
17-10-2024
Stack que implementa
 */
package tema2estructuralineal;

public interface Stack<E> {

    public static void main(String args[][]) {
        Stack<Integer> S = new ArrayStack<>(); // contents: ()
        S.push(5);
        S.push(3);
        System.out.println(S.size());
        System.out.println(S.pop());
        System.out.println(S.isEmpty());
        System.out.println(S.pop());
        System.out.println(S.isEmpty());
        System.out.println(S.pop());
        S.push(7);
        S.push(9);
        System.out.println(S.top());
        S.push(4);
        System.out.println(S.size());
        System.out.println(S.pop());
        S.push(6);
        S.push(8);
        System.out.println(S.pop());
    }

    int size();

    /* push 
    Aumenta un elementro agregado
     */
    boolean isEmpty();

    /* push 
    Aumenta un elementro agregado
     */
    void push(E e);

    /* 
    Aumenta un elementro agregado
     */
    E top();

    /* push 
    Regresa pero no elimina el elemento superior de la fila
   null si esta vacio
     */
    E pop();
    /* push
   Regresa pero elimina el elemento superior de la fila
   null si esta vacio
     */

}
