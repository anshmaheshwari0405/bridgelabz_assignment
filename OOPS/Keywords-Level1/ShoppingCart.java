public class ShoppingCart {
    static double discount=0.1;
    final int productID;
    String name;
    double price;
    public ShoppingCart(int productID,String name,double price){
        this.productID=productID;
        this.name=name;
        this.price=price;
    }
    public double finalPrice(){ return price - price*discount; }
    public String toString(){ return productID+" "+name+" "+finalPrice(); }
    public static void main(String[] args){
        ShoppingCart p1=new ShoppingCart(101,"Pen",10);
        ShoppingCart p2=new ShoppingCart(102,"Book",50);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 instanceof ShoppingCart);
    }
}
