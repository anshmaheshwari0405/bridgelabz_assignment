package Inheritance.AssistedProblems.EmployeeManagmentSystem;

public class Developer extends Employee{
    String programmingLanguage;

    Developer(String name, int id, int salary, String programmingLanguage)
    {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Developer Programming Language: " + programmingLanguage);
    }
}
