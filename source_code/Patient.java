public class Patient {
    private String name;
    private int age;
    private String problemTitle;
    private Doctor doctor;

    // Constructor
    public Patient(String name, int age, String problemTitle, Doctor doctor) {
        this.name = name;
        this.age = age;
        this.problemTitle = problemTitle;
        this.doctor = doctor;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProblemTitle() {
        return problemTitle;
    }

    public void setProblemTitle(String problemTitle) {
        this.problemTitle = problemTitle;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}