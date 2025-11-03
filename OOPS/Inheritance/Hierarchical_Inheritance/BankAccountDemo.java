class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("--- Savings Account ---");
        System.out.println("Account No: " + accountNumber + ", Balance: $" + balance);
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("--- Checking Account ---");
        System.out.println("Account No: " + accountNumber + ", Balance: $" + balance);
        System.out.println("Daily Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int tenureMonths;

    FixedDepositAccount(String accountNumber, double balance, int tenureMonths) {
        super(accountNumber, balance);
        this.tenureMonths = tenureMonths;
    }

    void displayAccountType() {
        System.out.println("--- Fixed Deposit Account ---");
        System.out.println("Account No: " + accountNumber + ", Balance: $" + balance);
        System.out.println("Tenure (Months): " + tenureMonths);
    }
}

public class BankAccountDemo{
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("S1001", 5000.00, 0.04);
        CheckingAccount ca = new CheckingAccount("C2002", 1200.50, 1000.00);
        FixedDepositAccount fda = new FixedDepositAccount("F3003", 20000.00, 36);

        sa.displayAccountType();
        ca.displayAccountType();
        fda.displayAccountType();
    }
}
