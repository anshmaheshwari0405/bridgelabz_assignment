import java.util.*;
public class CompanyComposition {
    static class Employee {
        String name;
        public Employee(String name){ this.name=name; }
        public String toString(){ return name; }
    }
    static class Department {
        String name;
        List<Employee> employees = new ArrayList<>();
        public Department(String name){ this.name=name; }
        public void add(Employee e){ employees.add(e); }
        public String toString(){ return name+" -> "+employees; }
    }
    static class Company {
        String name;
        List<Department> depts = new ArrayList<>();
        public Company(String name){ this.name=name; }
        public Department createDepartment(String dname){ Department d=new Department(dname); depts.add(d); return d; }
        public void close(){ depts.clear(); }
    }
    public static void main(String[] args){
        Company c=new Company("TechCo");
        Department d1=c.createDepartment("HR");
        Department d2=c.createDepartment("Eng");
        d1.add(new Employee("E1"));
        d2.add(new Employee("E2"));
        System.out.println(c.depts);
        c.close();
        System.out.println(c.depts);
    }
}
