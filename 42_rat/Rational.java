/*
Team BPK: Ben Belotser, Perry Huang, Kosta Dubovskiy
APCS pd07
HW41 -- Be Rational/Rationals/Making rationals and multiplying and dividing them
2021-12-01
time spent: 1.0 hour

DISCO
Using an object to change another object doesn't change the first object's value.
QCC
What tests can break this program?
*/

import javax.swing.JSpinner.NumberEditor;

public class Rational {
    protected int numerator;
    protected int denominator;

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int n, int d) {
        if (d != 0) {
        numerator = n;
        denominator = d;
        }
        else {
        numerator = 0;
        denominator = 1;
        }
    }

    public String toString() {
        return (numerator + "/" + denominator);
    }

    public double floatVal() {
        return (double)numerator / (double)denominator;
    }

    public void multiplyBy(Rational Rat) {
        numerator = numerator * Rat.numerator;
        denominator = denominator * Rat.denominator;
    }

    public void divideBy(Rational Rat) {
        numerator = numerator * Rat.denominator;
        denominator = denominator * Rat.numerator;
    }

    public static int gcd( int a, int b) {
      if (a == b) {
        return a;
      }
      else if (a > b) {
        return gcdER(a-b, b);
      }
      else {
        return gcdER(a, b-a);
      }
    }

    public Rational reduce(Rational r) {

      

    }

    public static void main(String[] args) {
        Rational r = new Rational(3, 6);
        Rational s = new Rational(1, 2);
        r.multiplyBy(s);
        System.out.println(r.toString());
        System.out.println(s.toString());
        r.divideBy(s);
        System.out.println(r.toString());
        System.out.println(s.toString());
        System.out.println(r.floatVal());
        System.out.println(s.floatVal());

    }
}
