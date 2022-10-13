import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //1. Loop Basics
        //While

        int i = 5;
        while (i <= 15) {
            System.out.println("The value of i is: " + i);
            i++;
        }


        //Do While
        //Number 1;
        int j = 2;
        do {
            System.out.println("The value of j is " + j);
            j += 2;
        } while (j <= 100);

        //Do While
        //Number 2
        int k = 100;
        do {
            System.out.println("The value of k is " + k);
            k -= 5;
        } while (k >= -10);

        //Do While
        //Number 3
        long m = 2; //You cannot use int here, the number after 65,536 would be over 4 billion which is out of range for an integer. So it will output 0 in an infinite loop.
        do {

            System.out.println("The value of m is " + m);
            m *= m;
        } while (m < 1_000_000);


        //For loops
        //Questions C:

        for(int n = 5; n <= 15; n++){
            System.out.println("Inside a for loop n is: " + n);
        }

        for(int p = 2; p <= 100; p+=2){
            System.out.println("Inside a for loop p is: " + p);
        }

        for(int q = 100; q >= -10; q-=5){
            System.out.println("Inside a for loop q is: " + q);
        }

        for(long r = 2; r <= 1_000_000; r*=r){
            System.out.println("Inside a for loop r is: " + r);
        }


        //Fizzbuzz

        /*Write a program that prints the numbers from 1 to 100
        * For multiples of three: Print "Fizz" instead of the number
        * For multiples of five: Print "Buzz" instead of the number
        *For numbers which are multiples of both three and five:
        * Print "FizzBuzz"
        * */

        for(int s = 1; s <= 100; s++){
            if(s % 5 == 0 && s % 3 == 0){
                System.out.println("FizzBuzz");
            } else if(s % 5 == 0){
                System.out.println("Buzz");
            } else if (s % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(s);
            }
        }



//Asking the user for a number than printing a table up to the users number
        //With a column for the number
        //a column for squared
        //and a column for cubed
        //The users is than asked if they would like to continue
        //if any key other than "n" is pressed it will prompt for a new number
        //if n is pressed it breaks the loop

        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("What number would you like to go to?");
            int usersNumber;
            usersNumber = in.nextInt();
            for(int t = 1; t <= usersNumber; t++){
                int squared = t*t;
                int cubed = t*t*t;
                if(t == 1){
                    System.out.println("Here is your table!\n");
                    System.out.println("number  |  squared  |  cubed\n ------ | --------  | ----- ");
                    System.out.printf("%-8d| %-10d| %-8d ", t, squared, cubed);
                }  else {
                    System.out.printf("%n%-8d| %-10d| %-8d ", t, squared, cubed);
                }

            }

            System.out.println("\nWould you like to continue? [y/N]");
            String usersInput;

            usersInput = in.next().toLowerCase();
            boolean decline = usersInput.equals("n");
                if (decline) {
                    break;
                }

        }

        /*4) Convert a given number grades into letter grades
        * Prompt the user for a numerical grade from 0 to 100
        * Display the corresponding letter grade
        * Prompt the user to continue
        * Assume that the user will enter valid integers for the grades
        * The application should only conitnue if the user agrees to
        * Grade Ranges:
        * A: 100-88
        * B: 87-80
        * C: 79-67
        * D: 66-60
        * F: 59-0
        *
        * */

        while(true){
            System.out.println("Please enter a numerical grade from 0 to 100");
            int numberGrade;
            numberGrade = in.nextInt();
            if(numberGrade >= 88){
                System.out.println("Congrats! You received an: A");
            } else if (numberGrade >=80) {
                System.out.println("Good Job! Your Grade is a: B");
            } else if (numberGrade >= 67){
                System.out.println("Can you try harder? Your Grade is a: C");
            } else if (numberGrade >= 60){
                System.out.println("Did you even try? Your Grade is a: D");
            } else if (numberGrade >= 0){
                System.out.println("You have failed :( Your Grade is an: F");
            }

            System.out.println("Would you like me to scrutinize more of your grades?");
            String usersInput;
            usersInput = in.next().toLowerCase();
            boolean decline = usersInput.equals("n");
            if (decline) {
                break;
            }
        }

    }

}

