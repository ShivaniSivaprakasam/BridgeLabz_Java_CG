package CoreProgramming.JavaConstructors.AccessModifiers;

class EmployeeInfo {
    public String employeeID;
    protected String department;
    private double salary;

    public EmployeeInfo(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative!");
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
    }
}

class Manager extends EmployeeInfo {
    private String teamName;

    public Manager(String employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManagerDetails() {

        System.out.println("Manager Employee ID : " + employeeID);
        System.out.println("Manager Department  : " + department);
        System.out.println("Team Name           : " + teamName);
        System.out.println("Salary              : " + getSalary());
    }
}

public class employee {
    public static void main(String[] args) {
        EmployeeInfo emp = new EmployeeInfo("EMP001", "IT", 50000);
        System.out.println("Employee Details");
        emp.displayEmployeeDetails();

        System.out.println("\nManager Details");
        Manager mgr = new Manager("EMP002", "HR", 80000, "Recruitment Team");
        mgr.displayManagerDetails();
        mgr.setSalary(90000);
        System.out.println("\nUpdated Manager Salary: " + mgr.getSalary());
    }
}
