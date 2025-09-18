import java.util.Scanner;

public class ATM {
    static class BankAccount {
        String accountHolder;
        String accountNumber;
        double balance;

        BankAccount(String accountHolder, String accountNumber, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        void displayBalance() {
            System.out.println("Current Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Bob", "1234567890", 1000);
        account.displayBalance();
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(1500);
        account.displayBalance();
    }
}