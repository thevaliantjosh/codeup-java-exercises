public class Fighter {
    public String name;

    public int hitPoints;

    public int maxDamage;

    public void printStats(){
        System.out.printf("%s has %d hit points and can do %d damage%n", name, hitPoints, maxDamage);
    }

    public void battleRoar(){
        System.out.printf("I am %s and I will destroy you!%n", name);
    }

    public int attackRoll(){
        return D20.rollD20();
    }

    public Fighter(){

    }

    public Fighter(String name, int hitPoints, int maxDamage){
        System.out.println("A new fighter has emerged");
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
    }

}
