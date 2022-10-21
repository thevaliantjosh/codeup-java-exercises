package vehicles;

public class Motorcycle extends Vehicle{


    //Constructor

    public Motorcycle(){

    }

    public Motorcycle(String name){
        this.setVehicle(name);
    }

    //Methods
    public String makeNoise(){
        return "Rooooooaaaarrrr";
    }

    public void breakDown(){
        System.out.println(super.makeNoise());
        System.out.println("krrrrccccckkkluuunnkkk");
    }

}
