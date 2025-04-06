import java.util.Scanner;

// Base class
class Account {
    String customerName;
    String accountNumber;
    String accountType;
    double balance;

    // Constructor
    Account(String customerName, String accountNumber, String accountType, double initialBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Display balance
    void displayBalance() {
        System.out.println("Account Holder: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + balance);
    }
}

// Savings Account class
class SavingsAccount extends Account {
    final double interestRate = 0.04; // 4% interest

    SavingsAccount(String customerName, String accountNumber, double initialBalance) {
        super(customerName, accountNumber, "Savings", initialBalance);
    }

    // Compute and deposit interest
    void computeInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of " + interest + " added to balance.");
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

// Current Account class
class CurrentAccount extends Account {
    final double minimumBalance = 5000.0;
    final double serviceCharge = 500.0;

    CurrentAccount(String customerName, String accountNumber, double initialBalance) {
        super(customerName, accountNumber, "Current", initialBalance);
    }

    // Check minimum balance and impose penalty
    void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= serviceCharge;
            System.out.println("Service charge of " + serviceCharge + " imposed for low balance.");
        } else {
            System.out.println("Minimum balance maintained.");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            checkMinimumBalance();
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

// Main class to test the program
    public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Savings Account with user input
        System.out.println("Creating Savings Account...");
        System.out.print("Enter Customer Name: ");
        String saName = sc.nextLine();
        System.out.print("Enter Account Number: ");
        String saNumber = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double saBalance = sc.nextDouble();

        SavingsAccount sa = new SavingsAccount(saName, saNumber, saBalance);
        sa.displayBalance();

        System.out.print("Enter amount to deposit: ");
        sa.deposit(sc.nextDouble());

        sa.computeInterest();

        System.out.print("Enter amount to withdraw: ");
        sa.withdraw(sc.nextDouble());

        sa.displayBalance();
        System.out.println();

        sc.nextLine(); // Clear the buffer

        // Create Current Account with user input
        System.out.println("Creating Current Account...");
        System.out.print("Enter Customer Name: ");
        String caName = sc.nextLine();
        System.out.print("Enter Account Number: ");
        String caNumber = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double caBalance = sc.nextDouble();

        CurrentAccount ca = new CurrentAccount(caName, caNumber, caBalance);
        ca.displayBalance();

        System.out.print("Enter amount to deposit: ");
        ca.deposit(sc.nextDouble());

        System.out.print("Enter amount to withdraw: ");
        ca.withdraw(sc.nextDouble());

        ca.displayBalance();

        sc.close();
    }
}


