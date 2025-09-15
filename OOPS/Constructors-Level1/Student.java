public class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;
    public Student(int rollNumber,String name,double cgpa){
        this.rollNumber=rollNumber; this.name=name; this.cgpa=cgpa;
    }
    public double getCgpa(){ return cgpa; }
    public void setCgpa(double c){ cgpa=c; }
}
class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber,String name,double cgpa){
        super(rollNumber,name,cgpa);
    }
    public void showName(){ System.out.println(name); }
}
