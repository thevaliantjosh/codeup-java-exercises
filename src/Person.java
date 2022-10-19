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
    *
    * A constructor is a special method that is called when an object is created. A
    * constructor has the same name as teh calss and does not define a return type.
    * Constructors, like any other method, can accept arguments and be overloaded
    * */

    private String name; // Instance property
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //Constructors

    public Person(){//no arg constructor: Always create one of these

    }
    public Person(String name){
        this.name = name;
    }

//    public static long worldPopulation = 7_500_000_000L;//Class Property

    public void sayHello(){
        System.out.printf("Hello my name is %s!%n", getName());
    }

//    public String sayHello(){
//        return String.format("Hello from %s %s!", firstName, lastName);
//    }


}
