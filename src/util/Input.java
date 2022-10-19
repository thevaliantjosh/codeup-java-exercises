package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }
    public void setScanner(Scanner scanner){
        this.scanner = scanner;
    }

    public String getString(){
        System.out.println("Enter your input: ");
        return scanner.nextLine();
    }

//    usersInput = in.next().toLowerCase();
//    boolean decline = usersInput.equals("n");


    public boolean yesNo(){
        System.out.println("Confirm: [yes/No]");
        String usersInput = scanner.next().toLowerCase();
        boolean decline = usersInput.startsWith("n");
        if (decline){
            return false;
        } else {
            return true;
        }

    }

    public int getInt(){
        int usersInput;
        System.out.println("Please Enter a number :)");
        usersInput = scanner.nextInt();
        return usersInput;
    }

    public int getInt(int min, int max) {
        int usersInput;
        do {
            System.out.printf("Enter a number between %d and %d%n", min, max);
            usersInput = scanner.nextInt();
        } while (usersInput > max || usersInput < min);
        return usersInput;
    }




    public double getDouble(double min, double max){
        double usersInput;
        do {
            System.out.printf("Enter a number between %.2f and %.2f%n", min, max);
            usersInput = scanner.nextDouble();
        } while(usersInput > max || usersInput < min);

        return usersInput;
    }

//    public double getDouble(){
//        double usersInput;
//        System.out.println("Please Enter a decimal number");
//        usersInput = scanner.nextDouble();
//        return usersInput;
//    }
    public double getDouble(){
        System.out.println("Enter a number: ");
        return scanner.nextDouble();
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public Input(){
        scanner = new Scanner(System.in);
    }


}
