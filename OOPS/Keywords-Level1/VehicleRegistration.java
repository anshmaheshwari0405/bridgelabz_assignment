public class VehicleRegistration {
    static double registrationFee=500.0;
    final String registrationNumber;
    String owner;
    public VehicleRegistration(String registrationNumber,String owner){
        this.registrationNumber=registrationNumber;
        this.owner=owner;
    }
    public String toString(){ return registrationNumber+" "+owner+" Fee:"+registrationFee; }
    public static void main(String[] args){
        VehicleRegistration v=new VehicleRegistration("MH01AB1234","Aman");
        System.out.println(v);
        System.out.println(v instanceof VehicleRegistration);
    }
}
