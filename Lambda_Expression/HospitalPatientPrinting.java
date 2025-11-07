import java.util.*;

class Patient {
    String id;
    String name;
    
    Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Patient ID: " + id + ", Name: " + name;
    }
}

public class HospitalPatientPrinting {
    
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("P001", "John Doe"));
        patients.add(new Patient("P002", "Jane Smith"));
        patients.add(new Patient("P003", "Bob Johnson"));
        patients.add(new Patient("P004", "Alice Williams"));
        patients.add(new Patient("P005", "Charlie Brown"));
        
        System.out.println("All Patients:");
        patients.forEach(System.out::println);
        
        System.out.println("\nPatient IDs:");
        patients.stream().map(Patient::getId).forEach(System.out::println);
    }
}