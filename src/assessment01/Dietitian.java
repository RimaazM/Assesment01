package assessment01;

// the dietitian class represent a health professional specialized in nutrition.
// it extends the health professional base class.

public class Dietitian extends HealthProfessional {
    //certification level oof dietitian
    private String certification;

    //constructor to initialize a dietitian object with specific attributes
    public Dietitian(int id, String name, String department, String certification) {
        super(id, name, department); //calls constructors from the parent class
        this.certification = certification;
    }
// print the details of dietitian including inherited attributes and certification
    @Override
    public void printDetails() {
        System.out.println("Type: Dietitian");
        super.printDetails();
        System.out.println("Certification: " + certification);
    }
}
