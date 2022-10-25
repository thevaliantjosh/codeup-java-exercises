package grades;

import rpg.Monster;

import java.util.*;

import static java.util.Map.entry;

public class GradesApplication {
    public static void main(String[] args) {
//        HashMap<String, Student> students = new HashMap<>();
        Scanner in = new Scanner(System.in);


        Map<String, Student> stringStudentMap = Map.ofEntries(
                entry("crazyMuppet", new Student("Animal")),
                entry("fuzzieWuzzie", new Student("Fozzie Bear")),
                entry("itAintEasyBeingGreen", new Student("Kermit the Frog")),
                entry("wigOnAPig", new Student("Miss Piggy"))

        );

        stringStudentMap.get("crazyMuppet").addGrade(100);
        stringStudentMap.get("crazyMuppet").addGrade(80);
        stringStudentMap.get("crazyMuppet").addGrade(75);
        stringStudentMap.get("fuzzieWuzzie").addGrade(67);
        stringStudentMap.get("fuzzieWuzzie").addGrade(77);
        stringStudentMap.get("fuzzieWuzzie").addGrade(87);
        stringStudentMap.get("itAintEasyBeingGreen").addGrade(95);
        stringStudentMap.get("itAintEasyBeingGreen").addGrade(92);
        stringStudentMap.get("itAintEasyBeingGreen").addGrade(82);
        stringStudentMap.get("wigOnAPig").addGrade(95);
        stringStudentMap.get("wigOnAPig").addGrade(92);
        stringStudentMap.get("wigOnAPig").addGrade(82);



        String userInput = "";

        List<String> studentUserNames = new ArrayList<>(stringStudentMap.keySet().stream().toList());
//        System.out.println(studentUserNames);

        /*==============COMMAND LINE INTERFACE=========================================*/

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students: \n");


        while(true){
            for(String userName : studentUserNames){
                System.out.printf("|%s|", userName);
            }
            System.out.println("\n\nWhat student would you like to see more information on?");

                userInput = in.nextLine();
                if(!stringStudentMap.containsKey(userInput)) {
                    System.out.printf("Sorry, no student found with the GitHUb username of \"%s\".%n", userInput);
                    System.out.println("\nWould you like to see another student? [yes/No]");
                    userInput = in.nextLine().toLowerCase();
                    if (userInput.startsWith("n")) {
                        break;
                    }
                } else {
                    System.out.printf("""
                            Name: %s -GitHub Username: %s%n
                            Current Average: %.2f%n
                            Would you like to see another student? [yes/No]%n
                            """, stringStudentMap.get(userInput).getName(), userInput, stringStudentMap.get(userInput).getGradeAverage());
                    userInput = in.nextLine().toLowerCase();
                    if (userInput.startsWith("n")) {
                        break;
                    }
                }//End of outer else

        }//End of While loop


        System.out.println("Goodbye, and have a wonderful day!");




//============MY ATTEMPT AT USING A LABEL AND TWO WHILE LOOPS===============

//        STUDENTSAPP:
//        while(true){
//            for(String userName : studentUserNames){
//                System.out.printf("|%s|", userName);
//            }
//            System.out.println("\n\nWhat student would you like to see more information on?");
//            while(!userInput.startsWith("n")){
//                userInput = in.nextLine();
//                if(!stringStudentMap.containsKey(userInput)) {
//                    System.out.printf("Sorry, no student found with the GitHUb username of \"%s\".%n", userInput);
//                    System.out.println("\nWould you like to see another student? [yes/No]");
//                    userInput = in.nextLine().toLowerCase();
//                    if (userInput.startsWith("y")) {
//                        break;
//                    } else {
//                        break STUDENTSAPP;
//                    }
//
//                } else {
//                    System.out.printf("""
//                            Name: %s -GitHub Username: %s%n
//                            Current Average: %.2f%n
//                            Would you like to see another student? [yes/No]%n
//                            """, stringStudentMap.get(userInput).getName(), userInput, stringStudentMap.get(userInput).getGradeAverage());
//                    userInput = in.nextLine().toLowerCase();
//                    if (userInput.startsWith("y")) {
//                        break;
//                    } else {
//                        break STUDENTSAPP;
//                    }//End of inner else
//                }//End of outer else
//            }//End of inner While loop
//        }//End of STUDENTSAPP



    }//END OF MAIN
}//END OF CLASS
