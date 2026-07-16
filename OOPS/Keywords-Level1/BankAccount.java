public class BankAccount {
    private static String bankName="ABC Bank";
    private static int totalAccounts=0;
    private final int accountNumber;
    private String holder;
    public BankAccount(int accountNumber,String holder){
        this.accountNumber=accountNumber;
        this.holder=holder;
        totalAccounts++;
    }
    public static int getTotalAccounts(){ return totalAccounts; }
    public String toString(){ return bankName+" "+accountNumber+" "+holder; }
    public static void main(String[] args){
        BankAccount a=new BankAccount(1001,"John");
        BankAccount b=new BankAccount(1002,"Jane");
        System.out.println(a);
        System.out.println(b);
        System.out.println("Total:"+BankAccount.getTotalAccounts());
        System.out.println(a instanceof BankAccount);
    }
}
