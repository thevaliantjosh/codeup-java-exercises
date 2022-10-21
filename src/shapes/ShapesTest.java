package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        Rectangle box2 = new Square(5, 5);
//        System.out.println("The area of box1 is: " + box1.getArea());
//        System.out.println("The perimeter of box1 is: " + box1.getPerimeter());
////        box2.
//        System.out.println("The perimeter of box2 is: " + box2.getPerimeter());
//        System.out.println("The area of box2 is: " + box2.getArea());

        //Interface and Abstract Classes

        Measurable myShape = new Rectangle(12, 6);
        System.out.println("The area of myShape is: " + myShape.getArea());
        System.out.println("The perimeter of myShape is: " + myShape.getPerimeter());

        Measurable myShape2 = new Square(12, 12);
        System.out.println("The area of myShape2 is: " + myShape2.getArea());
        System.out.println("The perimeter of myShape2 is: " + myShape2.getPerimeter());

        //Calling the Widths and lengths for each shape

        System.out.println(myShape.getLength());
        System.out.println(myShape.getWidth());

    }
}
