package animals;

public class TweetyBird extends Bird{//extends, or inherits, form another class
    //the extends keyword in the class definition.
    //We can override the bird sound here: makeNoise();
    //Overriding: a subclass redefines onf ot its inherited methods
    //when it needs to change or extend the behaviour of that method
    public void makeNoise(){
        System.out.println("Tweet Tweet");
    }

}
