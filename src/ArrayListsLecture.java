import rpg.Monster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListsLecture {
    public static void main(String[] args) {
        ArrayList<Monster> monsterArrayList = new ArrayList<>();

        Monster orc = new Monster(13, 15, 9, "Orc");
        Monster ogre = new Monster(11, 59, 13, "Ogre");
        Monster blueDragon = new Monster(19, 225, 23, "Blue Dragon");
        Monster frostGiant = new Monster(15, 138, 25, "Frost Giant");
        Monster goblin = new Monster(15, 7, 5, "Goblin");
        Monster werewolf = new Monster(11, 58, 7, "Werewolf");
        //Adding objects to the array list with .add();
        monsterArrayList.add(orc);
        monsterArrayList.add(ogre);

        //Using the size property
        System.out.println(monsterArrayList.size());//prints 1; after adding the ogre prints 2

        //Getting something out of the Array List
        System.out.println(monsterArrayList.get(0).getName());//Putting the index of the first object as (0);
        System.out.println(monsterArrayList.get(1));
        System.out.println(monsterArrayList.get(1).getArmorClass());
        System.out.println(monsterArrayList);

        //Interface polymorphism
        //How to add multiple objects to a brand new ArrayList all at once.
        List<Monster> newMonsterList = new ArrayList<>(List.of(goblin, blueDragon, frostGiant, werewolf));

        System.out.println(newMonsterList);

        System.out.println(newMonsterList.get(1));
        System.out.println(newMonsterList.get(1).getHitPoints());


        //We can add all the elements of one array list to another array list
        //using the .addAll method
//        monsterArrayList.addAll(newMonsterList);
        //Adding things to an existing arrayList all at once.
        monsterArrayList.addAll(new ArrayList<>(List.of(goblin, blueDragon, frostGiant, werewolf)));

        System.out.println(monsterArrayList);

        newMonsterList = monsterArrayList;

//        System.out.println(monsterArrayList);
//        System.out.println(newMonsterList);

        //Loop over arrayList
        //traditional for loop
        //to get to an element, you use .get(then the index)
        for (int i= 0; i < monsterArrayList.size(); i++){
            if (i == monsterArrayList.size() -1){
                System.out.printf("%s%n", monsterArrayList.get(i));
            } else{
                System.out.printf("%s, ", monsterArrayList.get(i));
            }
        }

        //Enhanced for loop

        for (Monster monster : monsterArrayList){
            System.out.println(monster.getHitPoints());
        }

        //When creating an ArrayList of primitive data types, use the corresponding Object Wrapper. ArrayLists can only contain objects.
        ArrayList<Integer> myNumbers = new ArrayList<>(List.of(5, 9, 34, -67, 98, 23));

        System.out.println(myNumbers);

        //Sorting an ArrayList with Collections.sort().
        Collections.sort(myNumbers);
        System.out.println(myNumbers);

        //An array list of Strings

        ArrayList<String> randomWords = new ArrayList<>(List.of("version", "suntan", "bond", "defeat", "later", "rate"));
        System.out.println(randomWords);

        //We can use Collections.sort to sort arrayLists that contain numbers or strings
        //The will be sorted in ascending "natural" order

        Collections.sort(randomWords);
        System.out.println(randomWords);

        //Sorting the monsters
        //Comparator is a set of instructions on how to compare
        //.comparing uses a method to an object
        //works on any getter
        //Comparing Monsters by hitPoints, uses Monster::getHitPoints
        monsterArrayList.sort(Comparator.comparing(Monster::getHitPoints));
        System.out.println(monsterArrayList);

        //Ordering from highest hitPoints to the lowest
        System.out.println(monsterArrayList);
//        monsterArrayList.sort(Collections.reverseOrder());
        System.out.println(monsterArrayList);

        //If I want to sort custom objects by properties in reverse order

        //To use the compare() method that we wrote in the Monster class
        //Use the sort method and pass it a no-arg constructor

        monsterArrayList.sort(new Monster());
        System.out.println(monsterArrayList);

    }//End of Main
}//End of Class
