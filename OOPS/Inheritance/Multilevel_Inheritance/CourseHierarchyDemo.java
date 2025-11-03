class Course {
    String courseName;
    String duration;

    Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, String duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, String duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayDetails() {
        System.out.println("Course: " + courseName + " (" + duration + ")");
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
        System.out.println("Original Fee: $" + fee);
        System.out.println("Discount: " + (discount * 100) + "%");
        double finalPrice = fee * (1.0 - discount);
        System.out.println("Final Price: $" + finalPrice);
    }
}

public class CourseHierarchyDemo {
    public static void main(String[] args) {
        PaidOnlineCourse javaCourse = new PaidOnlineCourse(
            "Advanced Java Programming",
            "4 weeks",
            "SkillVault",
            true,
            199.99,
            0.25
        );
        javaCourse.displayDetails();
    }
}
