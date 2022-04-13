import java.util.ArrayList;
public class QQCC<T> implements Deque<T> {
    private ArrayList<T> _data;
    private int _first;
    private int _last;


    public QQCC(int size) {

        _data = new ArrayList<T>(size);
        _first = 0;
        _last = 0;

    }

    public void addFirst(T newVal) {
        ArrayList<T> _temp = new ArrayList<T>(_data.size());
        _temp.add(newVal);
        for (int i = _first; i < _last + 1; i++) {
            _temp.add(_data.get(i));
        }
        _data = _temp;
        _last++;
    }
    public void addLast(T newVal) {
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
}