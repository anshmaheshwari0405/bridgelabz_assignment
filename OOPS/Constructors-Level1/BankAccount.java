public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;
    public BankAccount(int accountNumber,String accountHolder,double balance){
        this.accountNumber=accountNumber; this.accountHolder=accountHolder; this.balance=balance;
    }
    public double getBalance(){ return balance; }
    public void setBalance(double b){ balance=b; }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber,String accountHolder,double balance){
        super(accountNumber,accountHolder,balance);
    }
    public void show(){ System.out.println(accountNumber+" "+accountHolder); }
}
