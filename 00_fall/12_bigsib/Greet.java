/*
Perry Huang
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz/Greeting People/Making greetings but assigning BigSib to richard
2021-10-5
DISCOS
BigSib richard = new BigSib() assigns BigSib() to richard which is why richard.methods* works.
QCC
Is there any way to print all of the required output without altering the Greet.java file?
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

    richard.setHelloMsg("Salutations");

    greeting = richard.greet("Dr.Spaceman");
    System.out.println(greeting);

    richard.setHelloMsg("Hey ya");

    greeting = richard.greet("Kong Fooey");
    System.out.println(greeting);

    richard.setHelloMsg("Sup");

    greeting = richard.greet("mom");
    System.out.println(greeting);
  } //end main()
} //end Greet
