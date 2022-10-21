package vehicles;

import java.util.Arrays;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Vehicle[] garageVehicles = new Vehicle[4];
        Car dailyCommuter = new Car("Honda Civic");
        Car truck = new Car("Ram Rebel");
        Car muscleCar = new Car("Challenger");
        Car luxuryVehicle = new Car("Lexus is500");

        //setting cars into the Vehicles array
        garageVehicles[0] = dailyCommuter;
        garageVehicles[1] = truck;
        garageVehicles[2] = muscleCar;
        garageVehicles[3] = luxuryVehicle;
        garage.setVehicles(garageVehicles);//putting the array of vehicles in the garage object


        for (Vehicle vehicle : garageVehicles){
            System.out.println(vehicle);
        }

        //Creating a new Motorcycle: Polymorphism
        garage.getVehicles()[0] = new Motorcycle("Honda");
        System.out.println(garage.getVehicles()[0]);




        //setting off the alarms

        garage.alarmCascade();



    }
}
