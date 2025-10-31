public class Employee {

    public String name;
    public final int id;
    public String designation;

    public static String companyName = "Tech Solutions Inc.";
    private static int totalEmployees = 0;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Designation: " + this.designation);
        System.out.println("Company: " + companyName);
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

class EmployeeSystem {
    
    public static void main(String[] args) {
        Employee.companyName = "FutureTech";

        Employee emp1 = new Employee("Jane Doe", 101, "Developer");
        Object emp2 = new Employee("John Smith", 102, "Manager");
        Object notAnEmployee = new java.util.Date();

        System.out.println("--- Employee 1 ---");
        if (emp1 instanceof Employee) {
            emp1.displayDetails();
        }

        System.out.println("\n--- Employee 2 ---");
        if (emp2 instanceof Employee) {
            ((Employee) emp2).displayDetails();
        }
        
        System.out.println("\n--- Object Check ---");
        if (!(notAnEmployee instanceof Employee)) {
            System.out.println("Object is not an instance of Employee.");
        }

        System.out.println("\n--- Totals ---");
        Employee.displayTotalEmployees();
    }
}
