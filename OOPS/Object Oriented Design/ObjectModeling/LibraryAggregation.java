import java.util.*;
public class LibraryAggregation {
    static class Book {
        String title;
        String author;
        public Book(String title,String author){ this.title=title; this.author=author; }
        public String toString(){ return title+" by "+author; }
    }
    static class Library {
        String name;
        List<Book> books = new ArrayList<>();
        public Library(String name){ this.name=name; }
        public void addBook(Book b){ books.add(b); }
        public void showBooks(){ System.out.println(name+" books: "+books); }
    }
    public static void main(String[] args){
        Book b1=new Book("Java","A"); Book b2=new Book("DS","B");
        Library lib1=new Library("Central"); Library lib2=new Library("Community");
        lib1.addBook(b1); lib1.addBook(b2);
        lib2.addBook(b2);
        lib1.showBooks(); lib2.showBooks();
    }
}
