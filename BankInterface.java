import java.util.HashMap;


public class BankInterface {
	private HashMap<String, Accounts> accountHolders = new HashMap<>();
	
	public void createAccount(int accountNumber, String accountName, double balance) {
		Accounts account = new Accounts(accountNumber,accountName,balance);
		accountHolders.put(accountName, account);
		System.out.println("account created successfully");
	}
	public boolean accountExists(int accountNumber) {
		return accountHolders.containsValue(accountNumber);
	}
	public void holderName(int accountNumber) {
		accountHolders.get(accountNumber);
	}
	public Accounts getAccount(int accountNumber) {
		return accountHolders.get(accountNumber);
		
	}
}

