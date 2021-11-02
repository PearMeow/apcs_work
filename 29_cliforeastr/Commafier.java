public class Commafier{

    public static String commafyF(int n) {
        String number = Integer.toString(n);
        String result = number;
        if (number.length() == 1 || number.length() == 2 || number.length() == 3) {
            return result;
        } 
        result = "";
      	int count = 0;
        for (int i = number.length(); i >= 1; i = i - 1) { 
            result = number.substring(i - 1, i) + result;
          	count += 1;
          	if (count%3 == 0 && count != number.length()) {
              result = "," + result;
        		}
        }
         
        return result;
    }
    public static void main(String[] args) {

        System.out.println(commafyF(1000980990));
        //commafyR(1000);
        //commafyR(1000000);
        //commafyF(1000);
        //commafyF(1000000);

    }

}