package assessment01;

import java.util.ArrayList;

public class Main {

    // A shared list to hold all appointments
    static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Creating Doctors
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General Medicine", "Family Health");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Green", "General Medicine", "Women's Health");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Patel", "General Medicine", "Men's Health");

        Dietitian d1 = new Dietitian(4, "Mr. Lee", "Nutrition", "Registered");
        Dietitian d2 = new Dietitian(5, "Ms. Maya", "Nutrition", "Accredited");

        // Printing Doctor Details
        gp1.printDetails();
        System.out.println("-------------------------");
        gp2.printDetails();
        System.out.println("-------------------------");
        gp3.printDetails();
        System.out.println("-------------------------");
        d1.printDetails();
        System.out.println("-------------------------");
        d2.printDetails();
        System.out.println("-------------------------");

        // Creating Appointments
        System.out.println("Creating appointments...");
        createAppointment("Alice", "041274584", "10:00", gp1);
        createAppointment("Bob", "04512548", "11:00", d1);
        createAppointment("Charlie", "0245569845", "14:20", gp2);
        createAppointment("Diana", "0245589154", "15:45", d2);
        System.out.println("All appointments created.");
        System.out.println("-------------------------");

        // Displaying Appointments
        printExistingAppointments();
        System.out.println("-------------------------");

        // Cancel and re-check appointments
        System.out.println("Cancel appointment for mobile 041274584");
        cancelAppointment("041274584");

        System.out.println("Updated appointments:");
        printExistingAppointments();
    }

    // Create appointment and add to list
    public static void createAppointment(String name, String mobile, String timeslot, HealthProfessional doctor) {
        if (name.isEmpty() || mobile.isEmpty() || timeslot.isEmpty() || doctor == null) {
            System.out.println("Missing info - cannot create appointment");
            return;
        }

        Appointment appointment = new Appointment(name, mobile, timeslot, doctor);
        appointments.add(appointment);
    }

    // Display all appointments
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
        } else {
            for (Appointment a : appointments) {
                a.printAppointment();
            }
        }
    }

    // Cancel appointment by mobile
    public static void cancelAppointment(String mobile) {
        boolean removed = appointments.removeIf(a -> a.getMobile().equals(mobile));
        if (removed) {
            System.out.println("Appointment cancelled for mobile: " + mobile);
        } else {
            System.out.println("No appointment found for mobile: " + mobile);
        }
    }
}
