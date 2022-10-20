import java.util.Arrays;

public class ArraysExercises {
    //In class demonstration of the addPerson Method
//    public static Person[] addPerson(Person newPerson, Person[] PeopleArray){
//        Person[] newPeopleArray;
//        newPeopleArray = new Person[PeopleArray.length + 1];
//        System.out.println(newPeopleArray);
//        for (int i = 0; i < PeopleArray.length -1; i++){
//            newPeopleArray[i] = PeopleArray[i];
//        }
//        System.out.println(Arrays.toString(newPeopleArray));
//        newPeopleArray[newPeopleArray.length -1] = newPerson;
//        return newPeopleArray;
//    }

    public static Person[] addPerson(Person[] personArray,  Person newPerson){

        Person[] newArrayOfPeople = new Person[personArray.length + 1];

        System.arraycopy(personArray, 0, newArrayOfPeople, 0, personArray.length);
        newArrayOfPeople[newArrayOfPeople.length -1] = newPerson;
        return newArrayOfPeople;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);//Will print out the hashcode of the array

        System.out.printf("The numbers array is: %s%n", Arrays.toString(numbers));

        Person simon = new Person("Simon Pegg");
        Person edgar = new Person("Edgar Write");
        Person nick = new Person("Nick Frost");

        Person[] shawnOfTheDead = {simon, edgar, nick};

        for (Person actor : shawnOfTheDead){
            System.out.println(actor);
        }

        System.out.println(Arrays.toString(addPerson(shawnOfTheDead, new Person("Bill Nighy"))));

        System.out.println(Arrays.toString(addPerson(shawnOfTheDead, new Person("Peter Serafinowicz"))));

        ServerNameGenerator newServer = new ServerNameGenerator();
        System.out.println("Here is your server:");
        System.out.println(newServer.getName());


    }//End of main




}//End of Class
