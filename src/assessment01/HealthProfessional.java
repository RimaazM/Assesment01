package assessment01;

public class HealthProfessional {
    private int id;
    private String name;
    private String department;

    public HealthProfessional(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}
