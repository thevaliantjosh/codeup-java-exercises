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

    }
}
