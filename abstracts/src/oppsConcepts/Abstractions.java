package oppsConcepts;

abstract class BankAccount{
	private double balance;
	
	public BankAccount(double initialBalance) {
		  balance = initialBalance;
	}
	
	public void deposit(double amount) {
		balance +=amount;
		System.out.println("Deposited $"+amount);
	}
	public void withdraw(double amount) {
		if(balance>= amount) {
			balance -= amount;
			System.out.println("Withdrawn $"+amount);
		
		}else {
			System.out.println("Insufficient balance");
		}
	}
	public void checkBalance() {
		System.out.println("Current balance: $"+balance);
	}
}
class SavingsAccount extends BankAccount{
	public SavingsAccount(double initialBalance){
		super(initialBalance);
	}
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
	}
	
}
class CheckingAccount extends BankAccount{
	public CheckingAccount(double initialBalance) {
		super(initialBalance);
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
	}
}

public class Abstractions {

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(1000);
		CheckingAccount checkingAccount = new CheckingAccount(500);
		
		savingsAccount.checkBalance();
		savingsAccount.deposit(500);
		savingsAccount.withdraw(200);
		savingsAccount.checkBalance();
		
		System.out.println();
		
		checkingAccount.checkBalance();
		checkingAccount.deposit(100);
		checkingAccount.withdraw(1000);
		checkingAccount.checkBalance();
		
		
		

	}

}
