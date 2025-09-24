package Inheritance.AssistedProblems.Animal;

public class Animal {
    String name;
    int age;

    Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void makeSound()
    {
        System.out.println("Animal makes sound!");
    }
}
