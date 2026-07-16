public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available=true;
    public LibraryBook(String title,String author,double price){
        this.title=title; this.author=author; this.price=price;
    }
    public void borrow(){ available=false; }
    public String toString(){ return title+" by "+author+" price:"+price+" Available:"+available; }
}
