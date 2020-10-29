public class Tester{
  //Mr.K's test cases
  // public static void main(String[]args){
  //     BankAccount b1 = new BankAccount(1000001, "abc123");
  //     BankAccount b2 = new BankAccount(1000231, "abcasdg23");
  //
  //     System.out.println("Account b1:");
  //     b1.deposit(3000.0);
  //     b2.deposit(1234.0);
  //     System.out.println(b1);
  //     System.out.println("Account b2:");
  //     System.out.println(b2);
  //     System.out.println();
  //
  //
  //     double cashAmount = 300.0;
  //     while(cashAmount < 3000){
  //       System.out.println("Attempt to move $"+cashAmount+" from the b1 to b2 account:");
  //       if(b1.withdraw(cashAmount) ){
  //         if(b2.deposit(cashAmount)){
  //           System.out.println(b1);
  //           System.out.println(b2);
  //           System.out.println();
  //
  //         }else{
  //           //This should never happen.
  //           //Error message provided to make sure that is the case
  //           System.out.println("CRITICAL ERROR! $"+cashAmount +
  //                              " withdrawn from Account #" +  b1.getAccountID() +
  //                              "Failed to add to Account #"+b2.getAccountID());
  //         }
  //       }else{
  //         System.out.println("Transfer Failed");
  //       }
  //
  //       cashAmount *= 2;
  //     }
  //   }
  //Christopher Liu's test cases
  // public static void main(String[] args) {
  //       boolean allGood = true;
  //       BankAccount x = new BankAccount(123456, "test123");
  //
  //       allGood = check("x.toString()", x.toString(), "123456\t0.0");
  //       allGood = check("x.deposit(12)", x.deposit(12), true);
  //       allGood = check("x.getBalance()", x.getBalance(), 12.0);
  //       allGood = check("x.toString()", x.toString(), "123456\t12.0");
  //       allGood = check("x.getAccountID", x.getAccountID(), 123456);
  //       allGood = check("x.deposit(-12)", x.deposit(-12), false);
  //       allGood = check("x.withdraw(5)", x.withdraw(5), true);
  //       allGood = check("x.withdraw(-2)", x.withdraw(-2), false);
  //       allGood = check("x.withhdraw(100)", x.withdraw(100), false);
  //       allGood = check("x.getBalance()", x.getBalance(), 7.0);
  //
  //       // There's no way to check the password, so I'll use a try/catch to
  //       // see if it fails somehow.
  //       try {
  //           x.setPassword("new!");
  //       } catch (Exception e) {
  //           allGood = false;
  //           System.out.println("Failure on x.setPassword: Crashed.");
  //       }
  //
  //       if (allGood) System.out.println("All good!");
  //   }
  //
  //   public static boolean check(String name, String actual, String expected) {
  //       if (actual.equals(expected)) return true;
  //       else {
  //           System.out.println("Failure on " + name + ": Expected \"" + expected + "\", got \"" + actual + "\".");
  //           return false;
  //       }
  //   }
  //
  //   public static boolean check(String name, double actual, double expected) {
  //       if (actual == expected) return true;
  //       else {
  //           System.out.println("Failure on " + name + ": Expected \"" + expected + "\", got \"" + actual + "\".");
  //           return false;
  //       }
  //   }
  //
  //   public static boolean check(String name, int actual, int expected) {
  //       if (actual == expected) return true;
  //       else {
  //           System.out.println("Failure on " + name + ": Expected \"" + expected + "\", got \"" + actual + "\".");
  //           return false;
  //       }
  //   }
  //
  //   public static boolean check(String name, boolean actual, boolean expected) {
  //       if (actual == expected) return true;
  //       else {
  //           System.out.println("Failure on " + name + ": Expected \"" + expected + "\", got \"" + actual + "\".");
  //           return false;
  //       }
  //   }
}
