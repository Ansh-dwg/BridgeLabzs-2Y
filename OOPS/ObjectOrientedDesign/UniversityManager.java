import java.util.ArrayList;
import java.util.List;

class Course {
    public final String courseId;
    public String title;
    private List<Student> studentsEnrolled;
    private Professor professorAssigned;
    public static String department = "Undeclared";

    public Course(String courseId, String title) {
        this.courseId = courseId;
        this.title = title;
        this.studentsEnrolled = new ArrayList<>();
    }
    
    public void assignProfessor(Professor professor) {
        this.professorAssigned = professor;
        System.out.println("Professor " + professor.name + " assigned to Course: " + this.title);
    }
    
    public void addStudent(Student student) {
        this.studentsEnrolled.add(student);
        System.out.println("Student " + student.name + " enrolled in " + this.title);
    }
}

class Student {
    public final String rollNumber;
    public String name;
    private List<Course> coursesEnrolled;
    private static int totalStudents = 0;

    public Student(String rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.coursesEnrolled = new ArrayList<>();
        totalStudents++;
    }

    public void enrollCourse(Object courseObj) {
        if (courseObj instanceof Course) {
            Course course = (Course) courseObj;
            this.coursesEnrolled.add(course);
            course.addStudent(this);
        } else {
            System.out.println("Invalid object for enrollment.");
        }
    }
    
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
}

class Professor {
    public final String professorId;
    public String name;
    public static String college = "Main Campus";

    public Professor(String professorId, String name) {
        this.professorId = professorId;
        this.name = name;
    }
    
    public void teachCourse(Object courseObj) {
        if (courseObj instanceof Course) {
            Course course = (Course) courseObj;
            course.assignProfessor(this);
        } else {
            System.out.println("Invalid object for assignment.");
        }
    }
}

public class UniversityManager {
    
    public static void main(String[] args) {
        Course c1 = new Course("CS101", "Introduction to Programming");
        Course c2 = new Course("MA202", "Linear Algebra");
        Course.department = "STEM";
        
        Professor p1 = new Professor("P001", "Dr. Alan Turing");
        Professor p2 = new Professor("P002", "Dr. Grace Hopper");
        Professor.college = "Engineering School";
        
        Student s1 = new Student("S1001", "Alice");
        Student s2 = new Student("S1002", "Bob");
        
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s2.enrollCourse(c2);
        
        p1.teachCourse(c1);
        p2.teachCourse(c2);
        
        Student.displayTotalStudents();
    }
}
