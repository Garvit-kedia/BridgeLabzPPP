public class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("S100",5000,3.5);
        CheckingAccount c = new CheckingAccount("C200",2000,1000);
        FixedDepositAccount f = new FixedDepositAccount("F300",10000,12);
        s.display(); s.displayAccountType();
        c.display(); c.displayAccountType();
        f.display(); f.displayAccountType();
    }
}
