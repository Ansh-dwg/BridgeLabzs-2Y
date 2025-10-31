import java.util.ArrayList;
import java.util.List;

public class Course {
    public final String courseCode;
    public String name;
    private List<Student> enrolledStudents;

    public Course(String courseCode, String name) {
        this.courseCode = courseCode;
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.enrolledStudents.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("Students in " + this.name + " (" + this.courseCode + "):");
        for (Student s : enrolledStudents) {
            System.out.println(" - " + s.name + " ID: " + s.studentId);
        }
    }
}

class Student {
    public final String studentId;
    public String name;
    private List<Course> enrolledCourses;
    public static String status = "Active";

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        this.enrolledCourses.add(course);
        course.addStudent(this);
    }

    public void viewEnrolledCourses() {
        System.out.println(this.name + " (Status: " + status + ") is enrolled in:");
        for (Course c : enrolledCourses) {
            System.out.println(" - " + c.name);
        }
    }
}

class School {
    public String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void admitStudent(Student student) {
        this.students.add(student);
    }

    public void showAllStudents() {
        System.out.println("\nAll Students admitted to " + this.schoolName + ":");
        for (Student s : students) {
            System.out.println(" - " + s.name);
        }
    }
}

class SchoolSystem {
    
    public static void main(String[] args) {
        Student s1 = new Student("S101", "Alice");
        Student s2 = new Student("S102", "Bob");

        Course c1 = new Course("CS101", "Intro to Programming");
        Course c2 = new Course("MA205", "Calculus II");
        
        School school = new School("Tech High");
        school.admitStudent(s1);
        school.admitStudent(s2);

        s1.enrollInCourse(c1);
        s1.enrollInCourse(c2);
        s2.enrollInCourse(c1);

        System.out.println("--- Student Enrollment Check ---");
        Object checkObject = s1;
        if (checkObject instanceof Student) {
            ((Student) checkObject).viewEnrolledCourses();
        }

        System.out.println("\n--- Course Enrollment Check ---");
        c1.showEnrolledStudents();

        school.showAllStudents();
    }
}
