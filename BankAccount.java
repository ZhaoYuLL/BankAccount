public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
  // comment

  public BankAccount(int id, String p){
    accountID = id;
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

  public boolean deposit(double amount){
    if(amount>0){
      balance += amount;
      return true;
    }else if(amount < 0){
      return false;
    }
    return true;
  }

  public boolean withdraw(double amount){
    if(amount > balance || amount < 0){
      return false;
    }else if(amount > 0){
      balance = balance - amount;
      return true;
    }
    return false;
  }

  public String toString(){
    return "#" + String.valueOf(accountID) + "\t" + "$" +String.valueOf(balance);
  }

  private boolean authenticate(String password){
    return this.password.equals(password);
  }

  public boolean transferTo(BankAccount other, double amount, String password){
    if(authenticate(password) && withdraw(amount)){
      if(other.deposit(amount)){
        return true;
      }
    }
    return false;
  }


}
