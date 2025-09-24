package Inheritance.AssistedProblems.EmployeeManagmentSystem;

public class Manager extends Employee{
    int teamSize;

    Manager(String name, int id, int salary, int teamSize)
    {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Manager Team Size: " + teamSize);
    }
}
