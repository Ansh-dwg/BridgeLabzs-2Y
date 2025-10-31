import java.util.ArrayList;
import java.util.List;

public class Patient {
    public final String patientId;
    public String name;
    private List<Doctor> consultedDoctors;
    private static int totalPatients = 0;

    public Patient(String patientId, String name) {
        this.patientId = patientId;
        this.name = name;
        this.consultedDoctors = new ArrayList<>();
        totalPatients++;
    }

    public void addConsultation(Doctor doctor) {
        this.consultedDoctors.add(doctor);
    }
}

class Doctor {
    public final String doctorId;
    public String name;
    private List<Patient> patientsConsulted;
    public static String specialization = "General Practice";

    public Doctor(String doctorId, String name) {
        this.doctorId = doctorId;
        this.name = name;
        this.patientsConsulted = new ArrayList<>();
    }

    public void consult(Object patientObj) {
        if (patientObj instanceof Patient) {
            Patient patient = (Patient) patientObj;
            this.patientsConsulted.add(patient);
            patient.addConsultation(this);
            System.out.println(this.name + " (" + specialization + ") is consulting with patient " + patient.name + " (ID: " + patient.patientId + ").");
        } else {
            System.out.println("Error: Object is not a Patient instance.");
        }
    }
}

class Hospital {
    public final String hospitalId;
    public String name;

    public Hospital(String hospitalId, String name) {
        this.hospitalId = hospitalId;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Welcome to " + this.name + " (ID: " + this.hospitalId + ").");
    }
}

class HospitalSystem {
    
    public static void main(String[] args) {
        Hospital h = new Hospital("H1", "City General");
        h.displayInfo();
        
        Doctor d1 = new Doctor("D001", "Dr. Emily Carter");
        Doctor d2 = new Doctor("D002", "Dr. John Reed");
        Doctor.specialization = "Cardiology";

        Patient p1 = new Patient("P101", "Sara Bell");
        Patient p2 = new Patient("P102", "Mark Davis");
        
        System.out.println("\n--- Consultations ---");
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}
