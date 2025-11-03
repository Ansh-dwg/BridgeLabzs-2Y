class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
        System.out.println("Temperature Setting: " + temperatureSetting + "°F");
    }
}

class SmartHomeDemo {
    public static void main(String[] args) {
        Thermostat livingRoomThermostat = new Thermostat(
            "T-101",
            "Active",
            72
        );
        livingRoomThermostat.displayStatus();
    }
}
