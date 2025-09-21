class CheckingAccount extends BankAccount {
    private double withdrawalLimit;
    CheckingAccount(String acc,double bal,double limit){ super(acc,bal); this.withdrawalLimit = limit; }
    void displayAccountType(){ System.out.println("Checking | Limit:" + withdrawalLimit); }
}
