package assessment01;

//the General Practitioner class represents a doctor who specializes in general medicine
// extends the health professional class and includes a specific speciality field.
public class GeneralPractitioner extends HealthProfessional {

    //the specific area of focus for this general practitioner
    private String specialty;

    // constructor to initialize a general practitioner object with its attributes
    public GeneralPractitioner(int id, String name, String department, String specialty) {
        super(id, name, department); // inherit common attributes for health professional
        this.specialty = specialty;
    }
    //prints the general practitioner full details including inherited and unique filed
    @Override
    public void printDetails() {
        System.out.println("Type: General Practitioner");
        super.printDetails(); //print id, name and department
        System.out.println("Specialty: " + specialty);
    }
}
