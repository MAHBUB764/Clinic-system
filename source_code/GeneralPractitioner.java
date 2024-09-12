// GeneralPractitioner.java
public class GeneralPractitioner extends Doctor {
    public GeneralPractitioner(String name) {
        super(name, "General Practitioner");
    }

    
    @Override
    public void displayAvailability() {
        System.out.println("Dr. " + getName() + " is available for walk-in patients from 9 AM to 5 PM.");
    }
}
