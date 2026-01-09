package CoreProgramming.JavaConstructors.Level1;
import java.util.Scanner;
class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        Person original = new Person(name, age);
        Person copy = new Person(original);
        System.out.println("\nOriginal Person Details:");
        original.display();
        System.out.println("\nCopied Person Details:");
        copy.display();
    }
}
