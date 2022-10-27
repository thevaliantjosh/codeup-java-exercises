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
    private static final Path peoplePath = Paths.get("src", "files_io", "people.txt");

    private static void addPeople(List<String> newArrayList){
        try {
            Files.write(peoplePath, newArrayList, StandardOpenOption.APPEND);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    private static List<String> readFile() {
        List<String> names = null;
        try {
            names = Files.readAllLines(peoplePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }

    private static void deleteName(String nameToDelete) {
        List<String> updatedNames = new ArrayList<>();
        for (String name : readFile()) {
            if (!name.equalsIgnoreCase(nameToDelete)) {
                updatedNames.add(name);
            }
        }
        addPeople(updatedNames);
    }
    public static void main(String[] args) {

        List<String> allThePeople = new ArrayList<>();


        try {
            allThePeople = Files.readAllLines(peoplePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(allThePeople);

        for(int i = 0; i < allThePeople.size(); i++){
            if (i > allThePeople.indexOf("Stephen")){
                System.out.printf("%s Works at Codeup%n", allThePeople.get(i));
            } else{
                System.out.printf("%s attends Codeup%n", allThePeople.get(i));
            }

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

        List<String> evenMorePeople = Arrays.asList("Joshua", "Justin", "Jason", "Trevor", "Gonzalo");

        addPeople(evenMorePeople);

        readFile();

        deleteName("Joshua");







//        List<String> newNames = Arrays.asList("John", "Fred", "Cathy");
////        try {
////            Files.write(p, newNames);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }

//
//        private final static Path PATH = Paths.get("fileIo", "people.txt");
//
//        // Read people.txt
//        private static List<String> readLines() {
//            List<String> names;
//            try {
//                names = Files.readAllLines(PATH);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            return names;
//        }
//
//        private static void greetNames() {
//            for (String name : readLines()) {
//                System.out.printf("%s works at Codeup.%n", name);
//            }
//        }
//
//        private static void writeLines(List<String> lines) {
//            try {
//                Files.write(PATH, lines);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//
//        public static void main(String[] args) {
//
//            // greet names
////        greetNames();
////        System.out.println("==================");
//
//            // write to file and replace names...
////        List<String> newNames = Arrays.asList("Cody", "Nikki", "Jordy", "Jay");
////        writeLines(newNames);
////        greetNames();
//
//            // delete name from list...
//            deleteName("Jordy");
//            greetNames();
//
//        }
//
//
//        private static void deleteName(String nameToDelete) {
//            List<String> updatedNames = new ArrayList<>();
//            for (String name : readLines()) {
//                if (!name.equalsIgnoreCase(nameToDelete)) {
//                    updatedNames.add(name);
//                }
//            }
//            writeLines(updatedNames);



        }//End of Main

    }//End of Class