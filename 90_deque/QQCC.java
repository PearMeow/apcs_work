import java.util.ArrayList;
public class QQCC<T> implements Deque<T> {

    private ArrayList<T> _data;
    private int _first;
    private int _last;
    private int _size;
    private int _firstValue;

    public QQCC (int size) {

        _data = new ArrayList<T>(size);
        _first = 0;
        _last = 0;
        _size = size;
        _firstValue = 0;
        
    }

    public void addFirst(T newVal) {
        if (_last - _first + 1 == _size) {
            throw new IllegalStateException();
        }
        ArrayList<T> _temp = new ArrayList<T>(_size);
        _temp.add(newVal);
        for (int i = _first; i < _last; i++) {
            _temp.add(_data.get(i));
        }
        _data = _temp;
        if (_firstValue == 0) {
            _firstValue++;
            return;
        }
        _last++;
    }

    public void addLast(T newVal) {
        if (_last - _first + 1 == _size) {
            throw new IllegalStateException();
        }
        _data.add(newVal);
        _last++;
    }

    public T pollFirst() {
        T retVal = _data.get(_first);
        _first += 1;
        return retVal;
    }

    public T pollLast() {
        T retVal = _data.get(_last);
        _last -= 1;
        return retVal;
    }

    public T peekFirst() {
        return _data.get(_first);
    }

    public T peekLast() {
        return _data.get(_last);
    }

    public boolean offerFirst(T newVal) {
        if (_last - _first != _size) {
            addFirst(newVal);
            return true;
        }
        return false;
    }

    public boolean offerLast(T newVal) {
        if (_last - _first != _size) {
            addLast(newVal);
            return true;
        }
        return false;
    }

    public String toString() {
        return _data.toString();
    }

    public static void main(String[] args) {

        QQCC<Integer> perry = new QQCC<Integer>(7);
        perry.addFirst(1);
        perry.addFirst(2);
        perry.addFirst(3);
        perry.addFirst(4);
        perry.addFirst(5);
        perry.addFirst(6);
        perry.addFirst(7);
        System.out.println(perry); //654321
    }

}