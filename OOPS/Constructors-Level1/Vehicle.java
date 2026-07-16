public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee=1000.0;
    public Vehicle(String ownerName,String vehicleType){
        this.ownerName=ownerName; this.vehicleType=vehicleType;
    }
    public void displayVehicleDetails(){ System.out.println(ownerName+" "+vehicleType+" Fee:"+registrationFee); }
    public static void updateRegistrationFee(double fee){ registrationFee=fee; }
}
