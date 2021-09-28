//<Perry> <Huang>
//APCS
//HW<05> -- <How Was Your Summer?/Summer Prework/Summer work + notes with teammates>
//<2021>-<09>-<27>

public class Loops{

  public static double power(double x, double n){
    double originalNumber = x;
    for (double i = n; i > 1; i--) {
      x = x*originalNumber;
    }
    return x;
  }

  public static double factorial(double n){
    double result = 1;
    for (double i = n; i != 0; i--) {
      result = result * i;
    }
    return result;
  }

  public static double myexp(double x, double n){
    double result = 1;
    for (double i = n; i != 0; i--) {
      result += power(x,i)/factorial(i);
    }
    return result;
  }

  public static void check(double x){
    System.out.println(x);
    System.out.println(myexp(x,99));
    System.out.println(Math.exp(x));
  }

      public static void main(String[] args){
        System.out.println(power(5,5));
        System.out.println(factorial(10));
        System.out.println(myexp(5,99));
        for (double i = 0.1; i != 1000; i = 10 * i ){
          check(i);
        }
        for (double i = -0.1; i != -1000; i = 10 * i ){
          check(i); //* inaccurate when i is -100
        }

      }

}
