/*
<Flaming Hot Cheetos - Perry Huang and Salaj Jr, Courtney Huang and Timothy, Samantha Hua and Poppy>
APCS
HW<10> -- <Refactor Big Sib One/Greeting People, but printing it/Using another file to generate strings of text for this one to print>
<2021>-<10>-<04>
DISCOVERIES:
<You can add strings in java.
You have to change the void part of a method to make it be able to return a type of value.>

UNRESOLVED QUESTIONS:
<What values can be returned in a method?>
*/

public class Greet {
    public static void main( String[] args ){
        System.out.println( BigSib.greet("Crosby") );
        System.out.println( BigSib.greet("Stills") );
        System.out.println( BigSib.greet("Nash") );
    }
}
