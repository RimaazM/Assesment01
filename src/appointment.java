public class appointment {
    private string patientName;
    private string mobile;
    private string timeslot;
    private healthprofessional doctor;

    public appointment() {}

    public appointment (string patientName, string mobile, string timeSlot,healthprofessional doctor) {
        this.patientName = patientName;
        this.mobile = mobile;
        this.timeslot = timeSlot;
        this.doctor = doctor;


    }

