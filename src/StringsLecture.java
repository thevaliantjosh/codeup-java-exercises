import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
        //STRING IMMUTABILITY


        String javier = "Javier";

        System.out.println(Integer.toHexString((System.identityHashCode(javier))));
        /*When you save a variable, the computer has to know where to look for
        * the value.
        *The hashcode is a representation of the memory address where the memory is
        * stored.
        *
        * */

        String alsoJavier = "Javier";

        System.out.println(Integer.toHexString(System.identityHashCode(alsoJavier)));
        /*Despite being different variables, theses string refer to the same
        * Reference in the hashcode
        * */
        javier = javier + " Ruedes";
        alsoJavier = javier;
        System.out.println(alsoJavier);
        System.out.println(javier);
        System.out.println(Integer.toHexString(System.identityHashCode(javier)));
        System.out.println(Integer.toHexString(System.identityHashCode(alsoJavier)));

        String letsTryThis = "Javier";
        System.out.println(Integer.toHexString(System.identityHashCode(letsTryThis)));
        /*We created two strings called Javier
        * Strings are collected in a String pool
        * We modified all references to the "Javier" String
        * When we made another string with the same value as "Javier"
        * It points to the same spot in memory as the original "Javier" String
        * Any new declaration, instead of creating a new memory space, it will point to
        * the same reference in the memory pool.
        *
        *
        * */


        String theOriginalJavier = "Javier";

        System.out.println(letsTryThis == theOriginalJavier);
        //With this, it is not comparing the value of the strings themselves
        //They are saying that both references are the same
        //aka(the hashcode)

        Scanner in = new Scanner(System.in);

        System.out.println("What's your name?");
        String userName = in.nextLine();

        System.out.println(theOriginalJavier == userName);//This will be false
        System.out.println(theOriginalJavier.equals(userName));//This will compare the actual value of the strings, and equal True:
        System.out.println(javier.equals(userName));

    }
}
