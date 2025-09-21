class FixedDepositAccount extends BankAccount {
    private int tenureMonths;
    FixedDepositAccount(String acc,double bal,int tenure){ super(acc,bal); this.tenureMonths = tenure; }
    void displayAccountType(){ System.out.println("FixedDeposit | Tenure:" + tenureMonths + " months"); }
}
