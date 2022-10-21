package vehicles;

public class Vehicle {
    private String vehicle;

    public String getVehicle(){
        return vehicle;
    }

    public void setVehicle(String vehicle){
        this.vehicle = vehicle;
    }

    //Constructor

    public Vehicle(){

    }

    public Vehicle(String vehicle){
        this.vehicle = vehicle;
    }

    public void alarmSound(){
        System.out.println("Wooooo Wooooo Wooooo");
    }

    public String makeNoise(){
        return "vroom vroom";
    }

}
