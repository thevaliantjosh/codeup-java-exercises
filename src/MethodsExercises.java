import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {
    public static int addition(int x, int y){
        return x + y;
    }
    public static int subtraction(int x, int y){
        return x - y;
    }
    public static int multiplication(int x, int y) {
        int total = 0;
        for (int i = 0; i < x; i++) {
            total += y;

        }
        return total;
    }
    public static int recMultiplication(int x, int y){
        if((x == 0) || (y ==0)){
            return 0;
        }
            return (x + recMultiplication(x, y -1));
    }
    public static int division(int x, int y){
        if(y == 0){
            System.out.println("Not a number");
        }
        return x/y;
    }
    public static double remainder(double x, double y){
        return x % y;
    }
    public static int getInteger(int min, int max){ /*We declare the method as an integer with an integer of min, and integer of max*/
        Scanner in = new Scanner(System.in);//Sets a scanner, grabs user input

        System.out.printf("Enter a number between %d and %d%n ", min, max);//calls for user input
        int userInput = in.nextInt();//Variable stores user input
        if (userInput > max || userInput < min){ //is the value within range
            return getInteger(min, max);//if not then we call the method again
        } else {
            System.out.println("You got it!");//print for fun, You got it!
            return userInput;//returns the value of the user input. Break out of the recursion
        }

    }

    public static long factorial(long number){
        if (number <=1){
            return 1;
        } else {
            return number * factorial(number -1);
        }

    }

    public static void callFactorial(){
        Scanner in = new Scanner(System.in);
        String usersInput;
        do {
            System.out.println("Please Enter a number between 1 and 10");
            System.out.println(factorial(in.nextLong()));
            in.nextLine();
            System.out.println("Would you like to find the factorial of another number?");
            usersInput = in.nextLine();
        } while(usersInput.equalsIgnoreCase("y"));
    }


    public static void main(String[] args) {
//        System.out.println(addition(5, 6));
//        System.out.println(subtraction(5, 6));
        System.out.println(multiplication(5, 6));
        System.out.println(multiplication(2, 13));
        System.out.println(recMultiplication(5,5));
//        System.out.println(division(10, 2));
//        System.out.println(remainder(7, 3));
        System.out.printf("The remainder is: %.2f", remainder(8.321F, 5.267431F));
        System.out.printf("%nThe remainder is: %.1f", remainder(10, 3));
        System.out.println(division(0, 5));
//        System.out.println(division(15, 0));
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10");
        getInteger(5, 50);
        getInteger(1, 25);

        callFactorial();



    }
}
