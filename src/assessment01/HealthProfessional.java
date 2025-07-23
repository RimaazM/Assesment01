package assessment01;

public class HealthProfessional {
    private int id;//unique id to identify the health professional
    private String name;// full name of thee health professional
    private String department; // department the professional belong to

    public HealthProfessional(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    //print the details of the health professional
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
    //getter fo the name
    //used when printing appointment details
    public String getName() {
        return name;
    }
    //getter for the department
    //used when printing appointment details
    public String getDepartment() {
        return department;
    }
}
