/* Perry HuangAPCS
HW14 -- Customize Your Creation/Overloading Constructors/Summary
2021-10-07
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
