package assessment01;

public class GeneralPractitioner extends HealthProfessional {
    private String specialty;

    public GeneralPractitioner(int id, String name, String department, String specialty) {
        super(id, name, department);
        this.specialty = specialty;
    }

    @Override
    public void printDetails() {
        System.out.println("Type: General Practitioner");
        super.printDetails();
        System.out.println("Specialty: " + specialty);
    }
}
