package animals;

public class BirdTest {

    public static String argumentativeOrnithologist(String classification, String newClassification){
        String oldName = classification;
        classification = newClassification;
//        Parrot.order = classification;//can't do this
        return oldName + " is now " + newClassification;
    }
    public static void main(String[] args) {
//        Bird crow = new Bird();
//
//        crow.setName("Dr. Crow");
//        crow.makeNoise();
//        System.out.println(crow.getName() + " goes ");
//        crow.makeNoise();

        //We created a TweetyBird class, and it extends the Bird Class
        //We can then use all the methods of the Bird class
        //Are found in the TweetyBird Class

//        TweetyBird goldfinch = new TweetyBird();
//        goldfinch.makeNoise();

//        Parrot parrot = new Parrot();
//        parrot.makeNoise();
//        parrot.echo("Yeeeeehawww");


//        Bird parrot2 = new Parrot();//Creating an object of type Bird
        //but using the data type of Bird
        //parrot2 will only have the methods fo a Bird
        //it cannot echo like the class of Parrot
//        parrot2.makeNoise();

        //Example of polymorphism: a polymorphic array
//        Bird[] birds = new Bird[3];
//
//        birds[0] = new Finch();
//        birds[0].setName("Lesser Golfinch");
//        birds[1] = new Parrot();
//        birds[1].setName("Polly");
//        birds[2] = new TweetyBird();
//        birds[2].setName("TweetyBird");

//        for(Bird bird : birds){
//            bird.makeNoise();
//        }

        //How to get the parrots echo back;
//        Parrot backToParrot = (Parrot) birds[1];
//        backToParrot.echo("I can echo now");
//        System.out.println(backToParrot.getName());
//
//        Bird.birdSounds(birds);

        Parrot parrot = new Parrot();

        parrot.makeNoise();

        parrot.setName("Polly");
        System.out.println(parrot.name);

        System.out.println(Parrot.order);

        System.out.println(argumentativeOrnithologist("Psittaciformes", "Sphenisciformes"));


    }

}
