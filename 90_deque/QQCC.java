import java.util.ArrayList;
public class QQCC<T> implements Deque<T> {
    private ArrayList<T> _data;
    private int _first;
    private int _last;
    private int _size;

    public QQCC (int size) {

        _data = new ArrayList<T>(size);
        _first = 0;
        _last = 0;
        _size = size;
        
    }

    public void addFirst(T newVal) {
        if (_last - _first == _size) {
            throw new IllegalStateException();
        }
        ArrayList<T> _temp = new ArrayList<T>(_size);
        _temp.add(newVal);
        for (int i = _first; i < _last; i++) {
            _temp.add(_data.get(i));
        }
        _data = _temp;
        _last++;
    }
    public void addLast(T newVal) {
        if (_last - _first == _size) {
            throw new IllegalStateException();
        }
        _data.add(newVal);
        _last++;
    }

    public T pollFirst() {
        if (_first == _last) {
            return null;
        }
        T retVal = _data.get(_first);
        _first += 1;
        return retVal;
    }

    public T pollLast() {
        if (_first == _last) {
            return null;
        }
        T retVal = _data.get(_last-1);
        _last -= 1;
        return retVal;
    }

    public T peekFirst() {
        if (_first == _last) {
            return null;
        }
        return _data.get(_first);
    }

    public T peekLast() {
        if (_first == _last) {
            return null;
        }
        return _data.get(_last - 1);
    }

    public boolean offerFirst(T newVal) {
        if (_last != _data.size()) {
            addFirst(newVal);
            return true;
        }
        return false;
    }

    public boolean offerLast(T newVal) {
        if (_last != _data.size()) {
            addLast(newVal);
            return true;
        }
        return false;
    }

    public String toString() {
        return _data.toString();
    }

    public static void main(String[] args) {

        QQCC<Integer> perry = new QQCC<Integer>(9);
        perry.addFirst(1);
        perry.addFirst(2);
        perry.addFirst(3);
        perry.addFirst(4);
        perry.addFirst(5);
        perry.addFirst(6);
        perry.addFirst(7);

        System.out.println(perry); //654321


	    perry.addLast(8);
        System.out.println(perry); //76543218
        System.out.println(perry.peekLast()); //8
        System.out.println(perry.peekFirst()); //7

	    perry.pollFirst();
	    perry.pollLast();
        System.out.println(perry.peekLast()); //1
        System.out.println(perry.peekFirst()); //6

	    perry.pollFirst(); //6
    	perry.pollFirst(); //5
	    perry.pollFirst(); //4
    	perry.pollFirst(); //3
	    perry.pollFirst(); //2 

        System.out.println(perry.peekLast()); //1
        System.out.println(perry.peekFirst()); //1

        perry.pollFirst(); //1

    	System.out.println(perry.peekLast()); //null
        System.out.println(perry.peekFirst()); //null


    }

}