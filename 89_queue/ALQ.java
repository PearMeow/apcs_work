public class ALQ<t> implements Queue<t> {
    private ArrayList<t> _data = new ArrayList<t>;
    private int _size = 0;
    private int _head = 0;
    private int _tail = 0;
    public void enqueue(t newdata) {
        _data.add(newdata);
        _size +=1;
        _head+=1;
    }
    public t dequeue() {
        _tail+=1;
        _size-=1;
    }

    public String toString () {
        String retval = "";
        for(int i = tail; i < _head;i++) {
            retVal+= _data.get(i);
            retVal+=", "
        } 
        return retval;
    }
    public boolean isEmpty () {
        return (tail == head);
    }
    public t peekFront() {
        return _data.get(head);
    }
    public static void main(String[] args) {
        ALQ<int> max = new ALQ<int>();
        max.enqueue(1);
        max.enqueue(1);
        max.enqueue(1);
        max.enqueue(1);
        System.out.println(max);
    }
}