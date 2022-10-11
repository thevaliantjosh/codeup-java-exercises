import java.lang.Math;
public class syntaxLecture {
    public static void main(String[] args) {
        //Declare a variable w/o initializing it
        int weight; //Declared Variable
        String breed; //Declared Variable; Strings are double quoted
        //Initialize after declaration
        weight = 12; //Initialized
        breed = "Cavalier King Charles Spaniel"; //Initialized
        String name = "Grinch"; //You cannot forget the semicolons in Java, it will not Run!
//        int cutenessFactor = 10; //instead of let or const, we use the data type, such as String, int (for integer) or Statement commands
//        System.out.println(name + " is a " + breed + ".");
        //Conditional Logic
//        if (cutenessFactor > 8) {
//            System.out.println(name + " is cute.");
//        } else {
//            System.out.println(name + " needs to work on cuteness");
//        }

//        double randomNumber = Math.random();
        //Define the range;

        int max = 10;
        int min = 1;
        int range = max - min + 1;

        //Generate Random numbers within 1 to 10

        for (int i = 0; i < 1; i++) {
            int cutenessFactor = (int)(Math.random() * range) + min;
            if (cutenessFactor > 8) {
                System.out.println(name + " is cute.");
            } else {
                System.out.println(name + " needs to work on cuteness");
            }
            System.out.println("The Random number is: " + cutenessFactor);
        }





        boolean isGrinchCute = true;
        char oneLetter = 'a'; //Single Characters are single quoted
        byte smallNumber; // bytes go from -128 to 127
        short mediumNumber; // shorts go from -32768 to 32767
        int number; // integers go from -2 billion to 2 billion
        long bigNumber; // longs go about -9 quadrillion to 9 quadrillion
        smallNumber = 12;
        System.out.println(smallNumber);
        number = smallNumber;
        System.out.println(number);

        number = 2000000000;
        smallNumber = (byte) number;
        System.out.println(smallNumber);
        number = smallNumber;
        System.out.println(number);

        bigNumber = 1234567891012L; //Need to write a capital L for long integers

        System.out.println(bigNumber);

        float imafloat = 2.34F; // Need to write a capital F to float this number
        double imadouble = 9.01234567890123;

        System.out.println(imadouble);
        imafloat = (float) imadouble; //Cast the float data type into the double, it will convert it to a floating number with 7 digits
        System.out.println(imafloat);

        System.out.println((int) Math.pow(2, 3));

        String testingSpecialCharacters = "\tTabbed first, \"this\" is quoted: slash \\ \n this line is new!";
        System.out.println(testingSpecialCharacters);

        /*Variable needs to be declared before they are used.
        A variable declaration includes a type for the variable
        , as well as a name (a valid identifier) for the variable*/

        //Declarations:
        int id;
        boolean isLoggedIn;
        double bankAccountBalance;

        //Initialization:
        id = 123;
        isLoggedIn = false;
        bankAccountBalance = 1000.23;

        if (!isLoggedIn) {
            System.out.println("User of id: " + id + " has a balance of " + bankAccountBalance);
        }

        //Casting is coercing a value of one type into another.
        /*There is implicit Casting:
        * And Explicit Casting
        * */

        //Implicit is assigning value of a less precise data type to a type with higher precision.

        //We assign value of type int to a variable with type long
        //long can hold a larger range
        //This is a widening conversion
        int myInteger = 900;
        long morePrecise = myInteger;

        System.out.println(morePrecise + " is now in a long data type");

        //Explicit Casting
        /*Going from a less specific to a more specific data type:
        * Higher precision to lower precision.
        * We will need to explicityl put the name of type we are casting to
        * inside of parenthesis before the value to be cast
        * */

        double pi = 3.1415926535897932;
        int almostPi = (int) pi;
        float floatingPi = (float) pi;

        System.out.println("almost pi has been cast into an integer of: " + almostPi);

        System.out.println("Now we float the pi: " + floatingPi);

    }
}
