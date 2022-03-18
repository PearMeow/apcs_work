/*
The Hotdogs: Perry Huang and Salaj Jr, Faiyaz Rafee and Pivot and Atlas
APCS
HW13 -- Where do BigSibs Come From?/Greeting People/Making greetings but using a constructor
2021-10-6
DISCOS
Constructors don't need static or a return value
Every time new is run the constructor runs as well
QCC
How would you change the program so that the constructor can construct differently based on every greeting?
*/
public class BigSib{

   public BigSib() {
      BigSib.setHelloMsg("Word up");
  }

   public static void setHelloMsg(String str) {
       System.out.print(str + " ");
  }

   public static String greet(String str) {
       return str;
  }
}
