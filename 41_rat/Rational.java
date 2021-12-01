/*
Team BPK: Ben Belotser, Perry Huang, Kosta Dubovskiy
APCS pd07
hw41
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