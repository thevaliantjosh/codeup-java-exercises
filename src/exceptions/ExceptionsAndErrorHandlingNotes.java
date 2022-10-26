package exceptions;

import java.io.PrintStream;
import java.util.Scanner;

public class ExceptionsAndErrorHandlingNotes {
    private static String getIndentationPreference() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();
        if(indentationPreference.equals("tabs")){
            throw new Exception("Spaces are superior!");
        }
        return indentationPreference;
    }
    private static void runIndentationPreference(){
        try{
           String indentationPreference = getIndentationPreference();
            System.out.println("Okay, " + indentationPreference + " is a great choice");
        } catch (Exception e) {
            System.out.println("Uh oh, something went wrong: " + e.getMessage());
            System.out.println("Here is some more detail: ");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        int[] numbers = {1, 2, 3, 4};
//        try{System.out.println(numbers[999]);}
//        catch (Exception e){
//            System.out.println("Oops, that didn't work!");
//        }
//        throw new Exception("Something bad happened!");

        try{
            System.out.println("Let's see...");
            int result = 1 / 0;//This line is skipped because you can't divide by zero, it throws the Exception.
            System.out.println("I can divide by zero!");//And so is this one
        }
        catch(ArithmeticException e){//This block of code is looking for the ArithmeticException error to be thrown and runs the following code.
            System.out.println("Math still works!");
        }



        try{
            String[] days = {"Monday", "Tuesday"};
            System.out.println(days[4]);
            //ArrayIndexOutOfBoundsException
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("There is an error!");
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("General Exception");
            e.printStackTrace();
        }

        runIndentationPreference();


//        System.out.println("after the throw statement");//This code will be unreachable
        /*The above code will throw the following Error
        * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index *999 out of bounds for length 4
	    *at exceptions.ExceptionsAndErrorHandlingNotes.main(exceptions.ExceptionsAndErrorHandlingNotes.java:4)
        *
        *
        * */
    }
}
