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

   public BigSib() {
      BigSib.setHelloMsg("Word up");
  }

   public String BigSib(String str) {
      BigSib.setHelloMsg(str);
  }

   public static void setHelloMsg(String str) {
       System.out.print(str + " ");
  }

   public static String greet(String str) {
       return str;
  }
}
