//<Perry> <Huang>
//APCS
//HW<08> -- <Refactor Freshie Zero/Greeting People/Using a method inside the main method to greet people>
//<2021>-<09>-<30>

public class Greet{

    public static void main(String[] args) {
        greet("Salaj");
        greet("Perry");
        greet("Lawrence");
  }

    static void greet(String str){
        System.out.print("What's up ");
        System.out.print(str);
	System.out.println("?");
  }

} 

// Questions: Why is static needed for methods? 
// What does public do?
