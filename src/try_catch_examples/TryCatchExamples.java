package try_catch_examples;

import util.Input;

import java.util.Scanner;

public class TryCatchExamples {

    public static void main(String[] args) {


       //Try to get an element out of the index by the 3rd Index

//        System.out.println(a[3]);//ArrayIndexOutOfBoundsException
//

        try{
            int[] a = {4, 5, 2};
            System.out.println(a[3]);
        } catch(Exception e){
            System.out.println("An Exception Happened!");
        }

        Input input = new Input();


        System.out.println("What is your favorite number");



        try{
            int n = input.getInt();
            System.out.println(n);
        } catch (Exception e){
            System.out.println("Sorry, please enter a number!");
        }

        try{
            int[] a = {4};
        System.out.println(a[1]);
        } catch(NullPointerException e){
            System.out.println("Your array is null!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your index is out of bounds!");
        } catch (Exception e){
            System.out.println("Something else whent wrong!");
        }





    }
}
