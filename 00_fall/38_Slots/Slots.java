/*****************************************************
 * Team BPK: Ben Belotser, Perry Huang, Kosta Dubovskiy
 * APCS pd07
 * HW38 -- Spin Class/Slots Machine simulator/haha spin to win go brr
 * 2021-11-17
 * time spent: 1.0 hour
 * DISCO
 * I discovered how to cut and paste.
 *
 * QCC 
 * How exactly does swap work? 
 * Can we make it so that the order of the slots is more random?
 *****************************************************/

public class Slots {

    //instance variable to represent master copy for slot machine
    private static final String[] FRUITS = {
      "lime", "lime", "lime", 
      "lemon", "lemon", "lemon", 
      "cherry", "cherry", "cherry",
      "orange", "orange", "orange", 
      "grapefruit", "grapefruit", "grapefruit", 
      "tangerine", "tangerine", "tangerine", 
      "ugli", "ugli", "ugli", 
      "peach", "peach", "peach"
    };
  
    private String[] _fruits; //to be init'd by each instance
  
  
    /*=====================================
      Slots() -- default constructor
      pre:  constant array FRUITS exists, has been initialized
      post: mutable array _fruits contains same elements as FRUITS
      */
      //copy elements of FRUITS into _fruits:
    public Slots() {
        _fruits = new String[FRUITS.length];
        for (int i = 0; i < FRUITS.length; i++) {
            _fruits[i] = FRUITS[i];
        }
    }
    
  
  
    /*=====================================
      String toString() -- overrides inherited toString()
      pre:  
      post: returns String of elements in slots 0 thru 2, separated by tabs
      =====================================*/
    public String toString()
    {
      return _fruits[0] + "   " + _fruits[1] + "   " + _fruits[2];
    }
  
  
    /*=====================================
      void swap(int,int) -- array swap util fxn
      pre:  _fruits array exists
      post: elements at indices i, j are swapped
      =====================================*/
    private void swap( int i, int j )
    {
        String temp = _fruits[i];
        _fruits[i] = _fruits[j];
        _fruits[j] = temp;
    }
  
  
    /*=====================================
      void spinOnce() -- simulate a pull of the slot machine lever
      pre:  _fruits array exists
      post: randomized order of elements in _fruits array
      =====================================*/
    public void spinOnce()
    {
      // A simple approach to shuffling:
      // iterate through the array, swapping
      // the val at each index with a randomly chosen other index
      for(int i = 0; i < _fruits.length; i++) {
        int tempRandInd = _fruits.length*(int)Math.random(); // length * random number 0 - 1
        swap(i, tempRandInd);
      }

    }
  
  
    /*=====================================
      boolean jackpot() -- checks for a winning combo
      pre:  _fruits is existing array
      post: returns true if first 3 slots represent winning combo,
      false otherwise
      =====================================*/
    public boolean jackpot()
    {
      return (_fruits[0].equals("lime") && _fruits[0] == _fruits[1] && _fruits[2].equals("lemon"));
    }
  
  
    /*=====================================
      boolean miniWin() -- checks for a winning combo
      pre:  _fruits is existing array
      post: returns true if first 3 slots represent winning combo,
      or if first 3 slots mutually distinct, 
      false otherwise
      =====================================*/
    public boolean miniWin()
    {
        return (_fruits[0] == _fruits[1] && _fruits[1] == _fruits[2]);
    }
  
  
    //main() method for testing
    public static void main( String[] args ) {
      //usage: move bar below down 1 line at a time to test functionality...
  
      
      Slots machine01 = new Slots();
      Slots machine02 = new Slots();
      
      //test to verify slot machines function indepently
      System.out.println();
      System.out.println( "Machine01 initial state:\t" + machine01 );
      System.out.println( "Machine02 initial state:\t" + machine02 );
  
  
      System.out.println( "\nSpinning machine01...\n" );
  
      machine01.spinOnce();
      
        
      System.out.println();
      System.out.println( "Machine01 state:\t" + machine01 );
      System.out.println( "Machine02 state:\t" + machine02 );
      System.out.println();
     
      //test gamble-until-you-win mechanism
  
      System.out.println( "Preparing to spin until a mini win! . . ." );
      System.out.println( "------------------------------------" );
  
 
    
      //if you haven't won, spin again until you win!
      while( machine01.miniWin() == false ) {
        System.out.println( "Your spin..." + "\t" + machine01 );
        System.out.println( "LOSE\n" );
        machine01.spinOnce();
      }
  
      System.out.println( "====================================" );
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "WIN\n" );
  

  
      System.out.println( "Preparing to spin until...jackpot! . . ." );
      System.out.println( "------------------------------------" );
  
      //if you haven't won, spin again until you win!
      while( machine01.jackpot() == false ) {
        System.out.println( "Your spin..." + "\t" + machine01 );
        System.out.println( "LOSE\n" );
        machine01.spinOnce();
      }

      System.out.println( "====================================" );
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "JACKPOT!\n" );

    }//end main
  
  }//end class Slots