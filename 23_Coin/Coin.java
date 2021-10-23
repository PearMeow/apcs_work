/*
The Sentinels: Perry Huang, Salaj Rijal
APCS
HW23 -- What Does Equality Look Like?/Making Coin.java and Driver.java/Flipping coins with bias.
2021-10-23
time spent: 0.9 hours
 */

import java.util.Random;

public class Coin {

  //attributes aka instance vars
  double value; //could possibly be float
  String upFace = "heads";
  String name;
  int flipCtr;
  int headsCtr;
  int tailsCtr;
  double bias = 0.5;
  //could also possible be float
  
  //create random object
  Random rng = new Random();
	
  
  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {

  }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
    name = s;
  }


  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
		name = s;
    upFace = nowFace;
  }


  // Accessors...
  // ----------------------------
  public String getUpFace() {
		return upFace;
  }

  public int getFlipCtr() {
		return flipCtr;
  }

  public double getValue() {
		return value;
  }

  public int getHeadsCtr() {
		return headsCtr;
  }

  public int getTailsCtr() {
		return tailsCtr;
  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue( String s ) {
		if ( s.equals("penny") ){
			value = .01;
      return value;
    }
		if ( s.equals("nickel") ){
			value = .05;
      return value;
    }
		if ( s.equals("dime") ){
			value = .10;
      return value;
    }
		if ( s.equals("quarter") ){
			value = .25;
      return value;
    }
		if ( s.equals("halfdollar") ){
			value = .50;
      return value;
    }
		if ( s.equals("dollar") ){
			value = 1.0;
      return value;
    }
    return 0.0;
  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
  	double value = 0.0; //could possibly be float
  	String upFace = "heads";
  	String name = "";
  	int flipCtr = 0;
  	int headsCtr = 0;
  	int tailsCtr = 0;
  	double bias = 0.5; //could also possible be float

  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {
    double randomValue = rng.nextDouble();
    if (randomValue > bias ){
      flipCtr++;
      tailsCtr++;
      upFace = "tails";
      return "tails";
    }
    else{
      flipCtr++;
      headsCtr++;
      upFace = "heads";
      return "heads";
    }
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
    return upFace.equals( other.getUpFace() );

  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
		return name + " -- " + upFace;
  }

}//end class


//DRIVER FILE


/***
    driver for class Coin
    ~~~ SUGGESTED WORKFLOW: ~~~
    1. Compile this file and run. Note anything notable.
    2. Move the "TOP" line down, so that it is below the first statement.
    (emacs: with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
    (your editor: ???)
    3. Compile and run again.
    4. Resolve errors one at a time until it works.
    5. Repeat 2-4 until TOP meets BOTTOM.
***/

public class Driver {

  public static void main( String[] args ) {

    //build Objects from blueprint specified by class Coin
		

    //test default constructor
    //===================TOP==========================
      Coin mine = new Coin();
      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );
      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );
      //test toString() methods of each Coin
      System.out.println("mine: " + mine);
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test flip() method
      System.out.println("\nAfter flipping...");
      yours.flip();
      wayne.flip();
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }
      //====================BOTTOM======================

  }//end main()

}//end class
