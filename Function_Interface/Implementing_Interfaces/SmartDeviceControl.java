interface Controllable {
    void turnOn();
    void turnOff();
}

class Light implements Controllable {
    @Override
    public void turnOn() {
        System.out.println("Light: Switched ON. Brightness set to 100%.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light: Switched OFF.");
    }
}

// Implementation 2: AC
class AirConditioner implements Controllable {
    @Override
    public void turnOn() {
        System.out.println("AC: Powered ON. Cooling started at 24°C.");
    }

    @Override
    public void turnOff() {
        System.out.println("AC: Powered OFF.");
    }
}

// Main Test Class
public class SmartDeviceControl {
    public static void main(String[] args) {
        System.out.println("--- Smart Device Control ---");
        Controllable light = new Light();
        Controllable ac = new AirConditioner();

        light.turnOn();
        ac.turnOn();
        light.turnOff();
        ac.turnOff();
    }
}