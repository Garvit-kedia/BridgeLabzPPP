public class BankAccount {
    static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    private final int accountNumber;
    private String accountHolderName;

    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
        }
    }
}