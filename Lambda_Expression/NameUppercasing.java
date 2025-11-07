import java.util.*;

class Employee {
    String name;
    String department;
    
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Employee: " + name + ", Department: " + department;
    }
}

public class NameUppercasing {
    
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("john doe", "IT"));
        employees.add(new Employee("jane smith", "HR"));
        employees.add(new Employee("bob johnson", "Finance"));
        employees.add(new Employee("alice williams", "Marketing"));
        employees.add(new Employee("charlie brown", "Operations"));
        
        System.out.println("Original Names:");
        employees.stream().map(Employee::getName).forEach(System.out::println);
        
        System.out.println("\nUppercase Names for HR Letter:");
        employees.stream().map(Employee::getName).map(String::toUpperCase).forEach(System.out::println);
    }
}