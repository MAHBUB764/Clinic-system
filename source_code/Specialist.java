// Specialist.java
public class Specialist extends Doctor {
    
    public Specialist(String name, String specialty) {
        super(name, specialty);
    }

    @Override
    public void displayAvailability() {
        System.out.println(getName() + " is available by appointment confirmation only.");
    }
}
