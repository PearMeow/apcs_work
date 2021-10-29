public class string-1{

public static void main(String[] args){
  makeAbba("Hi", "Bye");
  makeAbba("Yo", "Alice");
  makeAbba("What", "Up");
  makeAbba("aaa", "bbb");
  makeAbba("x", "y");
  makeAbba("x", "");
  makeAbba("", "y");
  makeAbba("Bo", "Ya");
  makeAbba("Ya", "Ya");
}
public String helloName(String name) {
  return "Hello " + name + "!";
}
public String makeAbba(String a, String b) {
  return a + b + b + a;
}

}
