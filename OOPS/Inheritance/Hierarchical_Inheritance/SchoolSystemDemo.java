class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + ", age " + age + ", is a Teacher specializing in: " + subject);
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + ", age " + age + ", is a Student in Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println(name + ", age " + age + ", is a Staff member in the: " + department + " Department");
    }
}

public class SchoolSystemDemo {
    public static void main(String[] args) {
        Teacher mrSmith = new Teacher("Mr. Smith", 45, "Mathematics");
        Student lisa = new Student("Lisa Chen", 16, 11);
        Staff maria = new Staff("Maria Rodriguez", 38, "Admissions");

        mrSmith.displayRole();
        lisa.displayRole();
        maria.displayRole();
    }
}
