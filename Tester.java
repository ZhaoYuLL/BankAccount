public class Tester{
  public static void main(String[] args){
    BankAccount b1 = new BankAccount(1234,"1234");
    System.out.println(b1.getBalance());
    b1.setPassword("43521");
    System.out.println(b1.getPassword());
  }
}
