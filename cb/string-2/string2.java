public class string2 {

    /*
     * Given a string, return a string where for every char in the original,
     * there are two chars.
     */
  
    public static String doubleChar(String str) {
        String results = "";
        for( int i = 0; i < str.length(); i++ )
          results += str.substring(i, i + 1) + str.substring(i, i + 1);
        return results;
      }

    /*
     * Return the number of times that the string "hi" appears anywhere in the
     * given string.
     */

    public static int countHi(String str) {
        int j = 0;
        for (int i = 0; i < str.length() - 1; i++){
          if (str.substring(i, i+2).equals("hi")) {
            j++;
          }
        }
        return j;
      }

    /*
     * Return true if the string "cat" and "dog" appear the same number of times
     * in the given string.
     */

    public static boolean catDog(String str) {
        int cats = 0;
              for (int i = 0; i < str.length() - 2; i++){
                if (str.substring(i, i+3).equals("cat")) {
                  cats++;
                }
              }
        int dogs = 0;
              for (int j = 0; j < str.length() - 2; j++){
                if (str.substring(j, j+3).equals("dog")) {
                  dogs++;
                }
              }
        return (cats == dogs);
      }

    /*
     * Return the number of times that the string "code" appears anywhere in the
     * given string, except we'll accept any letter for the 'd', so "cope" and
     * "cooe" count.
     */

    public static int countCode(String str) {
        int code = 0;
        for (int i = 0; i < str.length() - 3; i++){
              if (str.substring(i, i+2).equals("co") && (str.substring(i+3, i+4).equals("e"))) {
                code++;
              }
        }
        return code;
      }

    /*
     * Given two strings, return true if either of the strings appears at the
     * very end of the other string, ignoring upper/lower case differences (in
     * other words, the computation should not be "case sensitive"). Note:
     * str.toLowerCase() returns the lowercase version of a string.
     */

    public static boolean endOther(String a, String b) {
        String aLowercase = a.toLowerCase();
        String bLowercase = b.toLowerCase();
        if (aLowercase.length() == bLowercase.length()) {
          return aLowercase.equals(bLowercase);
        }
        
        else if (aLowercase.length() <= bLowercase.length()) {
          int i = bLowercase.length() - aLowercase.length();
          return bLowercase.substring(i, i + aLowercase.length()).equals(aLowercase);
          }
        
        else {
          int i = aLowercase.length() - bLowercase.length();
          return aLowercase.substring(i, i + bLowercase.length()).equals(bLowercase);
        }
    }

    /*
     * Return true if the given string contains an appearance of "xyz" where the
     * xyz is not directly preceeded by a period (.). So "xxyz" counts but
     * "x.xyz" does not.
     */

    public static boolean xyzThere(String str) {
      boolean xyz = true;
            if (str.length() < 3) {
              return false;
            }
            else if (str.length() == 3) {
              return str.equals("xyz");
            }
            else if (str.length() > 3 && str.substring(0, 3).equals("xyz")) {
              return true;
            }
            else {
              for (int i = 0; i < str.length() - 2; i++){
              if (str.substring(i, i+3).equals("xyz")) {
                if (str.substring(i-1, i+3).equals(".xyz")) {
                  xyz = false; 
                }
                else {
                  return xyz = true;
                }
              }
              else {
                xyz = false;
                
              }
            }
            }
      return xyz;
    }
      
    
      public static void main(String[] args){
        System.out.println(doubleChar("The")); // "TThhee"
        System.out.println(doubleChar("AAbb")); // "AAAAbbbb"
        System.out.println(doubleChar("Hi-There")); // "HHii--TThheerree"
        System.out.println("------------------------");
        System.out.println(countHi("abc hi ho")); // 1
        System.out.println(countHi("ABChi hi")); // 2
        System.out.println(countHi("hihi")); // 2
        System.out.println("------------------------");
        System.out.println(catDog("catdog")); // true
        System.out.println(catDog("catcat")); // false
        System.out.println(catDog("1cat1cadodog")); // true
        System.out.println("------------------------");
        System.out.println(countCode("aaacodebbb")); // 1
        System.out.println(countCode("codexxcode")); // 2
        System.out.println(countCode("cozexxcope")); // 2
        System.out.println("------------------------");
        System.out.println(endOther("Hiabc", "abc")); // true
        System.out.println(endOther("AbC", "HiaBc")); // true
        System.out.println(endOther("abc", "abXabc")); // true
        System.out.println("------------------------");
        System.out.println(xyzThere("abcxyz")); // true
        System.out.println(xyzThere("abc.xyz")); // false
        System.out.println(xyzThere("xyz.abc")); // true

      }
}
