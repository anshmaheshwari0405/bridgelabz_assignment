import java.util.*;
public class UniversityManagementSystem {
    static class Course {
        String name; Faculty professor;
        public Course(String name){ this.name=name; }
        public void assignProfessor(Faculty f){ this.professor=f; }
        public String toString(){ return name+" taught by "+(professor==null?"None":professor.name); }
    }
    static class Student {
        String name; List<Course> courses = new ArrayList<>();
        public Student(String name){ this.name=name; }
        public void enrollCourse(Course c){ courses.add(c); }
        public String toString(){ return name+" -> "+courses; }
    }
    static class Faculty { String name; public Faculty(String name){ this.name=name; } }
    public static void main(String[] args){
        Faculty f=new Faculty("Prof X");
        Course c1=new Course("Algorithms");
        c1.assignProfessor(f);
        Student s=new Student("Sam");
        s.enrollCourse(c1);
        System.out.println(c1);
        System.out.println(s);
    }
}
