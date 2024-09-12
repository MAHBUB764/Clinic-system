// Appointment.java
public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String appointmentDate;

    // Constructor
    public Appointment(Doctor doctor, Patient patient, String appointmentDate) {
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentDate = appointmentDate;
    }

    // Getters and Setters
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getAppointmentDate() {2
        
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    // Display appointment details
    public void displayAppointmentDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Doctor: " + doctor.getName() + " (" + doctor.getSpecialty() + ")");
        System.out.println("Patient: " + patient.getName() + ", Age: " + patient.getAge() + ", Ailment: " + patient.getAilment());
        System.out.println("Date: " + appointmentDate);
    }
}
