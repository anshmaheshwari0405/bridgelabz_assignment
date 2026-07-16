package VehicleSystem;
public class VehicleSystemTest {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model 3", 250, 75);
        PetrolVehicle honda = new PetrolVehicle("Honda Civic", 220, 40);

        // Displaying details
        tesla.displayInfo();
        tesla.charge();

        honda.displayInfo();
        honda.refuel();

        // Polymorphism with superclass reference
        Vehicle[] vehicles = {tesla, honda};
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }

        // Interface polymorphism
        Refuelable refuelableCar = honda;
        refuelableCar.refuel();
    }
}