package vehicles;

public class TestDrive {
    public static void main(String[] args) {
        /*Create a Vehicle class with two properties: a name instance variable and a makeNoise() method.
         The instance variable should be private and have getters and setters (in IntelliJ try cmd-N).
         The makeNoise method should just sout out a typical vehicle noise.
         Then create a more specific vehicle subclass, such as Motorcycle, Car, Truck, Tractor, whatever.
         Make the specific vehicle class extend the Vehicle class. Otherwise, keep it empty.
         Create a test class, perhaps calling it VehicleTest.
         Instantiate the specific vehicle, assign a value to the name property and run the methods
         on the specific vehicle. Notice the inherited method works and the inherited name property
         is assignable on the subclass.*/
        /*Create a method in the subclass of the Vehicle class that overrides the superclass
        makeNoise method. */
        Vehicle car = new Vehicle();
        car.setVehicle("Ford Focus");
        System.out.printf("The %s says: %s%n", car.getVehicle(), car.makeNoise());

        Tractor tractor = new Tractor();
        tractor.setVehicle("John Deere");
        System.out.printf("The %s says: %s%n", tractor.getVehicle(), tractor.makeNoise());


        Motorcycle ducati = new Motorcycle();
        ducati.setVehicle("Ducati");
        System.out.printf("The %s says %s%n", ducati.getVehicle(), ducati.makeNoise());

        ducati.breakDown();







    }//End Main
}//End Class
