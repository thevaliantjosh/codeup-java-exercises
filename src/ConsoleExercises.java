import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        //Printing Data to the Console

        String name = "codeup";
        System.out.printf("Hello There, %s. Nice to see you.%n", name);
        /*As you can see from the terminal
        * The %s will be replaced with the value of the name variable
        * resulting in an output of "Hello there, codeup. Nice to see you
        * The %n is adding a new line to the console afterwards
        * You can use multiple placeholders*/

        String greeting = "Salutations";
        System.out.printf("%s, %s!\n", greeting, name);


        //Import Statements
        /*packages are a namespace for a groupd or related code
        * we will be using code form the java.util package
        * that is included in the Java language
        * import statements are what let us use code from other packages.
        * We will use them to include code you've organized into different directories, and to include code form other Java libraries.
        *
        * Imports go at the top of your file, befroe the class definition.
        * We will import the Scanner class for the java.util package
        *
        * you could add import java.util.Scanner manually to the top
        *
        * or type out Scanner then hit tab, and it will populate it automatically.
        * */

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        String userInput = scanner.next();
//
//        System.out.println("You enetered: --> \"" + userInput + "\" <--" );

        //Number 1.

        double pi = 3.14159;

        System.out.printf("Using printf: The value of pi is approximately %3.2f%n", pi);
        System.out.format("Using format: The value of pi is is approximately %3.2f%n", pi);

        //Explore the Scanner class
        /*1) Prompt a user to enter an integer and store that value in an int variable using the nextDouble method.
        What happens if you input something that is not an integer?*/

        //Declarations
        int usersInteger;
        String word1;
        String word2;
        String word3;
        String usersSentence;
        Scanner in = new Scanner(System.in);

        //Prompts
        System.out.println("Enter an integer: ");
        //Read in Value for the number
        usersInteger = in.nextInt();
        //Output The number
        System.out.printf("Your number was: %d%n", usersInteger);



        //Prompt for words
        System.out.println("Now Enter 3 words and press Enter after Each new word: ");


        //2)
        //Read in values for the words
        word1 = in.next();
        word2 = in.next();
        word3 = in.next();
        in.nextLine(); //This is needed in order to look for the space after the last word is entered, it will then prompt the user for the sentence;
        //Output the words
        System.out.printf("Your first word was: %s%n Your second word was: %s%n Your final word was: %s%n", word1, word2, word3);
        //If the user inputs something other than an integer,
        //We receive an InputMismatchException

        //Prompt for a sentence
        System.out.println("Please Enter a sentence: ");
        //Read in value for the sentence
//        usersSentence = in.next();
        //The above line of code will only give my the first word from my sentence
        //Below, if I use nextLine(), it will give me the entirety of my sentence
        usersSentence = in.nextLine();
        //Output the sentence
        System.out.printf("Your sentence was: %s%n ", usersSentence);

        //Calculate the Perimeter and area of Codeup's classrooms

        //Declaration
//        in.nextLine();
        double usersLength;
        double usersWidth;
        double usersHeight;


        //Prompting the user for the Length of the room
        System.out.println("Input the Estimated length of the Classroom: ");
        //Read in value for the length
        usersLength = in.nextDouble();
        //Prompting the user for the width of the Classroom
        System.out.println("Input the Estimated width of the Classroom: ");
        //Read in value for the width
        usersWidth = in.nextDouble();
        //Prompting the user for the height of the Classroom
        System.out.println("Input the Estimated height of the Classroom");
        //Read in value for the height
        usersHeight = in.nextDouble();
        //making an integer variable that will calculate the two users input as
        //the area of the room
        //then the perimeter of the room
        double areOfRoom = (usersLength * usersWidth);
        double perimeterOfRoom = (usersLength * 2) + (usersWidth * 2);
        double volumeOfRoom = (usersLength * usersWidth * usersHeight);
        //Out put the area
        System.out.printf("The area of the classroom is: %3.2f%n The perimeter of the classroom is: %3.2f%n The volume of the classroom is: %3.2f%n", areOfRoom, perimeterOfRoom, volumeOfRoom);

    }
}
