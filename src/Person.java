public class Person {
    /*A class is used to define a custom type in Java.
    * You can think of a class as a template, or a blueprint, for objects that will
    * be created based on it
    *
    * A "field" is a variable or method that belongs to an object or a calss
    *
    * Fields are accessed with the (.) operator. By default, fields belong to objects, but can be
    * defined as belonging to a class with the "static" keyword. Fields are either properties
    * (variables) or methods (functions)
    *
    * An "object" is an instance of a class.
    *
    * Objects have fields and methods, and are instantiated, i.e., created, with the "new" keyword.
    *
    * A constructor brings an instance into existence
    * */
    public String firstName;//Instance variable
    public  String lastName;//Instance variable

    public String sayHello(){
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args){
        Person rick = new Person();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());//Prints "Hello from Rick Sanchez!
    }
}
