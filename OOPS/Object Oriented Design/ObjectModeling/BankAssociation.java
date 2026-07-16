import java.util.*;
public class BankAssociation {
    static class Account {
        String id;
        double balance;
        public Account(String id,double balance){ this.id=id; this.balance=balance; }
    }
    static class Customer {
        String name;
        List<Account> accounts = new ArrayList<>();
        public Customer(String name){ this.name=name; }
        public void viewBalances(){ for(Account a:accounts) System.out.println(name+" -> "+a.id+":"+a.balance); }
    }
    static class Bank {
        String name;
        List<Customer> customers = new ArrayList<>();
        public Bank(String name){ this.name=name; }
        public Account openAccount(Customer c,String id,double bal){ Account a=new Account(id,bal); c.accounts.add(a); if(!customers.contains(c)) customers.add(c); return a; }
    }
    public static void main(String[] args){
        Bank b=new Bank("SafeBank");
        Customer c1=new Customer("Alice");
        Customer c2=new Customer("Bob");
        b.openAccount(c1,"A1",1000);
        b.openAccount(c1,"A2",500);
        b.openAccount(c2,"B1",200);
        c1.viewBalances();
        c2.viewBalances();
    }
}
