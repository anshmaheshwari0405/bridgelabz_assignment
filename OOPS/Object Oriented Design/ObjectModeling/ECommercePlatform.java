import java.util.*;
public class ECommercePlatform {
    static class Product {
        String id; String name; double price;
        public Product(String id,String name,double price){ this.id=id; this.name=name; this.price=price; }
        public String toString(){ return name+"("+id+")"; }
    }
    static class Order {
        String id; List<Product> products = new ArrayList<>();
        public Order(String id){ this.id=id; }
        public void add(Product p){ products.add(p); }
        public String toString(){ return id+" -> "+products; }
    }
    static class Customer {
        String name;
        List<Order> orders = new ArrayList<>();
        public Customer(String name){ this.name=name; }
        public Order placeOrder(String oid){ Order o=new Order(oid); orders.add(o); return o; }
    }
    public static void main(String[] args){
        Product p1=new Product("P1","Phone",500);
        Product p2=new Product("P2","Case",20);
        Customer c=new Customer("Shopper");
        Order o=c.placeOrder("O1");
        o.add(p1); o.add(p2);
        System.out.println(c.orders);
    }
}
