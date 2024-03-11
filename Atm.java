package codsoft.task3_atm;


import java.util.Scanner;
	public class Atm{
	    private BankAccount account;

	    public Atm(BankAccount account) {
	        this.account = account;
	    }

	    public void start() {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Welcome to the ATM!");
	            System.out.println("1. Withdraw");
	            System.out.println("2. Deposit");
	            System.out.println("3. Check balance");
	            System.out.println("4. Exit");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    withdraw();
	                    break;
	                case 2:
	                    deposit();
	                    break;
	                case 3:
	                    checkBalance();
	                    break;
	                case 4:
	                    System.out.println("Goodbye!");
	                    System.exit(0);
	            }
	        }
	    }

	    private void withdraw() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the amount to withdraw: ");
	        double amount = scanner.nextDouble();

	        if (amount > account.getBalance()) {
	            System.out.println("Insufficient balance.");
	            return;
	        }

	        account.withdraw(amount);
	        System.out.println("Withdrawal successful!");
	    }

	    private void deposit() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the amount to deposit: ");
	        double amount = scanner.nextDouble();

	        account.deposit(amount);
	        System.out.println("Deposit successful!");
	    }

	    private void checkBalance() {
	        System.out.println("Your current balance is: " + account.getBalance());
	    }

	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000.0);
	        Atm atm = new Atm(account);
	        atm.start();
	    }
	}

