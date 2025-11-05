import java.util.function.Predicate;

public class TemperatureAlertSystem {

    public static void main(String[] args) {
        double threshold = 38.5; // Celsius
        
        // Predicate to check if temperature is above the threshold
        Predicate<Double> isAlertNeeded = (temperature) -> temperature > threshold;

        double currentTemp1 = 39.1;
        double currentTemp2 = 37.0;

        System.out.println("--- Temperature Alert System ---");
        
        // Test 1
        if (isAlertNeeded.test(currentTemp1)) {
            System.out.println("Alert! Temperature " + currentTemp1 + "°C is above threshold (" + threshold + "°C).");
        } else {
            System.out.println("Temperature " + currentTemp1 + "°C is normal.");
        }

        // Test 2
        if (isAlertNeeded.test(currentTemp2)) {
            System.out.println("Alert! Temperature " + currentTemp2 + "°C is above threshold (" + threshold + "°C).");
        } else {
            System.out.println("Temperature " + currentTemp2 + "°C is normal.");
        }
    }
}