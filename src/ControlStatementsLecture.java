import java.util.Scanner;

public class ControlStatementsLecture {
    public static void main(String[] args) {
        Object myInteger = 20;
        System.out.println(myInteger);

//        int x = 6;
//        Scanner in = new Scanner(System.in);
//        byte usersNumber;
//        System.out.println("Enter a number between 5 and 15");
//        usersNumber = in.nextByte();
//        if (usersNumber == 5){
//            System.out.println("Your number is 5");
//        } else if (usersNumber > 5 && usersNumber < 15){
//            System.out.println("Your number is between 5 and 15");
//        } else {
//            System.out.printf("The number %d is not between 5 and 15%n", usersNumber);
//        }

        //Traditional Switch Statement

//        in.nextLine();
//        System.out.println("What Flavor Do you want?");
//        String customerChoice;
//        customerChoice = in.nextLine();
//        switch (customerChoice) {
//            case "vanilla":
//                System.out.println("One vanilla coming right up");
//                break;
//            case "chocolate":
//                System.out.println("chocolate coming right up");
//                break;
//            case "strawberry":
//                System.out.println("strawberry coming right up");
//                break;
//            default:
//                System.out.println("Sorry, We don't have that");
//                break;
//        }

        //Enhanced Switch Statement

//        in.nextLine();
//        System.out.println("What Flavor Do you want?");
//        String customerChoice;
//        customerChoice = in.nextLine();
//        switch (customerChoice) {
//            case "vanilla" -> System.out.println("One vanilla coming right up");
//            case "chocolate" -> System.out.println("chocolate coming right up");
//            case "strawberry" -> System.out.println("strawberry coming right up");
//            default -> System.out.println("Sorry, We don't have that");
//        }

        int c = 0, d = 100, e = 50;
        if ( c == 1 & e++ < 100){//both sides need to be true to get true with double &&
            //if we change c to 1 then e will not get run
            //if we use one & operator, the operator always evaluates both expressions
        }
        System.out.println("e = " + e);

        boolean existence = true;
        int theAnswer = 42;
        if (existence || theAnswer++ == 42){}//if the left hand side is true it only evaluates the second expression if necessary
        //So using two || will evaluate to true an not run theAnswer++
        //using | or operator will run both expressions
        System.out.println(theAnswer);

        if(theAnswer == 42){
            System.out.println("The Answer is 42");
        } else {
            System.out.println("The Answer is not 42");
        }

        //While Loops

        int i = 1;
//        System.out.println("The loop hasn't started yet. The value of is is " + i);
//        while (i < 10) {
//            System.out.println("Now I'm in the loop, i has not incremented yet and it's value is " + i);
//            i++;
//            System.out.println("I'm still in the loop. i has incremented, and it's value is: " + i);
//        }
//        System.out.println("The loop has ended becuase the conditional has tested false. The value of i is " + i);


        //Do While Loops

//        do {
//            System.out.println("Now I'm in the loop, i has not incremented yet and it's value is " + i);
//            i++;
//            System.out.println("I'm still in the loop. i has incremented, and it's value is: " + i);
//        } while (i < 10);
//
//        System.out.println("The loop has ended becuase the conditional has tested false. The value of i is " + i);

        for (i = 0; i < 10; i++){
            System.out.println("i is " + i);
        }

        //Break statements
        //In The case of multiple nested loops, a labled break statement is used to differentiate which loop to exit
        //The loop below breaks to only print numbers 1 through 5 even though the condition of the loop specifies that the loop should happen 100 times.
        for(int j = 1; j < 100; j++){
            System.out.println(j);
            if (j ==4) {
                System.out.println("I'll give you a 5 and that's it. I'm tired");
                continue;
            }
            if (j == 5) {
                System.out.println("Get me outta here");
                break;

            }
        }



    }
}
