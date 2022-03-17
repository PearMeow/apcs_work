/*****************************************************
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 *****************************************************/

public class DLLNode
{
    //instance vars
    private String _cargo;    //cargo may only be of type String
    private LLNode _nextNode; //pointer to next LLNode
    private LLNode _prevNode; //pointer to previous LLNode

    // constructor -- initializes instance vars
    public LLNode( String value, LLNode next, LLNode prev ) {
	_cargo = value;
	_nextNode = next;
  _prevNode = prev;
    }


    //--------------v  ACCESSORS  v--------------
    public String getCargo() { return _cargo; }

    public LLNode getNext() { return _nextNode; }

    public LLNode getPrev() { return _prevNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo( String newCargo ) {
	String foo = getCargo();
	_cargo = newCargo;
	return foo;
    }

    public LLNode setNext( LLNode newNext ) {
	LLNode foo = getNext();
	_nextNode = newNext;
	return foo;
    }

    public LLNode setPrev( LLNode newPrev ) {
	LLNode foo = getPrev();
	_prevNode = newPrev;
	return foo;
    }

    //--------------^  MUTATORS  ^--------------

    
    // override inherited toString
    public String toString() { return _cargo.toString(); }
	

}//end class LLNode

