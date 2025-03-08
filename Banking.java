import java.util.Scanner;

public class Banking {
	
	public static BankInterface bankInterface = new BankInterface();
	public static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		while(true) {
			displaymenu();
			int option = scanner.nextInt();
			
			switch(option) {
			
			case 1:
				createAccount();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				checkBalance();
				break;
			case 5:
				System.out.println("thank you for banking with us"
						+ "exiting system");
				scanner.close();
				return;
			default:
				System.out.println("please choose an valid option");
				
			}
			
		}
	}
	
	public static void displaymenu() {
		System.out.println("/n====================banking system======================");
		System.out.println("1. create account");
		System.out.println("2. deposid money");
		System.out.println("3. withdraw money");
		System.out.println("4. check balance");
		System.out.println("5. exit");
	}
	public static void createAccount() {
		System.out.println("enter your account Number");
		int accountNumber = scanner.nextInt();
		System.out.println("enter you name");
		String accountName = scanner.next();
		System.out.println("enter you balance");
		double balance = scanner.nextDouble();
		
		if(bankInterface.accountExists(accountNumber)) {
			System.out.println("accout with this account number already exists");
		}
		else {
			bankInterface.createAccount(accountNumber, accountName, balance);
		}
		
	}
	private static void deposit() {
		System.out.println("enter the account number");
		int accountNumber = scanner.nextInt();
		if(bankInterface.accountExists(accountNumber)) {
			System.out.println("account with this account number already exists");
		}
		else {
			Accounts account = bankInterface.getAccount(accountNumber);
			System.out.println("enter deposit amount. ");
			double amount = scanner.nextDouble();
			account.deposit(amount);
			System.out.println("the "+amount+" has been deposited");
		}
		
	}
	private static void withdraw() {
		System.out.println("enter the account number");
		int accountNumber = scanner.nextInt();
		if(bankInterface.accountExists(accountNumber)) {
			System.out.println("account with this account number already exists");
		}
		else {
			Accounts account = bankInterface.getAccount( accountNumber);
			System.out.println("enter the wothdrawl amount");
			int amount = scanner.nextInt();
			account.withdraw(amount);
		}
		
	}
	private static void checkBalance() {
		System.out.println("enter the account number");
		int accountNumber = scanner.nextInt();
		if(!bankInterface.accountExists(accountNumber)) {
			System.out.println("account with this account number does not exist");
		}
		else {
			Accounts account = bankInterface.getAccount(accountNumber);
			System.out.println("you account balance is"+account.checkBalance());
		}
	}
}

