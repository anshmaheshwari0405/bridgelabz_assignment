public class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    public Employee(int employeeID,String department,double salary){
        this.employeeID=employeeID; this.department=department; this.salary=salary;
    }
    public void setSalary(double s){ salary=s; }
}
class Manager extends Employee {
    public Manager(int employeeID,String department,double salary){ super(employeeID,department,salary); }
    public void show(){ System.out.println(employeeID+" "+department); }
}
