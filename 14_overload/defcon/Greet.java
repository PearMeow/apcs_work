/* Perry Huang, Andrew Piatetsky, Samantha Hua
APCS
HW14 -- Customize Your Creation/Overloading Constructors/Summary
2021-10-07
DISCOS

QCC

*/

public class Greet{

   public static void main( String[] args) {
       String greeting;
       BigSib richard = new BigSib();
       BigSib grizz = new BigSib();
       BigSib dotCom = new BigSib();
       BigSib tracy = new BigSib();
       greeting = richard.greet("freshman");
       System.out.println(greeting);
       greeting = grizz.greet("Dr. Spaceman");
       System.out.println(greeting);
       greeting = dotCom.greet("Kong Fooey");
       System.out.println(greeting);
       greeting = tracy.greet("mom");
       System.out.println(greeting);
    } //end main()
   } //end Greet
