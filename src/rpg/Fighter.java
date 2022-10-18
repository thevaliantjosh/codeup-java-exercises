package rpg;

import rpg.D20;

public class Fighter {
    //Instance Variables
    //If you do not declare it has public, by defualt it is the local package
    //If you set the visibility type to private
    //You need to set getters and setters
    private String name;

   private int hitPoints;

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //This is a setter
   public void setHitPoints(int hitPoints){
       /*if (hitPoints > 0) {....set hitPoints}
       * */
       this.hitPoints = hitPoints;
   }

   //getter -- set to public

    public int getHitPoints(){
       return hitPoints;
    }

    private int maxDamage;

    //Instance Methods

    public void printStats(){
        System.out.printf("%s has %d hit points and can do %d damage%n", name, hitPoints, maxDamage);
    }

    public void battleRoar(){
        System.out.printf("I am %s and I will destroy you!%n", name);
    }

    public int attackRoll(){//Attack roll in an instance method, but it calls a static method
        //notice it is lowerCased.
        return D20.rollD20();//All class names are "Capitalized"
    }

    public Fighter(){//This is a constructor//it has the same name as the class that it is in
        //This has one purpose, to construct on object from its class properties
        //This is known as a no arg constructor empty ().

    }

    //Overloaded Constructor
    public Fighter(String name, int hitPoints, int maxDamage){
        System.out.println("A new fighter has emerged");
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
    }

}
