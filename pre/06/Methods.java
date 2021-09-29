//<Perry> <Huang>
//APCS
//HW<05> -- <How Was Your Summer?/Summer Prework/Summer work + notes with teammates>
//<2021>-<09>-<27>

public class Methods{

  public static boolean isDivisible(int n, int m){
    if (n == 0 && m != 0){
      return true;
    }   else if ( m == 0){
      return false;
    }   else if ( m > n ){
      return false;
    }   else if ( (n/m) * m != n ){
      return false;
    }   else {
      return true;
    }

  }

  public static boolean isTriangle(int a, int b, int c){
    if ((a + b) < c){
      return false;
    }   else if ((b + c) < a){
      return false;
    }   else if ((c + a) < b){
      return false;
    }   else {
      return true;
    }

  }

  public static int ack(int m, int n){
    if (m > 0 && n > 0){
      return ack(m-1, ack(m, n-1));
    }   else if (m > 0 && n == 0){
      return ack(m-1,1);
    }   else {
      n = n + 1;
      return n;
    }

  }

      public static void main(String[] args){
        System.out.println(isDivisible(99,3));
        System.out.println(isTriangle(1,2,4));
        System.out.println(ack(3,3));
      }
}
