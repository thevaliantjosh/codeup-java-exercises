package animals;

public final class  Parrot extends Bird{

    public final static String order = "Psittaciformes";

    public void setName(String parrotName){
        super.name = parrotName;
    }

    public void makeNoise(){
        super.makeNoise();//goes into the super class(Bird) and pulls the makeNoise method
        System.out.println("When torrential water tosses boulders, it is because of it's momentum.");
    }

//    public void fly(){
//        System.out.println("flutter flutter");
//    }//You can't do this

    public void echo(String input){
        System.out.println(input);
    }

    public Parrot(){
//        super.makeNoise();
        System.out.println("A new Parrot just got constructed");
    }

}
