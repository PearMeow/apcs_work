/*
The Cats: Faiyaz Rafee, Perry Huang, Xinqing Lin
APCS
HW#20 -- External Audit/White hacking BankAccount.java/Stress testing another trio's BankAccount.java from Teller.java
2021-10-19
*/

/*
DISCO:

QCC:

*/
//A good Q: What operations are possible from BankAccount’s main() method but not Teller’s?

public class Teller{

    private String name;
    private String passwd;
    private short pin;
    private int acctNum;
    private double balance;

  public static void main(String [] args){
// create BankAccount of cats
    BankAccount cats = new BankAccount();
    cats.setName("Mr. Cat");
    cats.setPasswd("bugs4");
// testing limits of setAcctNum and setPin
    cats.setAcctNum(999999998);
    cats.setPin((short)9998);
// testing limits of withdraw and deposit
    cats.setBalance(1);
    cats.withdraw(1);
    cats.withdraw(-1);
    cats.deposit(-1);
    cats.deposit(99);
    System.out.println(cats.toString());
    System.out.println(cats.authenticate(999999992, "randompasswordthatisn'tright")); //i dont think this one works
    System.out.println(cats.authenticate(999999998, "bugs4"));
  }

}
