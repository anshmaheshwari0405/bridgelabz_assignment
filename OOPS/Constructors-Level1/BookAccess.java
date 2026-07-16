public class BookAccess {
    public String ISBN;
    protected String title;
    private String author;
    public BookAccess(String ISBN,String title,String author){
        this.ISBN=ISBN; this.title=title; this.author=author;
    }
    public void setAuthor(String a){ author=a; }
    public String getAuthor(){ return author; }
}
class EBook extends BookAccess {
    public EBook(String ISBN,String title,String author){ super(ISBN,title,author); }
    public void show(){ System.out.println(ISBN+" "+title); }
}
