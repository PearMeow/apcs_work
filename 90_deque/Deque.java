import java.util.ArrayList;

public interface Deque<T> 
{

    public void addFirst(T newVal);
    public void addLast (T newVal);
    public T pollFirst();
    public T pollLast();
    public T peekFirst();
    public T peekLast();
    
}

public class QQCC<T> implements Deque<T> 

{
    private ArrayList<T> _data = new ArrayList<T>();
    private int _first = 0;
    private int _last = 0;

    public void addFirst(T newVal) {
        _data.addFirst(newVal);
        _last++;
    }
    public void addLast(T newVal) {
        _data.addLast(newVal);
        _last++;
    }

    public T pollFirst

}