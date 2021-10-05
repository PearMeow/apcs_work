/*
Perry Huang
APCS
HW12 -- <On Elder Individuality and the Elimination of Radio Fuzz//Summary>
2021-10-5
DISCOS

QCC

*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

  } //end main()
} //end Greet
