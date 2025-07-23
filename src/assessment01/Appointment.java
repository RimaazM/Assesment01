package assessment01;

public class Appointment {
    private String name;
    private String mobile;
    private String timeslot;
    private HealthProfessional doctor;

    public Appointment(String name, String mobile, String timeslot, HealthProfessional doctor) {
        this.name = name;
        this.mobile = mobile;
        this.timeslot = timeslot;
        this.doctor = doctor;
    }

    public String getMobile() {
        return mobile;
    }

    public void printAppointment() {
        System.out.println("Appointment for: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("Time: " + timeslot);
        System.out.println("Doctor: " + doctor.getName() + " (" + doctor.getDepartment() + ")");
    }
}
