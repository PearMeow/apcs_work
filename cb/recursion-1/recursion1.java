/*
Perry Huang and Lior Polischouk
APCS
HW64 -- Revisitation
2022-02-14
time spent: 0.5 hrs
Note: we got bored of the first few ones so we skipped to the end
*/

public class recursion1 {

    // Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively 
    // (without loops).
    
    public static int factorial(int n) {
        int output = n;
    
        if (n == 1) {
            return output;
        }
        else {
            output = output * factorial(n - 1);
        }
        return output;
    
    }
    
    // We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total 
    // number of ears across all the bunnies recursively (without loops or multiplication).
    
    public static int bunnyEars(int bunnies) {
    
        int output = 0;
        if (bunnies == 0) {
            return output;
        }
        else {
            output = 2 + bunnyEars(bunnies - 1);
        }
        return output;
    
    }
    
    // The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
    // The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is 
    // the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. 
    // Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.
    
    public int fibonacci(int n) {
    
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    
    }
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) 
    // we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n 
    // (without loops or multiplication).
    
    public int bunnyEars2(int bunnies) {
          int ears = 0;
          if (bunnies > 0) { 
            if (bunnies % 2 == 0) {
              ears = 3 + bunnyEars2(bunnies - 1);
            }
              else if (bunnies % 2 == 1) {
              ears = 2 + bunnyEars2(bunnies - 1);
            }
        }
          return ears;
    }
    
    // We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. 
    // Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.
      
    public int triangle (int rows) {
      int blocks = 0;
      if (rows == 0) {
        return blocks;
      }
      else {
        blocks += rows + triangle(rows - 1);
      }
      return blocks;
    }
      
    // Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit 
    // (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    public int sumDigits(int n) {
      int sum = 0;
      if (n < 10) {
        return sum + n;
      }
      else {
        sum += n % 10 + sumDigits(n / 10);
      }
      return sum;
    }
      
    // Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, 
    // without the sub strings overlapping.
    public int strCount(String str, String sub) {
      if (sub.length() > str.length()) {
        return 0;
      }
      if (str.substring(0, sub.length()).equals(sub)) {
        return 1 + strCount(str.substring(sub.length()), sub);
      }
      return strCount(str.substring(1), sub);
    }
    
    // Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, 
    // possibly with overlapping. N will be non-negative.
    public boolean strCopies (String str, String sub, int n) {
      if (sub.length() > str.length()) {
        return false;
      }
      if (n == 0) {
        return true;
      }
      if (str.substring(0, sub.length()).equals(sub)) {
        return strCopies(str.substring(1), sub, n-1);
      }
      return strCopies(str.substring(1), sub, n);
    }
      
    // Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.
    public static int strDist(String str, String sub) {
      if (sub.length() > str.length()) {
        return 0;
      }
      if (str.substring(0, sub.length()).equals(sub)) {
        if (str.substring(str.length() - sub.length(), str.length()).equals(sub)) {
          return str.length();
        }
        return strDist(str.substring(0, str.length()-1), sub);
      }
      return strDist(str.substring(1), sub);
    }
      
    }