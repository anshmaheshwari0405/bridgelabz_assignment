package Inheritance.Single_Inheritance;

class Device {
    String deviceId;
    String status; 

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {
    double temperatureSetting; 

    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus(); 
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
        System.out.println("-------------------------");
    }
}

public class SmartHomeTest {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("T1001", "ON", 22.5);
        Thermostat t2 = new Thermostat("T1002", "OFF", 18.0);

        t1.displayStatus();
        t2.displayStatus();
    }
}
