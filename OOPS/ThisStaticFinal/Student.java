public class Student {

    public String name;
    public final String rollNumber;
    private int grade;

    public static String universityName = "State University";
    private static int totalStudents = 0;

    public Student(String name, String rollNumber, int grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Grade: " + this.grade);
        System.out.println("University: " + universityName);
    }

    public void updateGrade(int newGrade) {
        if (newGrade >= 0 && newGrade <= 100) {
            this.grade = newGrade;
            System.out.println(this.name + "'s grade updated to " + this.grade);
        }
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
}

class StudentManagement {
    
    public static void main(String[] args) {
        Student.universityName = "Global Tech Institute";
        
        Student s1 = new Student("Alex Johnson", "U001", 85);
        Object s2 = new Student("Maria Lee", "U002", 92);
        Object nonStudent = 12345;

        System.out.println("--- Student 1 Details ---");
        if (s1 instanceof Student) {
            s1.displayDetails();
            s1.updateGrade(88);
            s1.displayDetails();
        }

        System.out.println("\n--- Student 2 Details ---");
        if (s2 instanceof Student) {
            ((Student) s2).displayDetails();
        }
        
        System.out.println("\n--- Object Check ---");
        if (!(nonStudent instanceof Student)) {
            System.out.println("Object is not a Student instance. Cannot display details.");
        }

        System.out.println("\n--- Totals ---");
        Student.displayTotalStudents();
    }
}
