abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    abstract double calculateRentalCost(int days);

    void displayDetails(int rentalDays) {
        System.out.println("Vehicle: " + type + " (" + vehicleNumber + ")");
        System.out.println("Total Rental Cost (" + rentalDays + " days): $" + calculateRentalCost(rentalDays));
    }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getInsurancePolicyNumber() { return insurancePolicyNumber; }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 15.00;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicyNumber + ", Daily Cost: $" + calculateInsurance();
    }

    @Override
    void displayDetails(int rentalDays) {
        super.displayDetails(rentalDays);
        System.out.println(getInsuranceDetails());
    }
}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getInsurancePolicyNumber() { return insurancePolicyNumber; }

    @Override
    double calculateRentalCost(int days) {
        return (rentalRate * days) * 0.90; 
    }

    @Override
    public double calculateInsurance() {
        return 5.00;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicyNumber + ", Daily Cost: $" + calculateInsurance();
    }
    
    @Override
    void displayDetails(int rentalDays) {
        super.displayDetails(rentalDays);
        System.out.println(getInsuranceDetails());
    }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getInsurancePolicyNumber() { return insurancePolicyNumber; }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days + 50.00; 
    }

    @Override
    public double calculateInsurance() {
        return 25.00;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicyNumber + ", Daily Cost: $" + calculateInsurance();
    }

    @Override
    void displayDetails(int rentalDays) {
        super.displayDetails(rentalDays);
        System.out.println(getInsuranceDetails());
    }
}

public class RentalSystem {
    public static void main(String[] args) {
        int rentalDuration = 7; 

        Vehicle[] fleet = {
            new Car("C001", 45.00, "PCY198"),
            new Bike("B005", 20.00, "PBY221"),
            new Truck("T010", 80.00, "PTZ309")
        };

        System.out.println("--- Rental & Insurance Report (" + rentalDuration + " Days) ---");
        
        for (Vehicle v : fleet) {
            v.displayDetails(rentalDuration);
            System.out.println("------------------------------------");
        }
    }
}
