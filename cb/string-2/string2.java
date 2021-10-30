public class string2 {
    public static String doubleChar(String str) {
        String results = "";
        for( int i = 0; i < str.length(); i++ )
          results += str.substring(i, i + 1) + str.substring(i, i + 1);
        return results;
      }
}
