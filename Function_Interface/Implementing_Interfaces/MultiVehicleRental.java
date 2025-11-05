// Interface Definition
interface VehicleRental {
    void rent(int days);
    void returnVehicle();
}

// Implementation 1: Car
class Car implements VehicleRental {
    @Override
    public void rent(int days) {
        System.out.println("Car: Rented for " + days + " days. Total cost: $" + (days * 50));
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car: Returned successfully. Inspection complete.");
    }
}

// Implementation 2: Bike
class Bike implements VehicleRental {
    @Override
    public void rent(int days) {
        System.out.println("Bike: Rented for " + days + " days. Total cost: $" + (days * 15));
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike: Returned successfully. Check for damages.");
    }
}

// Main Test Class
public class MultiVehicleRental {
    public static void main(String[] args) {
        System.out.println("\n--- Multi-Vehicle Rental System ---");
        VehicleRental myCar = new Car();
        VehicleRental myBike = new Bike();

        myCar.rent(3);
        myBike.rent(1);
        myBike.returnVehicle();
        myCar.returnVehicle();
    }
}