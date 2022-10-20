package animals;

public class BirdTest {
    public static void main(String[] args) {
        Bird crow = new Bird();

        crow.setName("Dr. Crow");
        crow.makeNoise();
//        System.out.println(crow.getName() + " goes ");
//        crow.makeNoise();

        //We created a TweetyBird class, and it extends the Bird Class
        //We can then use all the methods of the Bird class
        //Are found in the TweetyBird Class

        TweetyBird goldfinch = new TweetyBird();
        goldfinch.makeNoise();

    }

}
