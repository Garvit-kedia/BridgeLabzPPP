class SavingsAccount extends BankAccount {
    private double interestRate;
    SavingsAccount(String acc,double bal,double rate){ super(acc,bal); this.interestRate = rate; }
    void displayAccountType(){ System.out.println("Savings | Interest:" + interestRate); }
}
