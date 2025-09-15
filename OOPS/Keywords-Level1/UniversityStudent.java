public class UniversityStudent {
    static String universityName="XYZ University";
    final int rollNumber;
    String name;
    public UniversityStudent(int rollNumber,String name){
        this.rollNumber=rollNumber;
        this.name=name;
    }
    public String toString(){ return universityName+" "+rollNumber+" "+name; }
    public static void main(String[] args){
        UniversityStudent s=new UniversityStudent(10,"Rahul");
        System.out.println(s);
        System.out.println(s instanceof UniversityStudent);
    }
}
