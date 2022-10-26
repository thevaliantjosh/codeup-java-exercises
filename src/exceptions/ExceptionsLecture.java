package exceptions;

import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class ExceptionsLecture {
    public static void soutName(String name) throws NameIsBobException {
        if (name.equalsIgnoreCase("bob")) {
            throw new NameIsBobException("NOOOOOOO!!!!");
        } else {
            System.out.println(name);
        }
    }
    public static void printRiskyInput() throws Exception {
        String userInput = sc.nextLine();
        if (userInput.length() > 10) {
            throw new PrinterException("Input too long to print!!");
        }
        if (userInput.equalsIgnoreCase("hello")) {
            throw new Exception("Can't enter hello.");
        }
    }

    //The below method is something you would write as a developer, but use from another library
    private static void connectToDatabase() throws SQLException {
        Random r = new Random();
        if (r.nextInt(2) == 0) {
            throw new SQLException("Can't connect to database");
        } else {
            System.out.println("Connecting to database...");
        }
    }

    private static void makeConnection() throws SQLException {
        connectToDatabase();
        /*We need to tell this method to throw an exception
        * by adding the throws clause as part of the method signature
        * throws SQLException*/
    }

    //this is a method that throws the RuntimeException, IllegalArgumenetException
    private static int addTwoAndTwo(int num1, int num2){
        if (num1 !=2 || num2!= 2){
            throw new IllegalArgumentException("Inputs must both be the number 2");
        }
        return num1 + num2;
    }
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  {

        //Throwing Exceptions

        //Throw someException("Exception message here")
//        throw new RuntimeException("You did something wrong. Sorry....");

        //A checked exception
//    try {
//        throw new Exception("Must handle this...");
//    } catch (Exception e){
//        e.printStackTrace();
//    }

        System.out.println("Will this run???");//This runs because the exception was caught

//        int x = 1;
//        int y = 0;
//        int value = x/ y; // will throw ArithmeticException at runtime

        //Using the addTwoandTwo method

//       addTwoAndTwo(3, 1);//Throws IllegalArgumentException "Inputs must both be the number 2"


//        try {
//            makeConnection();
//
//        } catch(SQLException e){
//            e.printStackTrace();
//        }


        //multiple catches and finally

//        try{
//            printRiskyInput();
//        } catch (PrinterException e){
//            e.printStackTrace();
//        } catch (Exception e){
//            e.printStackTrace();
//        } finally {
//            System.out.println("Closing resource");
//            sc.close();
//        }

        //custom Exceptions


        try {
            soutName("Justin");
            soutName("Bob");
        } catch (NameIsBobException e) {
            e.printStackTrace();
        }







    }//End of Main
}//End of Class
