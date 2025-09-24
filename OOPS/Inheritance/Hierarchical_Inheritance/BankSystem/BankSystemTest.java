package BankSystem;

public class BankSystemTest {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA1001", 5000, 3.5);
        CheckingAccount checking = new CheckingAccount("CA2001", 2000, 1000);
        FixedDepositAccount fixed = new FixedDepositAccount("FD3001", 10000, 12);

        BankAccount[] accounts = {savings, checking, fixed};

        for (BankAccount acc : accounts) {
            acc.displayAccountType();
        }
    }
}
