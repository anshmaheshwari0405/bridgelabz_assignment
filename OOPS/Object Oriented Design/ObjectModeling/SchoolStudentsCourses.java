import java.util.*;
public class SchoolStudentsCourses {
    static class Course {
        String name;
        Set<Student> students = new HashSet<>();
        public Course(String name){ this.name=name; }
        public void enroll(Student s){ students.add(s); s.courses.add(this); }
        public String toString(){ return name+" -> "+students; }
    }
    static class Student {
        String name;
        Set<Course> courses = new HashSet<>();
        public Student(String name){ this.name=name; }
        public String toString(){ return name; }
    }
    static class School {
        String name;
        List<Student> students = new ArrayList<>();
        public School(String name){ this.name=name; }
        public void addStudent(Student s){ students.add(s); }
    }
    public static void main(String[] args){
        School s=new School("GreenHigh");
        Student st1=new Student("Anna");
        Student st2=new Student("Ben");
        s.addStudent(st1); s.addStudent(st2);
        Course c1=new Course("Math");
        Course c2=new Course("Art");
        c1.enroll(st1); c1.enroll(st2);
        c2.enroll(st1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(st1.courses);
    }
}
