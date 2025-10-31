public class Course {
    String courseName;
    String duration;
    double fee;
    static String instituteName = "Default Institute";

    public Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println(courseName + " - " + duration + " - $" + fee + " - " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Fundamentals", "6 weeks", 500.00);
        c1.displayCourseDetails();

        Course c2 = new Course("Database Design", "4 weeks", 350.00);
        c2.displayCourseDetails();

        Course.updateInstituteName("Global Learning Hub");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
