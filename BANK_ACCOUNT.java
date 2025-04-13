import java.util.*;

class Account {
    String name;
    int account_number;
    String account_type;
    double balance;

    Account(String name, int account_number, String account_type, double balance) {
        this.name = name;
        this.account_number = account_number;
        this.account_type = account_type;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited = " + amount);
            System.out.println("Balance = " + balance);
        }
    }

    void display() {
        System.out.println("Customer name = " + name);
        System.out.println("Customer Account number = " + account_number);
        System.out.println("Customer Account type = " + account_type);
        System.out.println("Current Balance = " + balance);
    }
}

class Savings_account extends Account {
    final double roi = 0.4;

    Savings_account(String name, int account_number, String account_type, double balance) {
        super(name, account_number, account_type, balance);
    }

    void interest() {
        double interest = balance * roi;
        balance += interest;
        System.out.println("Interest of " + roi + " is added: " + interest);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("No sufficient bank balance");
        }
    }
}

class Current_account extends Account {
    final double minimumBalance = 5000.0;
    final double serviceCharge = 500.0;

    Current_account(String name, int account_number,String account_type, double balance) {
        super(name, account_number, account_type, balance);
    }

    void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= serviceCharge;
            System.out.println("Service charge of " + serviceCharge + " imposed for low balance.");
        } else {
            System.out.println("Minimum balance maintained.");
        }
    }

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

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Savings Account with user input
        System.out.println("Creating Savings Account...");
        System.out.print("Enter Customer Name: ");
        String saName = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int saNumber = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        double saBalance = sc.nextDouble();

        Savings_account sa = new Savings_account(saName, saNumber, "Savings", saBalance);
        sa.display();

        System.out.print("Enter amount to deposit: ");
        sa.deposit(sc.nextDouble());

        sa.interest();

        System.out.print("Enter amount to withdraw: ");
        sa.withdraw(sc.nextDouble());

        sa.display();
        System.out.println();

        sc.nextLine(); // Clear the buffer

        // Create Current Account with user input
        System.out.println("Creating Current Account...");
        System.out.print("Enter Customer Name: ");
        String caName = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int caNumber = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        double caBalance = sc.nextDouble();

        Current_account ca = new Current_account(caName, caNumber,"Current", caBalance);
        ca.display();

        System.out.print("Enter amount to deposit: ");
        ca.deposit(sc.nextDouble());

        System.out.print("Enter amount to withdraw: ");
        ca.withdraw(sc.nextDouble());

        ca.display();
    }
}
