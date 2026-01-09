package CoreProgramming.JavaConstructors.InstanceClassVariablesAndMethods;
import java.util.Scanner;

class Vehicle {

    String ownerName;
    String vehicleType;

    static double registrationFee = 5000.0;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name        : " + ownerName);
        System.out.println("Vehicle Type      : " + vehicleType);
        System.out.println("Registration Fee  : " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class vehicleDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter owner name: ");
        String ownerName = input.nextLine();

        System.out.print("Enter vehicle type: ");
        String vehicleType = input.nextLine();

        Vehicle v1 = new Vehicle(ownerName, vehicleType);

        System.out.println("\nVehicle Details:");
        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6500.0);

        System.out.println("\nAfter Updating Registration Fee:");
        v1.displayVehicleDetails();
    }
}
