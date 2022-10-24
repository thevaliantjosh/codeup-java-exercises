import rpg.Monster;

import java.util.*;

import static java.util.Map.entry;
import static java.util.Map.ofEntries;

public class HashMapsLecture {
    public static void main(String[] args) {

        //Create Monster Objects
        Monster orc = new Monster(13, 15, 9, "Orc");
        Monster ogre = new Monster(11, 59, 13, "Ogre");
        Monster blueDragon = new Monster(19, 225, 23, "Blue Dragon");
        Monster frostGiant = new Monster(15, 138, 25, "Frost Giant");
        Monster goblin = new Monster(15, 7, 5, "Goblin");
        Monster werewolf = new Monster(11, 58, 7, "Werewolf");
        Monster orcWarChief = new Monster(16, 93, 15, "Orc War Chief");

        //Create a new HashMap defining the key and value data types
        //between angle brackets
        HashMap<String, Monster> monsterHashMap = new HashMap<>();


        //Add a key-value pair to the hashmap using .put();
        monsterHashMap.put("orc", orc);

        //Access a value in the hashmap using .get() with the key
        System.out.println(monsterHashMap.get("orc"));
        System.out.println(monsterHashMap.get("orc").getHitPoints());

        //Replace a value in the hashmap using .replace()
        monsterHashMap.replace("orc", orcWarChief);

        System.out.println(monsterHashMap.get("orc"));
        System.out.println(monsterHashMap.get("orc").getHitPoints());


        //To add multiple objects to a HashMap at once
        //use Map.ofEntries
        Map<String, Monster> intermediateMap = Map.ofEntries(
                entry("blue dragon", blueDragon),
                entry("ogre", ogre),
                entry("werewolf", werewolf),
                entry("frost giant", frostGiant),
                entry("goblin", goblin),
                entry("orc war chief", orcWarChief)
        );

        monsterHashMap.putAll(intermediateMap);

        //Getting the monsters
        System.out.println(monsterHashMap.get("frost giant"));

        //Looping over a HashMap. Technique 1:
        //use .entrySet to derive a set of entries
        //Each entry is represented as a Map.Entry<DataTypeOfKey, DataTypeOfValue>
        //Once you have an entrySet you can use an enhanced for Loop to loop over it
        System.out.println("-------Loop over Entry set------------");
        for(Map.Entry<String, Monster> monsterEntry : monsterHashMap.entrySet()){
            Monster monster = monsterEntry.getValue();
            System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        }

        //Technique 2:


        //To crate a List of specific properties in the objects
        //stored as HashMap value, we can use .keySet().stream().toList()

        List<String> monsterNames = new ArrayList<>(monsterHashMap.keySet().stream().toList());

        //Once I've got a list, I can sort it and do other list things to it
        Collections.sort(monsterNames);
        System.out.println(monsterNames);//This produces an array of keys to the HashMap

        //Looping over this list allows access to all the HashMap entries
        System.out.println("-----Loop Over Keyset converted to list------");
        for (String monsterName : monsterNames){
            Monster monster = monsterHashMap.get(monsterName);
            System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        }


        //Technique 3: the forEach loop
        System.out.println("-----forEach Loop-------");
        monsterHashMap.forEach((key, monster) -> {
            System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        });

        //Converting HashMap into a TreeMap

        Map<String, Monster> monsterTreeMap = new TreeMap<>(monsterHashMap);
        System.out.println("--------Output of forEach over the TreeMap------");
        monsterTreeMap.forEach((key, monster) ->{
            System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        });

        //Use the collection toArray() method to convert a collection of
        //HashMap values into an array of objects
        //Each Value is a HashMap is an object
        //Using .values().toArray() we can create an array of objects

        Object[] monstersArray = monsterHashMap.values().toArray();
        for(Object monster : monstersArray){
            int hitPoints = ((Monster) monster).getHitPoints();
            System.out.println(hitPoints);
        }

        Monster[] monstersArray2 = monsterHashMap.values().toArray(new Monster[0]);
        for (Monster monster : monstersArray2){
            System.out.println(monster.getName() + " has " + monster.getHitPoints() + " hit points");
        }



    }
}
