import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
        int[] numbers; //Declare an array of integers called numbers;
        numbers = new int[5];//declaring there are 5 elements in the array
        numbers[0] = 78;
        numbers[1] = 253;
        numbers[2] = -23;
        numbers[3] = -789;
        numbers[4] = 36;
        System.out.println(numbers[0]);
        Arrays.sort(numbers); //This mutates the array
        System.out.println(numbers[0]);

        System.out.println(Arrays.toString(numbers));

        String[] wordsForWeird = {"Strange", "bizarre", "uncanny", "odd", "peculiar", "weird"};

        System.out.println(wordsForWeird[2]);

        for(String wordForWeird : wordsForWeird){
            System.out.println(wordForWeird);
        }

        for (int number : numbers){
            System.out.println(number);
        }

        for (int i = 0; i < numbers.length; i++){//when using a for loop you have access to the iterator
            //the element of the array is the name of the array[i] with open brackets i
            System.out.printf("The number at index %d is %d%n", i, numbers[i]);
        }

//Loop through the array newArray[i] = oldArray[i]
        //use copyOf

    }//End of main
}//End of class

