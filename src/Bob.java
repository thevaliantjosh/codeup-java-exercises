import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        //STRING BASICS PROBLEM 2

        Scanner in = new Scanner(System.in);

        String usersResponse = "";

        while(true){
            usersResponse = in.nextLine();
            if (usersResponse.endsWith("?")){
                System.out.println("Sure");
             } else if (usersResponse.endsWith("!")){
                System.out.println("Whoa, chill out man!");
            } else if (usersResponse.equals("")){
                System.out.println("Fine, Be that way!");
            } else if (usersResponse.equalsIgnoreCase("your grounded")){
                break;
            } else if (usersResponse.contains("Bob")){
                System.out.println("My name isn't Bob! It's Dragon!");
            } else {
                System.out.println("Whatever");

            }

        }

    }
}
