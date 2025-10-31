public class BankAccount {

    public String accountHolderName;
    public final int accountNumber;
    
    public static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public void displayDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Holder: ".concat(this.accountHolderName));
        System.out.println("Account: " + this.accountNumber);
    }

    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }
}

class BankSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1001);
        BankAccount acc2 = new BankAccount("Bob", 1002);

        BankAccount.getTotalAccounts();

        acc1.displayDetails();
        
        Object obj = "NotAnAccount";

        if (acc1 instanceof BankAccount) {
            System.out.println("acc1 is a BankAccount instance.");
        }

        if (!(obj instanceof BankAccount)) {
            System.out.println("obj is NOT a BankAccount instance.");
        }
    }
}
