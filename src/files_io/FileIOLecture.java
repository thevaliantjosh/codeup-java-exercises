package files_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {
    public static void main(String[] args) {

        /*===============PATH=========================*/
//     Path pathToTest = Paths.get("src", "fileIoLecture", "test.txt");
//        System.out.println(pathToTest);
//
//        Path pathToWeywot = Paths.get("src", "hello", "weywot.txt");
//        System.out.println(pathToWeywot);

        Path fileLecturePath = Paths.get("src", "fileIoLecture", "FileIOLecture.java");
////        System.out.println(fileLecturePath);
//        System.out.println(fileLecturePath.toAbsolutePath());

        Path otherPath = Paths.get("src", "../", "src", "../", "src", "fileIoLecture", "files_io.FileIOLecture");
        System.out.println(otherPath);
        System.out.println(otherPath.normalize());
        System.out.println(otherPath.toAbsolutePath());
        System.out.println(otherPath.normalize().toAbsolutePath());

        /*===============FILE METHODS========================*/



        System.out.println(Files.exists(fileLecturePath));
        System.out.println(Files.exists(Paths.get("bob.txt")));

        String directory = "data";
        String filename = "info.txt";
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        System.out.println(dataDirectory);
        System.out.println(dataFile);

        if (Files.notExists(dataDirectory)){
            try {
                Files.createDirectories(dataDirectory);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if(Files.notExists(dataFile)){
            try {
                Files.createFile(dataFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /*====================READING FILES=====================*/

        Path p = Paths.get( "src","test.txt");

        List<String> lines = new ArrayList<>();


            try {
                lines = Files.readAllLines(p);
            } catch (IOException e) {
                e.printStackTrace();
            }

        System.out.println(lines);

            for (String name: lines){
                System.out.println("Hello, " + name + "!");
            }

//            try{
//                List<String> contents = Files.readAllLines(
//                        Paths.get("data", "bob.txt")
//                );
//                for (String line : contents){
//                    System.out.println(line);
//                }
//            } catch(Exception e){
//                System.out.println("Exception!");
//                e.printStackTrace();
//            }

        /*===============WRITING FILES=====================*/

        List<String> newNames = Arrays.asList("Fred", "Cathy", "Jack");

        try{
            Files.write(p, newNames, StandardOpenOption.APPEND);
        } catch(IOException e){
            e.printStackTrace();
        }

        try{
            lines = Files.readAllLines(p);
        } catch(IOException e){
            e.printStackTrace();
        }


    }//End of Main
}//End of Class
