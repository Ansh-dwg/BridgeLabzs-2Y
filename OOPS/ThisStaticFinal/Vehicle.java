public class Vehicle {

    public String ownerName;
    public String vehicleType;
    public final String registrationNumber;

    public static double registrationFee = 150.00;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void displayRegistrationDetails() {
        System.out.println("Owner: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Reg. Number: " + this.registrationNumber);
        System.out.println("Fee: $" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

class VehicleSystem {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice Green", "Sedan", "XYZ-123");
        Object v2 = new Vehicle("Bob White", "Truck", "ABC-789");
        Object notAVehicle = "Hello";

        System.out.println("--- Vehicle 1 ---");
        if (v1 instanceof Vehicle) {
            v1.displayRegistrationDetails();
        }

        System.out.println("\n--- Vehicle 2 ---");
        if (v2 instanceof Vehicle) {
            ((Vehicle) v2).displayRegistrationDetails();
        }
        
        System.out.println("\n--- Object Check ---");
        if (!(notAVehicle instanceof Vehicle)) {
            System.out.println("Object 'notAVehicle' is not a Vehicle.");
        }

        Vehicle.updateRegistrationFee(175.50);
        
        System.out.println("\n--- Vehicle 1 After Fee Update ---");
        v1.displayRegistrationDetails();
    }
}
