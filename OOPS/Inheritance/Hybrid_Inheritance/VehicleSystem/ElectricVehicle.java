package VehicleSystem;

public class ElectricVehicle extends Vehicle {
    int batteryCapacity; // in kWh

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println("Charging " + model + " with " + batteryCapacity + " kWh battery.");
    }

    @Override
    void displayInfo() {
        System.out.println("Electric Vehicle:");
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("-------------------------");
    }
}
