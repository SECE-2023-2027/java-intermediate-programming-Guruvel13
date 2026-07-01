import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount");
        } else {
            balance += amount;
            System.out.println("Amount Deposited Successfully.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Funds");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}

public class BankAccount_Transaction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();
        //Enter Account Number: ACC123
        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();
        // Enter Account Holder Name: John Doe
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        // Enter Initial Balance: 1000.0
        BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);

        System.out.println("Account Holder: " + account.getAccountHolderName());
        // Account Holder: John Doe
        System.out.println("Account Number: " + account.getAccountNumber());
        // Account Number: ACC123

        System.out.println("\nChoose Transaction:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        // Enter your choice: 1
        // Enter your choice: 2

        switch (choice) {
            case 1:
                System.out.print("Enter Deposit Amount: ");
                double depositAmount = sc.nextDouble();
                account.deposit(depositAmount);
                break;
                // Enter Deposit Amount: 500.0
            case 2:
                System.out.print("Enter Withdraw Amount: ");
                double withdrawAmount = sc.nextDouble();
                account.withdraw(withdrawAmount);
                break;
                // Enter Withdraw Amount: 200.0

            default:
                System.out.println("Invalid Choice");
        }

        System.out.println("Current Balance: " + account.getBalance());
        // Current Balance: 1300.0 - deposit
        // Current Balance: 800.0 - withdraw

        sc.close();
    }
}