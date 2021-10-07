/*
The Hotdogs: Perry Huang and Salaj Jr, Faiyaz Rafee and Pivot and Atlas
APCS
HW13 -- Where do BigSibs Come From?/Greeting People/Making greetings but using a constructor
2021-10-6
DISCOS

QCC

*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();

    greeting = richard.greet("freshman");
    System.out.println(greeting);

    greeting = richard.greet("Dr.Spaceman");
    System.out.println(greeting);

    greeting = richard.greet("Kong Fooey");
    System.out.println(greeting);

    greeting = richard.greet("mom");
    System.out.println(greeting);
  } //end main()
} //end Greet
