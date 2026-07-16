package SchoolSystem;

public class SchoolSystemTest {
     public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice Johnson", 35, "Mathematics");
        Student student = new Student("Bob Smith", 16, "10th Grade");
        Staff staff = new Staff("Charlie Brown", 40, "Administration");

        // Demonstrating hierarchical inheritance
        Person[] people = {teacher, student, staff};

        for (Person p : people) {
            p.displayRole();
        }
    }
}