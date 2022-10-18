import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Person joshua = new Person("Joshua Sprouse");
        Person rick = new Person("Rick Sanchez");
        rick.sayHello();
        joshua.sayHello();

        //Understanding References

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));//Expect this to say "true"
//
//        System.out.println(person1 == person2);//Expect this to say false; it points two separate references

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);//Person 1 and Person 2 are both set to "John"; so true;
//
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());//output: John
        System.out.println(person2.getName());//output: John
        person2.setName("Jane");
        System.out.println(person1.getName());//output: John xxx Why? Person 1 gets changed because person 2 is
        //referencing the same information for each object
        System.out.println(person2.getName());//output: Jane

    }
}
