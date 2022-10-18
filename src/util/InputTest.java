package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
//        Input confirm = new Input();
        System.out.printf("Your sentence was: %s%n", input.getString());
        System.out.printf("Your confirmation was: %b%n", input.yesNo());
        System.out.printf("You nailed it! Your number was %d%n", input.getInt(5, 50));

        System.out.printf("Your number was %d%n", input.getInt());

        System.out.printf("You nailed it! Your number was %.2f%n", input.getDouble(1.25, 50.55));

        System.out.printf("Your number was %.5f%n", input.getDouble());
    }
}
