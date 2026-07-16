public class HospitalManagement {
    static String hospitalName="City Hospital";
    final int patientID;
    String name;
    public HospitalManagement(int patientID,String name){
        this.patientID=patientID;
        this.name=name;
    }
    public String toString(){ return hospitalName+" "+patientID+" "+name; }
    public static void main(String[] args){
        HospitalManagement p=new HospitalManagement(1,"Ravi");
        System.out.println(p);
        System.out.println(p instanceof HospitalManagement);
    }
}
