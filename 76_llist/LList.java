///Pom Pom: Max Schneider, Perry Huang, Oscar Breen
//APCS pd07
//HW76 -- We Got a Little Ol' Convoy
//2022-03-14
//time spent: 3 hrs




/***
Disco:
*This is really hard
*Never ever ever change _head
*Always add pointers to avoid JGC

QCC:
what is the value of a linked list?
Real world implementatiosn






 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = new LLNode(null, null);
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    if (_size == 0) {
      _head = new LLNode(newVal, null);
    } else {
      LLNode temp = _head;

       while(temp.getNext() != null){
  	      temp = temp.getNext();
       }
       LLNode val = new LLNode(newVal, null);
        temp.setNext(val);
    }
    _size ++;
    return true;

  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
      LLNode temp = _head;
      int ctr = 0;
      while (ctr <= index - 1) {
       temp = temp.getNext();
       ctr ++;
      }
      return temp.getCargo();
}


  public String set( int index, String newVal )
  {
//    String res = "";
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
      LLNode temp = _head;
      int ctr = 0;
     while (ctr <= index - 2) {
       temp = temp.getNext();
       ctr ++;
     }
     LLNode saved = temp.getNext();
     LLNode newby = new LLNode(newVal, saved);
     temp.setNext(newby);
     return newVal;
  }


  //return number of nodes in list
  public int size()
  {
    return _size;
  }

  //--------------^  List interface methods  ^--------------

/*

  override inherited toString
  */
  public String toString()
  {
    return _head.toString();
  }

  //main method for testing
  public static void main( String[] args )
  {

    LList james = new LList();

    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.get(1) );

    System.out.println( james );

    james.set( 3, "him" );
    System.out.println( "...and now fourth item is: " + james.get(3) );

    System.out.println( james );

  }

}//end class LList
