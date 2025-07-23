package assessment01;
// the appointment class represent a patients appointment with a health professional
public class Appointment implements bookable {
    private String name; //patient name
    private String mobile; // patient mobile number
    private String timeslot; // time slots which they have booked the appointment
    private HealthProfessional doctor; // the doctor or dietitian assigned to the appointment


    //constructor to create an appointment with the given details
    public Appointment(String name, String mobile, String timeslot, HealthProfessional doctor) {
        this.name = name;
        this.mobile = mobile;
        this.timeslot = timeslot;
        this.doctor = doctor;
    }


    public String getMobile() {
        return mobile;
    }
    //print all details of the appointment in a readable format
    public void printAppointment() {
        System.out.println("Appointment for: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("Time: " + timeslot);
        System.out.println("Doctor: " + doctor.getName() + " (" + doctor.getDepartment() + ")");
    }
    @Override
    public void book() {
        System.out.println("Booking confirmed for: " + name);
    }
}
