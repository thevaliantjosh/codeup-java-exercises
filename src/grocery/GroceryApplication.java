package grocery;

import util.Input;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroceryApplication {
    public static ArrayList<String> generateCategories(){
        ArrayList<String> categories = new ArrayList<>(List.of(
                "dairy",
                "meat",
                "fish",
                "fruit",
                "vegetable",
                "beverage",
                "snack",
                "dessert",
                "grains",
                "canned",
                "frozen"
        ));
        Collections.sort(categories);
        return categories;
    }



    public static void main(String[] args) {
        //Prompt the User if they would like to create a grocery List
        Input input = new Input();//Instantiate Input from the Input class
        boolean userChoice = input.yesNo("Would you like to create a Grocery List? [yes/No]");

        if(userChoice){
            ArrayList<String> categories = generateCategories();
            boolean enterNewItem = input.yesNo("Would you like to enter a new item? [yes/No]");

            if(enterNewItem){
                //Logic for when the user Enters Yes
                System.out.println("Choose a category: ");
                for(int i = 0; i < categories.size(); i++){
                    if(i == categories.size() -1){
                        System.out.printf("or %s.%n", categories.get(i));
                    } else if(i == categories.indexOf("beverage")){
                        System.out.printf("\t %s", categories.get(i));
                    }else{
                        System.out.printf("%s, ", categories.get(i));
                    }
                }
            }//End of enterNewItem
        }//End of UserChoice

    }//End of Main
}//End of Class
