public class Employee {

    public String name; //

    public static String company = "Veridian Dynamics";

    public String displayEmployeeInfo() {
        return name + " works at " + company;
    }

    public Employee() {
        System.out.println("We have a new employee!");
    }


}
