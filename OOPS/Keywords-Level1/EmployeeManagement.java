public class EmployeeManagement {
    static String companyName="TechCorp";
    static int totalEmployees=0;
    final int id;
    String name;
    public EmployeeManagement(int id,String name){
        this.id=id;
        this.name=name;
        totalEmployees++;
    }
    public String toString(){ return companyName+" "+id+" "+name; }
    public static void main(String[] args){
        EmployeeManagement e1=new EmployeeManagement(1,"A");
        EmployeeManagement e2=new EmployeeManagement(2,"B");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println("Total:"+totalEmployees);
        System.out.println(e1 instanceof EmployeeManagement);
    }
}
