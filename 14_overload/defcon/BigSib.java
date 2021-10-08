/* Frogs on Fire: Perry Huang, Andrew Piatetsky, Samantha Hua
APCS
HW14 -- Customize Your Creation/Overloading Constructors/Summary
2021-10-07
DISCOS
Removing static makes it easier to change variable names without affecting the whole method.
QCC
What does removing static actually do to BigSib.java?
*/

public class BigSib{

      String helloMsg;

      public BigSib() {
         helloMsg = "Word up";
     }

      public void setHelloMsg(String str) {
          helloMsg = str;
     }

      public String greet(String str) {
          return helloMsg + " " + str;
     }
   }

