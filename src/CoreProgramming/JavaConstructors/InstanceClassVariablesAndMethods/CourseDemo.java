package CoreProgramming.JavaConstructors.InstanceClassVariablesAndMethods;
import java.util.Scanner;
class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Institute";
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " months");
        System.out.println("Fee            : " + fee);
        System.out.println("Institute Name : " + instituteName);
    }
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

public class CourseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter course name: ");
        String courseName = input.nextLine();

        System.out.print("Enter course duration (months): ");
        int duration = input.nextInt();

        System.out.print("Enter course fee: ");
        double fee = input.nextDouble();

        Course c1 = new Course(courseName, duration, fee);

        System.out.println("\nCourse Details:");
        c1.displayCourseDetails();

        Course.updateInstituteName("XYZ Technology Institute");

        System.out.println("\nAfter Updating Institute Name:");
        c1.displayCourseDetails();
    }
}
