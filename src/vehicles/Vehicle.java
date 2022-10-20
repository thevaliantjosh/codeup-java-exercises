package vehicles;

public class Vehicle {
    private String vehicle;

    public String getVehicle(){
        return vehicle;
    }

    public void setVehicle(String vehicle){
        this.vehicle = vehicle;
    }

    public String makeNoise(){
        return "vroom vroom";
    }

}
