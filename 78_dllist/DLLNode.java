/*****************************************************
 * class DLLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 *****************************************************/

public class DLLNode
{
    //instance vars
    private String _cargo;    //cargo may only be of type String
    private DLLNode _nextNode; //pointer to next LLNode
    private DLLNode _prevNode; //pointer to previous LLNode

    // constructor -- initializes instance vars
    public DLLNode ( String value, DLLNode next, DLLNode prev ) {
	_cargo = value;
	_nextNode = next;
  _prevNode = prev;
    }


    //--------------v  ACCESSORS  v--------------
    public String getCargo() { return _cargo; }

    public DLLNode getNext() { return _nextNode; }

    public DLLNode getPrev() { return _prevNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo( String newCargo ) {
	String foo = getCargo();
	_cargo = newCargo;
	return foo;
    }

    public DLLNode setNext( DLLNode newNext ) {
	DLLNode foo = getNext();
	_nextNode = newNext;
	return foo;
    }

    public DLLNode setPrev( DLLNode newPrev ) {
	DLLNode foo = getPrev();
	_prevNode = newPrev;
	return foo;
    }

    //--------------^  MUTATORS  ^--------------

    
    // override inherited toString
    public String toString() { return _cargo.toString(); }
	

}//end class DLLNode

