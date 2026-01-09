package CoreProgramming.JavaConstructors.Level1;
import java.util.Scanner;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;
    CarRental() {
        customerName = "Unknown";
        carModel = "Not Assigned";
        rentalDays = 0;
        costPerDay = 1000;   // default cost per day
    }
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = 1000;
    }
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }
    public void displayDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : ₹" + calculateTotalCost());
    }
}

public class RentalSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = input.nextLine();

        System.out.print("Enter car model: ");
        String carModel = input.nextLine();

        System.out.print("Enter rental days: ");
        int rentalDays = input.nextInt();

        CarRental rental = new CarRental(customerName, carModel, rentalDays);

        System.out.println("\nCar Rental Details:");
        rental.displayDetails();
    }
}
