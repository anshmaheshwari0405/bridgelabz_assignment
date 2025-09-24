// Abstract class representing a general Vehicle

abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    private double rentalRate; // rate per day

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters and setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        if (vehicleNumber != null && !vehicleNumber.isEmpty()) {
            this.vehicleNumber = vehicleNumber;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null && !type.isEmpty()) {
            this.type = type;
        }
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        if (rentalRate >= 0) {
            this.rentalRate = rentalRate;
        }
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);

    // Concrete method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per day: $" + rentalRate);
    }
}

// Interface for insurable vehicles
interface Insurable {

    double calculateInsurance();

    String getInsuranceDetails();
}

// Car class
class Car extends Vehicle implements Insurable {

    private static final double INSURANCE_RATE = 100; // fixed insurance

    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: $" + calculateInsurance();
    }
}

// Bike class
class Bike extends Vehicle implements Insurable {

    private static final double INSURANCE_RATE = 50;

    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: $" + calculateInsurance();
    }
}

// Truck class
class Truck extends Vehicle implements Insurable {

    private static final double INSURANCE_RATE = 200;

    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: $" + calculateInsurance();
    }
}

// Demo class
public class VehicleRentalSystem {

    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("CAR123", 100),
            new Bike("BIKE456", 30),
            new Truck("TRUCK789", 200)
        };

        int rentalDays = 5;

        System.out.println("=== Vehicle Rental Details ===");
        for (Vehicle v : vehicles) {
            v.displayVehicleDetails();
            System.out.println("Rental Cost for " + rentalDays + " days: $" + v.calculateRentalCost(rentalDays));

            if (v instanceof Insurable) {
                Insurable i = (Insurable) v; // polymorphism
                System.out.println(i.getInsuranceDetails());
            }

            System.out.println("-----------------------------");
        }
    }
}
