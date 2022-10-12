import java.sql.SQLOutput;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
//        String helloWorld = "Hello, World!";
//        System.out.println("Hello, World!");
        System.out.print("Hello, ");
        System.out.print("World!\n");

        //Syntax, Types, and Variables Exercise

        int myFavoriteNumber = 42;
        System.out.println(myFavoriteNumber);

        String myString = "Shawn of the Dead";
        System.out.println(myString);

        char addPeriod = '.';
        System.out.println(myString + addPeriod);

//        myString = 3.14159876734;
//        System.out.println(myString);

//        long myNumber;
//        myNumber = (float) 3.14;
//        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        String theNumberThree = "three";
        System.out.println(theNumberThree);
        Object o = theNumberThree; //Object is the most generic type in Java, You can assign any value to a variable of type Object.
        System.out.println(o);
//        int three = (int) o;
//        System.out.println(three);

//        int three = (int) "three";
//        System.out.println(three);

//        int x = 10;
//        int y = 2;
////        x = (x / y);
////        System.out.println(x);
//
//        y -= (x /= y);
//        System.out.println(y);

//        int maximumInteger = Integer.MAX_VALUE;
        int minimumInteger = Integer.MIN_VALUE;
        System.out.println(minimumInteger);
//        System.out.println(maximumInteger);

        long maximumInteger = 2147483647L;
        maximumInteger++;
        System.out.println(maximumInteger);

        int x = 4;
        x++;
        System.out.println(x);

        int a = 3;
        int b = 4;
        b *= a;
        System.out.println(b);

        int c = 10;
        int d = 2;
//        c /=  d;
//        System.out.println(c);
//        d -= c;
//        System.out.println(d);
        d -= (c / d);
        System.out.println(d);



    }
}
