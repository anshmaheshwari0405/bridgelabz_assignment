public class LibraryManagement {
    static String libraryName="City Library";
    static int totalBooks=0;
    final String isbn;
    String title;
    public LibraryManagement(String isbn,String title){
        this.isbn=isbn;
        this.title=title;
        totalBooks++;
    }
    public String toString(){ return libraryName+" "+isbn+" "+title; }
    public static void main(String[] args){
        LibraryManagement b1=new LibraryManagement("111","Java");
        LibraryManagement b2=new LibraryManagement("222","Python");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("Total:"+totalBooks);
        System.out.println(b1 instanceof LibraryManagement);
    }
}
