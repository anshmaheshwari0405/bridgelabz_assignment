public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name; this.age=age;
    }
    public Person(Person other){
        this.name=other.name; this.age=other.age;
    }
    public String toString(){ return name+" age:"+age; }
}
