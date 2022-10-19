import java.util.Arrays;

public class ArraysExercises {
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

//        Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

//        int[] combineNumbersArrays = new int[20];
//        System.arraycopy(anArray, 0, combineNumbersArrays, 0, 10);
//        System.out.println(combineNumbersArrays.length);
//        System.out.println(Arrays.toString(combineNumbersArrays));


    }//End of main

    public static Person[] addPerson(Person[] personArray,  Person newPerson){

        Person[] newArrayOfPeople = new Person[personArray.length + 1];

        System.arraycopy(personArray, 0, newArrayOfPeople, 0, personArray.length);
        newArrayOfPeople[newArrayOfPeople.length -1] = newPerson;
//        System.arraycopy(newPerson, 0, newArrayOfPeople, newArrayOfPeople.length -1, 0);
        return newArrayOfPeople;
    }
}//End of Class
