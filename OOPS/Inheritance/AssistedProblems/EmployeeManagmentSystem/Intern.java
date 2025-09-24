package Inheritance.AssistedProblems.EmployeeManagmentSystem;

public class Intern extends Employee{
    int trainingPeriod;

    Intern(String name, int id, int salary, int trainingPeriod)
    {
        super(name, id, salary);
        this.trainingPeriod = trainingPeriod;
    }

    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Intern Training Period: " + trainingPeriod);
    }
}
