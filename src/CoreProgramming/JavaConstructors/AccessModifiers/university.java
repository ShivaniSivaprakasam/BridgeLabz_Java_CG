package CoreProgramming.JavaConstructors.AccessModifiers;
class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayStudent() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("CGPA        : " + CGPA);
    }
}

class PostgraduateStudent extends Student {

    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayPGStudent() {
        System.out.println("Postgraduate Student Name: " + name);
    }
}

public class university{
    public static void main(String[] args) {

        Student s1 = new Student(101, "Shivani", 8.7);
        s1.displayStudent();

        s1.setCGPA(9.1);
        System.out.println("\nUpdated CGPA: " + s1.getCGPA());

        System.out.println("\nPostgraduate Student:");
        PostgraduateStudent pg = new PostgraduateStudent(201, "Ananya", 8.9);
        pg.displayPGStudent();
    }
}
