public class array1{

  public static boolean firstLast6(int[] nums) {
  return (nums[0] == 6 || nums[nums.length - 1] == 6);
}

  public static boolean sameFirstLast(int[] nums) {
  return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
}

  public static int[] makePi() {
  int[] array = {3, 1, 4};
  return array;
}

  public static boolean commonEnd(int[] a, int[] b) {
  return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
}

  public static int sum3(int[] nums) {
  int result = 0;
  for (int i : nums) {
    result += i;
  }
  return result;
}



public static void main (String[] args) {
  int[] array = {1,2,6};
  System.out.println(firstLast6(array) + "," + sameFirstLast(array));
  int[] array2 = {6,1,2,3};
  System.out.println(firstLast6(array2) + "," + sameFirstLast(array2));
  int[] array3 = {13,6,1,2,3};
  System.out.println(firstLast6(array3) + "," + sameFirstLast(array3));

  System.out.println(makePi());

  int[] array4 = {1, 2, 3};
  int[] array5 = {7, 2, 3};
  int[] array6 = {8, 2, 1};
  int[] array7 = {0, 2, 4};
  System.out.println(commonEnd(array4, array5));
  System.out.println(commonEnd(array6, array7));

  System.out.println(sum3(array4));
  System.out.println(sum3(array5));
}
}
