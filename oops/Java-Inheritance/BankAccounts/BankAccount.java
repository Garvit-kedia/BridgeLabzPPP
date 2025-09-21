class BankAccount {
    private String accountNumber;
    private double balance;
    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber; this.balance = balance;
    }
    void display() { System.out.println(accountNumber + " Balance:" + balance); }
}
