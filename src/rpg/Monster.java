package rpg;

public class Monster {
    private int armorClass;
    private int hitPoints;
    private int damage;
    private String name;

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }

    public Monster(){}

    public Monster(int armorClass, int hitPoints, int damage, String name) {
        this.armorClass = armorClass;
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.name = name;
    }
}
