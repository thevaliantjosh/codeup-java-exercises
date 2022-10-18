public class FighterTest {
    public static void main(String[] args) {

        Fighter fighter1 = new Fighter();

        fighter1.name = "Arata";
        fighter1.hitPoints = 17;
        fighter1.maxDamage = 14;

        //The below calls the printStats method, and inputs the fields
        fighter1.printStats();
        //The below calls the battle Roar, and inputs the name;
        fighter1.battleRoar();

        int fighter1attackRoll = fighter1.attackRoll();

        System.out.printf("%s attacks and rolls a %d%n", fighter1.name, fighter1attackRoll);

        //Creating a new Fighter

        Fighter fighter2 = new Fighter();
        fighter2.name = "Sozalix";
        fighter2.battleRoar();

        System.out.println(Club.maxDamage);

        Fighter fighter3 = new Fighter("Mason", 1, 500);
        fighter3.printStats();


    }
}
