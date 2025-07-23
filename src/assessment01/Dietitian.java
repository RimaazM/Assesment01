package assessment01;

public class Dietitian extends HealthProfessional {
    private String certification;

    public Dietitian(int id, String name, String department, String certification) {
        super(id, name, department);
        this.certification = certification;
    }

    @Override
    public void printDetails() {
        System.out.println("Type: Dietitian");
        super.printDetails();
        System.out.println("Certification: " + certification);
    }
}
