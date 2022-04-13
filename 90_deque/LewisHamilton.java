import java.util.Iterator;
import java.util.Stack;
public class LewisHamilton {
    public static void main(String[] args) {

        QQCC<Integer> Verstappen = new QQCC<Integer>();
        Verstappen.addFirst(1);
        Verstappen.addFirst(2);
        Verstappen.addFirst(3);
        Verstappen.addFirst(4);
        Verstappen.addFirst(5);
        Verstappen.addFirst(6);
        Verstappen.addFirst(7);
        Iterator<Integer> Riccardo = Verstappen.iterator();
        while(Riccardo.hasNext()) {
            System.out.print(Riccardo.next() + ", ");
        }
        Verstappen.addLast(0);
        Verstappen.addLast(-1);
        Verstappen.addLast(-2);
        Verstappen.addLast(-3);
        Verstappen.addLast(-4);
        Verstappen.addLast(-5);
        Verstappen.addLast(-6);
        Verstappen.addLast(-7);
        Iterator<Integer> Botas = Verstappen.descendingIterator();
        System.out.println();
        while(Botas.hasNext()) {
            
            System.out.print(Botas.next() + ", ");
        }
        System.out.println();
        Stack<Integer> Leclerc = new Stack<Integer>();
        Leclerc.push(-8);
        Leclerc.push(-9);
        Leclerc.push(-10);
        Leclerc.push(-11);
        Verstappen.addAll(Leclerc);
        Iterator<Integer> Russell = Verstappen.iterator();
        System.out.println();
        while(Russell.hasNext()) {
            
            System.out.print(Russell.next() + ", ");
        }
        System.out.println();


    }
}