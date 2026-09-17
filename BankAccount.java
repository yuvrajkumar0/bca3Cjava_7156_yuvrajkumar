class InsaBalException extends Exception{
	public InsaBalException(String message){
		super (message);
		
	}
}

  public class BankAccount{
	  private double balance;
	  public BankAccount(double balance){
		  this.balance = balance;
	  }
	  public void withdraw (double amount) throws InsaBalException{
		  if(amount>balance){
			  throw new InsaBalException("Insufficient balance in account");
		  }
		  balance-= amount;
		  System.out.println("withdraw sucessful remaining balance " + balance);
	  }
	  
	  public static void main(String[] args ){
		  BankAccount account = new BankAccount(1200.0);
		  try{
			  account.withdraw(600.0);
			  account.withdraw(500.0);
		  }
	  catch(InsaBalException e ){
		  System.out.println("Error" + e.getMessage());
	  }
	  }
  }