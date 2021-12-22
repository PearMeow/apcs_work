public class Driver {

  public static void main (String[] args) {
  Rational perry = new Rational(3, 4);
  Rational ben = new Rational(2, 3);
  if (perry instanceof Rational && ben instanceof Rational) {
    System.out.println(perry.compareTo(ben));
  }
  }

}
