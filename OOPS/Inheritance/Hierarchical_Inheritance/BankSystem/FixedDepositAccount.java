package BankSystem;

class FixedDepositAccount extends BankAccount {
    int maturityPeriod; 

    FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayInfo();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
        System.out.println("-------------------------");
    }
}