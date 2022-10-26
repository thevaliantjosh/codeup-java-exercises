package files_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOPractice {
    private static void addPeople(Path pathToAppend, List<String> newArrayList){
        try {
            Files.write(pathToAppend, newArrayList, StandardOpenOption.APPEND);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
//        ================================= FILE IO MINI-EXERCISE
//
//                - create a class called `FileIoPractice` with a main method
//
//        - add a `fileIo` folder to the root of your codeup-java-exercises project.
//
//                - within this folder, add a text file, `people.txt`.
//
//        - add the following contents to the file:
//
//        Justin
//                Javier
//        Jason
//                Laura
//
//        - write code in the main method that prints the following messages:
//
//        "Justin works at Codeup."
//        "Javier works at Codeup."
//        "Jason works at Codeup."
//        "Laura works at Codeup."
//
//                - create an array list of first names of four other people in your cohort
//
//                - add code to your main method that replaces the contents of `people.txt` with your classmates by writing to the file
//
//        - BONUS: create a static method, `deleteEntry`, that takes in the name of someone (a string) and when invoked, rewrites a new list to the `people.txt` file
//        with all entries except the passed in name

        Path peoplePath = Paths.get("src", "files_io", "people.txt");

        List<String> allThePeople = new ArrayList<>();


        try {
            allThePeople = Files.readAllLines(peoplePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(allThePeople);

        for(String person : allThePeople){
            System.out.printf("%s works at Codeup%n", person);
        }

        List<String> morePeople = new ArrayList<>();

        morePeople.add("Mason");
        morePeople.add("Daniel");
        morePeople.add("Frances");
        morePeople.add("Stephen");

        try{
            Files.write(peoplePath, morePeople);
        } catch (IOException e){
            e.printStackTrace();
        }





//        List<String> newNames = Arrays.asList("John", "Fred", "Cathy");
////        try {
////            Files.write(p, newNames);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }







    }
}
