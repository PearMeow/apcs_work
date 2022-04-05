/***
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class LLNode<SWASHBUCKLE>
{
  //instance vars
  private SWASHBUCKLE car;
  private LLNode<SWASHBUCKLE> cdr;


  // constructor
  public LLNode( SWASHBUCKLE value, LLNode<SWASHBUCKLE> next )
  {
    car = value;
    cdr = next;
  }


  //--------------v  ACCESSORS  v--------------
  public SWASHBUCKLE getCargo()
  {
    return car;
  }

  public LLNode<SWASHBUCKLE> getNext()
  {
    return cdr;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public SWASHBUCKLE setCargo( SWASHBUCKLE newCargo )
  {
    SWASHBUCKLE oldCargo = car;
    car = newCargo;
    return oldCargo;
  }

  public LLNode<SWASHBUCKLE> setNext( LLNode<SWASHBUCKLE> newNext )
  {
    LLNode<SWASHBUCKLE> oldNext = cdr;
    cdr = newNext;
    return oldNext;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    if (cdr == null) {
      return car.toString();
    } else {
      return car + " > " +  cdr.toString();
    }
  }

}//end class LLNode