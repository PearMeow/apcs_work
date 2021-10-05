/*
Perry Huang
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz/Greeting People/Making greetings but assigning BigSib to richard somehow
2021-10-5
DISCOS
BigSib richard = new BigSib() assigns BigSib() to richard which is why richard.methods* works.
QCC
Is there any way to print all of the required output without altering the Greet.java file?
*/
public class BigSib{

   public static String setHelloMsg(String str) {
       System.out.print(str + " ");
       return str;
  }

   public static String greet(String str) {
       return str;
  }
}
