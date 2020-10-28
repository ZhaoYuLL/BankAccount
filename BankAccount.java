public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(double b, String p){
    balance = b;
    password = p;
    balance = 0;
  }

  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  public String getPassword(){
    return password;
  }

  public void setPassword(String p){
    password = p;
  }


}
