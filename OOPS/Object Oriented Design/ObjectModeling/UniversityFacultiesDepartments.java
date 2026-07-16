import java.util.*;
public class UniversityFacultiesDepartments {
    static class Faculty {
        String name;
        public Faculty(String name){ this.name=name; }
        public String toString(){ return name; }
    }
    static class Department {
        String name;
        List<Faculty> faculties = new ArrayList<>();
        public Department(String name){ this.name=name; }
        public void addFaculty(Faculty f){ faculties.add(f); }
        public String toString(){ return name+" -> "+faculties; }
    }
    static class University {
        String name;
        List<Department> depts = new ArrayList<>();
        public University(String name){ this.name=name; }
        public Department createDept(String name){ Department d=new Department(name); depts.add(d); return d; }
        public void close(){ depts.clear(); }
    }
    public static void main(String[] args){
        Faculty f1=new Faculty("Dr A");
        Faculty f2=new Faculty("Dr B");
        Department d1=new Department("CS");
        d1.addFaculty(f1);
        University u=new University("UniX");
        u.createDept("Math");
        u.depts.add(d1);
        System.out.println(u.depts);
        u.close();
        System.out.println(u.depts);
        System.out.println(f1);
    }
}
