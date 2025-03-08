public class Accounts {
	private int accountNumber;
	private String accountName;
	private double balance;
	
	public Accounts(int accountNumber , String accountName, double balance) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String accountName() {
		return accountName;
	}
	public double checkBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount>=0) {
			balance +=amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount>=0 && amount<balance) {
			balance-=amount;
			System.out.println("withdrew"+amount++);
			System.out.println("new balacne"+balance++);
		}
		else {
			System.out.println("insufficient funds/invalid balance");
		}
	}
	

}
