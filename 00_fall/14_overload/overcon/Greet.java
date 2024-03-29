/* Frogs on Fire: Perry Huang, Andrew Piatetsky, Samantha Hua
APCS
HW14 -- Customize Your Creation/Overloading Constructors/Overloading constructors to customize greeting
2021-10-07
DISCOS
Removing static makes it easier to change variable names without affecting the whole method.
QCC
What does removing static actually do to BigSib.java?
*/


public class Greet{

   public static void main( String[] args) {
       String greeting;
       BigSib richard = new BigSib("Word up");
       BigSib grizz = new BigSib("Hey ya");
       BigSib dotCom = new BigSib("Sup");
       BigSib tracy = new BigSib("Salutations");
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
