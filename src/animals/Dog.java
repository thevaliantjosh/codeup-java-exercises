package animals;

public class Dog {

    /*"public" is an access (or visibility) modifier, we can call the dog class and its methods anywhere
    * inside our Java program
    * "static" defines that the method belongs to the class, as opposed to instances of it
    *
    * if a method's return type is void, it is a comple time error to return anything inside of
    * the method: however, methods with a void return type can still use the return keyword
    * to exit the method early.
    * */

    /*METHOD OVERLOADING
    * Defining multiple methods with the sme name, but with different parameter types
    * parameter order, or number of parameters
    *
    * */
    public static String bark(){
//        System.out.println("Woof Woof!");
        return "Woof Woof";
    }
    public static void bark(int weight){
        if (weight < 25){
            System.out.println("Yip Yip");
        } else {
            System.out.println("Bow Wow!");
        }
    }
    public static void bark(int weight, String name){
        System.out.printf("%s goes ", name);
        bark(weight);
//        String output = name + " goes ";
//        if (weight < 25){
//            output += "yip yip!";
//        } else {
//            output += "woof woof!";
//        }
//        System.out.println(output);
    }
    public static void main(String[] args) {
        String bark = bark();//can store the String method in a new String
        System.out.println(bark);//then sout the bark
        System.out.println(bark());;//or call the method in sout
//        bark(15);
//        bark(50);
//        bark(50, "Rudo");
//        bark(15, "Fido");

    }
}
