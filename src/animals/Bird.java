package animals;

abstract public class Bird {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("caw caw");
    }

    public final void fly(){
        System.out.println("flap flap");
    }

    //Polymorphic Argument definition
    public static void birdSounds(Bird[] birdsArray){
        for (Bird bird : birdsArray){
            bird.makeNoise();
        }
    }

    public Bird(){
        super();
        System.out.println("A Bird just got constructed");
    }

}
