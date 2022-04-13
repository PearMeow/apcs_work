/*
Team Pom Pom: Max Schneider, Perry Huang, Oscar Breen
APCS
HW89 -- Swabbing the Deque
2022-04-12
time spent: 1.5 hrs
*/
import java.util.Iterator;
import java.util.Collection;
public interface Deque<T> 
{

    public void addFirst(T newVal);
    public void addLast(T newVal);
    public T pollFirst();
    public T pollLast();
    public T peekFirst();
    public T peekLast();
    public boolean offerFirst(T newVal);
    public boolean offerLast(T newVal);
    public boolean contains(T findVal);
    // public boolean remove(T o);
    public Iterator<T> iterator();
    public boolean addAll (Collection<T> c);
    public Iterator<T> descendingIterator();
    // public boolean removeLastOccurence(T o);

    
}