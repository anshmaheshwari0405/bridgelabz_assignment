package VehicleSystem;

public class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankCapacity; // in liters

    PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling " + model + " with " + fuelTankCapacity + " liters tank.");
    }

    @Override
    void displayInfo() {
        System.out.println("Petrol Vehicle:");
        super.displayInfo();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
        System.out.println("-------------------------");
    }
}