package CoreProgramming.JavaConstructors.Level1;
import java.util.Scanner;
class HotelBooking{
    String guestName;
    String roomType;
    float nights;
    HotelBooking(){
        guestName = "Unknown";
        roomType = "Unknown";
        nights = 0.0f;
    }
    HotelBooking(String guestName, String roomType, float nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking h){
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }
    public void display(){
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}
public class Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter guest name: ");
        String guestName = input.nextLine();
        System.out.print("Enter room type: ");
        String roomType = input.nextLine();
        System.out.print("Enter nights: ");
        float nights = input.nextFloat();
        HotelBooking h1 = new HotelBooking();
        System.out.print("\nDefault constructor: \n");
        h1.display();
        System.out.print("\nparameterized constructor: \n");
        HotelBooking h2 = new HotelBooking(guestName, roomType, nights);
        h2.display();
        System.out.print("\ncopy constructor: \n");
        HotelBooking h3 = new HotelBooking(h2);
        h3.display();
    }
}

