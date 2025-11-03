abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    
    public void setRatePerKm(double ratePerKm) { this.ratePerKm = ratePerKm; }

    abstract double calculateFare(double distance);

    void getVehicleDetails() {
        System.out.println("Type: " + getClass().getSimpleName() + " (" + vehicleId + ")");
        System.out.println("Driver: " + driverName + ", Rate/Km: $" + ratePerKm);
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {
    private String currentLocation = "Depot A";
    private String policyId = "CARP99";

    Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    double calculateFare(double distance) {
        return (ratePerKm * distance) + 2.50; 
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }

    void displaySecureDetails() {
        System.out.println("Policy ID: " + policyId); 
    }
}

class Bike extends Vehicle implements GPS {
    private String currentLocation = "Depot B";
    private String policyId = "BIKEP88";

    Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    double calculateFare(double distance) {
        return (ratePerKm * distance) + 1.00; 
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }

    void displaySecureDetails() {
        System.out.println("Policy ID: " + policyId);
    }
}

class Auto extends Vehicle implements GPS {
    private String currentLocation = "Depot C";
    private String policyId = "AUTOP77";

    Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    double calculateFare(double distance) {
        return (ratePerKm * distance) + 1.50; 
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }

    void displaySecureDetails() {
        System.out.println("Policy ID: " + policyId);
    }
}

public class HailingApp {
    public static void main(String[] args) {
        double tripDistance = 12.5;

        Vehicle car = new Car("H001", "Emma Stone", 0.75);
        Vehicle bike = new Bike("H002", "Alex Rims", 0.50);
        Vehicle auto = new Auto("H003", "Kiran Shah", 0.60);
        
        System.out.println("--- Ride-Hailing Fare Calculation ---");

        Vehicle[] fleet = {car, bike, auto};
        
        for (Vehicle v : fleet) {
            v.getVehicleDetails();
            double fare = v.calculateFare(tripDistance); 
            System.out.println("Distance: " + tripDistance + "km");
            System.out.println("Calculated Fare: $" + String.format("%.2f", fare));
            
            // Demonstrating Interface and Encapsulation
            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                gps.updateLocation("Client Destination");
                System.out.println("Current GPS: " + gps.getCurrentLocation());
            }

            // Secure detail access (only possible if casted)
            if (v instanceof Car) { ((Car)v).displaySecureDetails(); }
            
            System.out.println("------------------------------------");
        }
    }
}
