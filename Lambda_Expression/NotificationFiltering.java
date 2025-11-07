import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;
    String priority;
    
    Alert(String type, String message, String priority) {
        this.type = type;
        this.message = message;
        this.priority = priority;
    }
    
    @Override
    public String toString() {
        return "[" + priority + "] " + type + ": " + message;
    }
}

public class NotificationFiltering {
    
    public static void main(String[] args) {
        List<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert("Appointment", "Checkup scheduled at 10 AM", "Low"));
        alerts.add(new Alert("Medication", "Take insulin now", "High"));
        alerts.add(new Alert("Lab Result", "Blood test results ready", "Medium"));
        alerts.add(new Alert("Emergency", "Critical vital signs detected", "High"));
        alerts.add(new Alert("Appointment", "Follow-up in 2 days", "Low"));
        alerts.add(new Alert("Medication", "Refill prescription", "Medium"));
        
        System.out.println("All Alerts:");
        alerts.forEach(System.out::println);
        
        System.out.println("\nHigh Priority Alerts:");
        Predicate<Alert> highPriority = alert -> alert.priority.equals("High");
        alerts.stream().filter(highPriority).forEach(System.out::println);
        
        System.out.println("\nMedication Alerts:");
        Predicate<Alert> medicationAlerts = alert -> alert.type.equals("Medication");
        alerts.stream().filter(medicationAlerts).forEach(System.out::println);
        
        System.out.println("\nHigh or Medium Priority:");
        Predicate<Alert> urgentAlerts = alert -> alert.priority.equals("High") || alert.priority.equals("Medium");
        alerts.stream().filter(urgentAlerts).forEach(System.out::println);
    }
}