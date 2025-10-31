import java.util.ArrayList;
import java.util.List;

public class Department {
    public final String deptId;
    public String name;
    
    public Department(String deptId, String name) {
        this.deptId = deptId;
        this.name = name;
        System.out.println("Department created: " + this.name);
    }
}

class Faculty {
    public final String facultyId;
    public String name;
    public static String status = "Active";

    public Faculty(String facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
        System.out.println("Faculty created: " + this.name);
    }
}

class University {
    public String uniName;
    private List<Department> departments;
    private List<Faculty> facultyMembers;

    public University(String uniName) {
        this.uniName = uniName;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }
    
    public void createDepartment(String deptId, String name) {
        Department newDept = new Department(deptId, name);
        this.departments.add(newDept);
    }
    
    public void hireFaculty(Faculty faculty) {
        this.facultyMembers.add(faculty);
    }

    public void displayStructure() {
        System.out.println("\n--- " + this.uniName + " Structure ---");
        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println(" - " + d.name + " (" + d.deptId + ")");
        }
        System.out.println("Faculty Members:");
        for (Faculty f : facultyMembers) {
            System.out.println(" - " + f.name + " (ID: " + f.facultyId + ")");
        }
    }
    
    public void destroy() {
        System.out.println("\n*** University " + this.uniName + " is being destroyed. ***");
        this.departments.clear();
        this.facultyMembers.clear();
        System.out.println("All Departments are deleted (Composition).");
        System.out.println("Faculty members remain in memory (Aggregation).");
    }
}

class UniversitySystem {
    
    public static void main(String[] args) {
        
        Faculty f1 = new Faculty("F001", "Dr. Sharma");
        Faculty f2 = new Faculty("F002", "Prof. Lin");

        University uni = new University("Central Tech");
        uni.createDepartment("D01", "Computer Science");
        uni.createDepartment("D02", "Physics");
        uni.hireFaculty(f1);
        uni.hireFaculty(f2);
        
        uni.displayStructure();
        
        uni.destroy();
        
        System.out.println("\nChecking Faculty Existence:");
        Object checkObject = f1;
        if (checkObject instanceof Faculty) {
            System.out.println("Faculty f1 (" + ((Faculty) checkObject).name + ") still exists independently.");
        }
    }
}
