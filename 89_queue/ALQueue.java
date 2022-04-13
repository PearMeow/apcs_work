/*

Team Pom Pom: Max Schneider, Perry Huang, Oscar Breen
APCS
HW89 -- Queue Two Ways
2022-04-11
time spent: 0.6 hrs

DISCO
Linked Lists are more versatile than ArrayLists.
ArrayLists use denser code.

QCC
Is _size a necessary variable?

*/

import java.util.ArrayList;
public class ALQueue<T> implements Queue<T> {

    private ArrayList<T> _data = new ArrayList<T>();
    private int _size = 0;
    private int _head = 0;
    private int _tail = 0;

    public void enqueue(T newdata) {
        _data.add(newdata);
        _size +=1;
        _head+=1;
    }
    
    public T dequeue() {
        T retVal = _data.get(_tail);
        _tail+=1;
        _size-=1;
        return retVal;
    }

    public boolean isEmpty () {
        return (_tail == _head);
    }

    public T peekFront() {
        return _data.get(_head);
    }

    public String toString() {
        ArrayList<T> _temp = new ArrayList<T>();
        _temp = _data; 
        String retVal = "";
        for (int i = 0; i < _head; i++) {
            retVal += _temp.get(i) + "\n";
        }
        return retVal;
    }


    public static void main(String[] args) {
        ALQueue<Integer> max = new ALQueue<Integer>();
        max.enqueue(1);
        max.enqueue(2);
        max.enqueue(3);
        max.enqueue(4);
        System.out.println(max);
    }
}