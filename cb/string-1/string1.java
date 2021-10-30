public class string1 {

    public static String helloName(String name) {
        return "Hello " + name + "!";
      }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
      }

    public static void main(String[] args) {
        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));
        System.out.println(helloName("Dolly"));
        System.out.println(helloName("Alpha"));
        System.out.println(helloName("Omega"));
        System.out.println(helloName("ho ho ho"));
        System.out.println(helloName("xyz"));
        System.out.println(helloName("hello"));
        System.out.println("------------------------");
        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));
        System.out.println(makeAbba("What", "Up"));
        System.out.println(makeAbba("aaa", "bbb"));
        System.out.println(makeAbba("x", "y"));
        System.out.println(makeAbba("x", ""));
        System.out.println(makeAbba("", "y"));
        System.out.println(makeAbba("Bo", "Ya"));
        System.out.println(makeAbba("Ya", "Ya"));
    }
}
