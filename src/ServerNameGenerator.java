import java.util.Random;

public class ServerNameGenerator {
    public String[] adjectives = {"Valiant", "Illustrious", "Dedicated", "Adventurous", "Bewildered", "Bloody", "Awful", "Bewildered", "Tenacious", "Enigmatic"};

    public String[] nouns = {"Bigfoot", "Yeti", "Snorlax", "Jedi", "Zombie", "Extraterrestrial", "Phantom", "Warrior", "Wizard", "Jambalaya"};

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String randomElement(String[] stringArray){
        Random random = new Random();
        int ranIndexOfArray = random.nextInt(stringArray.length);
        //getting the value of the element at that index;

        return stringArray[ranIndexOfArray];
    }

    public ServerNameGenerator(){
        String adjective = randomElement(adjectives);
        String noun = randomElement(nouns);
        String combined = adjective + "-" + noun;
        this.name = combined;
    }

//    public static void main(String[] args) {
//        System.out.printf("Here is your server name: %n%s-%s", randomElement(adjectives), randomElement(nouns));
//    }


}
