abstract class Employee {
    private String employeeId;
    private String name;
    protected double baseSalary;

    Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setName(String name) { this.name = name; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Type: " + getClass().getSimpleName());
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Calculated Net Salary: $" + calculateSalary());
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String assignedDepartment;

    FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary; 
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.assignedDepartment = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + assignedDepartment;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails());
    }
}

class PartTimeEmployee extends Employee implements Department {
    private double hoursWorked;
    private String assignedDepartment;

    PartTimeEmployee(String employeeId, String name, double baseSalary, double hoursWorked) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) { this.hoursWorked = hoursWorked; }

    @Override
    double calculateSalary() {
        double hourlyRate = baseSalary / 160.0;
        return hourlyRate * hoursWorked; 
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.assignedDepartment = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + assignedDepartment;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println(getDepartmentDetails());
    }
}

interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

public class ManagementSystem {
    public static void main(String[] args) {
        Employee ft = new FullTimeEmployee("F100", "Alice Johnson", 75000.00);
        Employee pt = new PartTimeEmployee("P200", "Bob Davis", 50000.00, 80.5);

        ((FullTimeEmployee)ft).assignDepartment("Finance");
        ((PartTimeEmployee)pt).assignDepartment("Marketing");
        
        System.out.println("--- Employee Salary Report (Polymorphism) ---");
        
        Employee[] employeeList = {ft, pt};

        for (Employee emp : employeeList) {
            emp.displayDetails(); 
            System.out.println("-------------------------------------------");
        }
    }
}
