package grades;

import rpg.Monster;

import java.util.*;

import static java.util.Map.entry;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Scanner in = new Scanner(System.in);

//        Map<String, Monster> intermediateMap = Map.ofEntries(
//                entry("blue dragon", blueDragon),
//                entry("ogre", ogre),
//                entry("werewolf", werewolf),
//                entry("frost giant", frostGiant),
//                entry("goblin", goblin),
//                entry("orc war chief", orcWarChief)
//        );

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


        //Command Line Interface

//        System.out.println("-------Loop over Entry set------------");
//        for(Map.Entry<String, Monster> monsterEntry : monsterHashMap.entrySet()){
//            Monster monster = monsterEntry.getValue();
//            System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
//        }




        String userInput = "";

//        List<String> monsterNames = new ArrayList<>(monsterHashMap.keySet().stream().toList());
        List<String> studentUserNames = new ArrayList<>(stringStudentMap.keySet().stream().toList());
//        System.out.println(studentUserNames);

//
//        for (String monsterName : monsterNames){
//            Monster monster = monsterHashMap.get(monsterName);
//            System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
//        }

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students: \n");
        STUDENTSAPP:
        while(true){
            for(String userName : studentUserNames){
                System.out.printf("|%s|", userName);
            }
            System.out.println("\n\nWhat student would you like to see more information on?");
            while(!userInput.startsWith("n")){
                userInput = in.nextLine();
                if(!stringStudentMap.containsKey(userInput)) {
                    System.out.printf("Sorry, no student found with the GitHUb username of \"%s\".%n", userInput);
                    System.out.println("\nWould you like to see another student? [yes/No]");
                    userInput = in.nextLine().toLowerCase();
                    if (userInput.startsWith("y")) {
                        break;
                    } else {
                        break STUDENTSAPP;
                    }

                } else {
                    System.out.printf("""
                            Name: %s -GitHub Username: %s%n
                            Current Average: %.2f%n
                            Would you like to see another student? [yes/No]%n
                            """, stringStudentMap.get(userInput).getName(), userInput, stringStudentMap.get(userInput).getGradeAverage());
                    userInput = in.nextLine().toLowerCase();
                    if (userInput.startsWith("y")) {
                        break;
                    } else {
                        break STUDENTSAPP;
                    }//End of inner else
                }//End of outer else
            }//End of inner While loop
        }//End of STUDENTSAPP

        System.out.println("Goodbye, and have a wonderful day!");

    }//END OF MAIN
}//END OF CLASS
