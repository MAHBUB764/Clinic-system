// DoctorsDetails.java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DoctorsDetails {
    private Map<String, ArrayList<Doctor>> departmentDoctors;

    // Constructor
    public DoctorsDetails() {
        departmentDoctors = new HashMap<>();
        
        
        initializeDoctors();
    }

    
    private void initializeDoctors() {
        
        departmentDoctors.put("Medicine", new ArrayList<>());
        departmentDoctors.put("Surgery", new ArrayList<>());
        departmentDoctors.put("Pediatrics", new ArrayList<>());
        departmentDoctors.put("Obstetrics and Gynecology", new ArrayList<>());

        // Add doctors to each department
        departmentDoctors.get("Surgery").add(new Specialist("Dr. David Martinez", "Surgery")); // Specialist
        departmentDoctors.get("Surgery").add(new GeneralPractitioner("Dr. Ava Roberts"));       // General Practitioner
        departmentDoctors.get("Surgery").add(new GeneralPractitioner("Dr. John Lee"));          // General Practitioner

        departmentDoctors.get("Medicine").add(new Specialist("Dr. Sarah Johnson", "Medicine")); // Specialist
        departmentDoctors.get("Medicine").add(new GeneralPractitioner("Dr. Michael Smith"));     // General Practitioner
        departmentDoctors.get("Medicine").add(new GeneralPractitioner("Dr. Emily Chen"));        // General Practition
        
        
        
    }

    
    public void displayDoctorsByDepartment(String department) {
        ArrayList<Doctor> doctors = departmentDoctors.get(department);
        if (doctors == null || doctors.isEmpty()) {
            System.out.println("No doctors available in this department.");
        } else {
            System.out.println("\nDoctors in " + department + ":");
            for (int i = 0; i < doctors.size(); i++) {
                Doctor doctor = doctors.get(i);
                System.out.println((i + 1) + ". " + doctor.getName() + " - " + doctor.getSpecialty());
            }
        }
    }

    
    public ArrayList<Doctor> getDoctorsByDepartment(String department) {
        return departmentDoctors.getOrDefault(department, new ArrayList<>());
    }

    public Doctor[] getDoctors() {
        ArrayList<Doctor> allDoctors = new ArrayList<>();
        for (ArrayList<Doctor> doctors : departmentDoctors.values()) {
            allDoctors.addAll(doctors);
        }
        return allDoctors.toArray(new Doctor[0]);
    }
}
