/*
Team Pom Pom: Max Schneider, Perry Huang, Oscar Breen
APCS
HW91 -- Deque the Halls
2022-04-13
time spent: 9999 hrs
*/
import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedList;
public class QQCC<T> implements Deque<T> {
    private LinkedList<T> _data;
    public QQCC () {

        _data = new LinkedList<T>();

    }

    public void addFirst(T newVal) {
        _data.addFirst(newVal);
    }
    public void addLast(T newVal) {
        _data.addLast(newVal);
    }

    public T pollFirst() {
        return _data.pollFirst();
    }

    public T pollLast() {
        return _data.pollLast();
    }

    public T peekFirst() {
        return _data.peekFirst();
    }

    public T peekLast() {
        return _data.peekLast();
    }

    public boolean offerFirst(T newVal) {
        return _data.offerFirst(newVal);
    }

    public boolean offerLast(T newVal) {
        return _data.offerLast(newVal);
    }

    public boolean contains(T findVal) {
      return _data.contains(findVal);
    }

    public Iterator<T> iterator() {
        return _data.iterator();
    }
    public boolean addAll (Collection<T> c){
        return _data.addAll(c);
    }
    public Iterator<T> descendingIterator(){
        return _data.descendingIterator();
    }
    
    public String toString() {
        return _data.toString();
    }


    public static void main(String[] args) {
        /*
        QQCC<Integer> perry = new QQCC<Integer>(9);
        perry.addFirst(1);
        perry.addFirst(2);
        perry.addFirst(3);
        perry.addFirst(4);
        perry.addFirst(5);
        perry.addFirst(6);
        perry.addFirst(7);

        System.out.println(perry); //7654321
        System.out.println(perry.contains(7)); //true
        System.out.println(perry.contains(11)); // false


	    perry.addLast(8);
        System.out.println(perry); //76543218
        System.out.println(perry.peekLast()); //8
        System.out.println(perry.peekFirst()); //7

	    perry.pollFirst();
	    perry.pollLast();
        System.out.println(perry.peekLast()); //1
        System.out.println(perry.peekFirst()); //6

	    System.out.println(perry.pollFirst()); //6
    	System.out.println(perry.pollFirst()); //5
	    System.out.println(perry.pollFirst()); //4
    	System.out.println(perry.pollFirst()); //3
	    System.out.println(perry.pollFirst()); //2

        System.out.println(perry.peekLast()); //1
        System.out.println(perry.peekFirst()); //1

        perry.pollFirst(); //1

    	System.out.println(perry.peekLast()); //null
        System.out.println(perry.peekFirst()); //null
        */

    }

}