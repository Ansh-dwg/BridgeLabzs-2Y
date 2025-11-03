class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double newCGPA) {
        this.CGPA = newCGPA;
    }

    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPostgradInfo() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Public Roll: " + rollNumber);
        System.out.println("Protected Name: " + name);
        System.out.println("Specialization: " + specialization);
    }
}

@SuppressWarnings("unused")
class StudentSystem {
    public static void main(String[] args) {
        Student s = new Student(101, "Alice", 3.85);
        System.out.println("Student Object:");
        s.displayStudentInfo();

        System.out.println("\nAccessing public member directly: " + s.rollNumber);

        s.setCGPA(3.92);
        System.out.println("Accessing private member via public getter: " + s.getCGPA());

        PostgraduateStudent ps = new PostgraduateStudent(501, "Bob", 3.70, "AI");
        System.out.println("\nPostgraduate Student Object:");
        ps.displayPostgradInfo();

        System.out.println("Subclass can access protected member directly (Name): " + ps.name);
    }
}
