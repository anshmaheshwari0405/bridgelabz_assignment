package Inheritance.Single_Inheritance;

class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}
class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); 
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); 
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
        System.out.println("-------------------------");
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Author author1 = new Author(
            "The Great Adventure",
            2021,
            "John Smith",
            "John Smith is a novelist who writes adventure and fantasy stories."
        );

        Author author2 = new Author(
            "Science Explained",
            2019,
            "Alice Johnson",
            "Alice is a science communicator and researcher in physics."
        );

        author1.displayInfo();
        author2.displayInfo();
    }
}
