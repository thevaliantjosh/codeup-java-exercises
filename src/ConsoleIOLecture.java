import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        String cohort = "Weywot";
        //Instead of sout tab, you type souf tab;
//        System.out.printf("Hello %s", cohort);
        //Run code
        /*You will see the %s is a placeholder.
        * The value that is in the cohort variable is then
        * passed into the %s.
        *
        * we see: "Hello Weywot" get printed out in the terminal
        *
        * the "s" stands for string
        *
        * printf is not language specific
        *
        * one thing about printf
        *
        * */
//        System.out.println("Will this be on a separate line?");
        //After running the above code you see that this line is now next to the printf line

        //input \n after the %s to receive a new line
        //alternatively input a %n to receive a new line

        String newLine = "Give me a...";
//        System.out.printf("%s%nNew Line!%n", newLine);

        byte week = 10;
        String timeOfDay = "morning";
//        System.out.printf("Good, %s %s%n", timeOfDay, cohort);
//        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
//        System.out.println("Will this be on a separate line?");

        //Floats with souf
//
//        float someNumber = 123.456F;
//        System.out.printf("The number is %03.3f%n", someNumber);
//        //%03 is the spaces before the decimal
//        //.3f is how many decimal places you want after the decimal
//        System.out.printf("The number is %-11.2f test%n", someNumber);
//        //The above is left justified, the -11 is pushing the spaces to the right
//        //The .2f is floating just 2 numbers and rounding up
//        System.out.printf("The number is %+11.2f test%n", someNumber);
//        //The above is right justified, the +11 is pushing the spaces to the left.

        //Getting input From the Console
        /*We need to import the Scanner class
        *
        * we wrote on the top of the file: import java.util.Scanner;
        *
        * */

        //First we declare a variable of type Scanner, and assign to it a new Scanner Object
        //We also specify System.in for the source of the scanner
        //The System.in refers to information a user types into the console, as opposed to a text file
        //
//        Scanner scanner = new Scanner(System.in);//System.in is an InputStream
        Scanner scanner = new Scanner(System.in);//Used Scanner then tab to import
        System.out.println("Enter a number: ");
//        int userNumber = Integer.parseInt(scanner.nextLine());
        int userNumber = scanner.nextInt();
        System.out.printf("Your number was: %d%n", userNumber);

        System.out.println("Enter a sentence: ");
//        String ghost = scanner.nextLine();
        scanner.nextLine();
        String userInput = scanner.nextLine();
        System.out.println("Enter another sentence: ");
        String secondSentence = scanner.nextLine();
        //We prompt the suer to type something, and us the expression:
        //scanner.next() to obtain the value the user entered as a String
        //We then store this in the variable userInput
        System.out.printf("Your word was %s.%n", userInput);
        System.out.printf("Your second sentence was: %s.%n", secondSentence);
        //We then changed next() with nextLine();
        //If we want to get something that is numeric from the user


        //Declare where the Users Integer will be placed
        //we use a reference to the scanner object with scanner.
        //We use the reference method of nextInt() to look for an integer the user will input




        //Declarations
        Scanner in = new Scanner(System.in);
        int integer;
        long longInteger;
        float realNumber;
        double doubleReal;
        String string1;
        String string2;

        //Prompts
        System.out.println("Enter an integer, a long integer,\n a floating point number \n another floating-point number, \n and a string. \n Seprate Each with a blank or return");

        //Read in values
        integer = in.nextInt();
        longInteger = in.nextLong();
        realNumber = in.nextFloat();
        string1 = in.nextLine();
        System.out.println("Now Enter another value.");
        string2 = in.next();


        System.out.printf("Here is what you entered: %d%n %d%n %03.3f%n %s %s", integer, longInteger, realNumber, string1, string2);





    }
}
