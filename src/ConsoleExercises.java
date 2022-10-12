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

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You enetered: --> \"" + userInput + "\" <--" );

    }
}
