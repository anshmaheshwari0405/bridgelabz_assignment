package Inheritance.AssistedProblems.Animal;

public class Bird extends Animal{
    Bird(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void makeSound()
    {
        System.out.println("Bird chirps!");
    }
}
