package practice;

public class Practice {
    public static void main(String[] args) {
//        1. Create a class called Practice with a main method.
//        2. Create a public static method in the Practice class called *subtractTen* that takes one integer argument and returns that number minus 10.
//        3. Create a public static method *average* in the Practice class that takes an array of integers and returns their average as a double.
//        4. Create a class called Pet with two String instance variables, name and type.
//        5. Create getters and setters for the properties as well as a constructor that takes two strings and sets the name and type.
//        6. Create a PetDog class that inherits from Pet.
//        7. In PetDog, create a boolean instance variable, trained.
//        8. Write a constructor for PetDog that sets its name, type, and trained properties.
//        9. Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property.
//        10. Create an interface named Companion. The Companion interface should specify an instance method named snuggle that has no arguments and returns a String. Change your PetDog class so it implements the Companion interface. The implementation of the snuggle method on the PetDog class should return "name wants to snuggle", where name is the inherited instance property.
//        11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.

        double[] numbersArray = {5.5, 19.24, 35.34, 12.35, 67.50};

        System.out.println(average(numbersArray));


    }//End of Main

    public static int subtractTen(int number){
        return number - 10;
    }

    public static double average(double[] numbersArray){
        double sum = 0;
        double average;

        for (int i = 0; i < numbersArray.length; i++){
            sum = sum + numbersArray[i];
        }
        average = sum/numbersArray.length;
        return average;
    }

}//End of Class
