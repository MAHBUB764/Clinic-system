// Doctor.java
public abstract class Doctor {
    private String name;
    private String specialty;
    private String availability;

    
    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
       
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    // Abstract method to display availability, to be implemented by subclasses
    public abstract void displayAvailability();
}
