package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    void setLength(int length) {
        this.length = length;
    }

    @Override
    void setWidth(int width) {
        this.width = width;
    }


    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
    //Variables
//
//
//    protected int length;
//    protected int width;
//
//
//    //Getters and Setters
//    public void setLength(int length){
//        this.length = length;
//    }
//
//    public int getLength(){
//        return length;
//    }
//
//    public void setWidth(int width){
//        this.width = width;
//    }
//
//    public int getWidth(){
//        return width;
//    }
//
//
//
//    //Constructors
//    public Rectangle(){
//
//    }
//
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//
//    //Methods
//
//    public double getArea(){
//        return this.getLength() * this.getWidth();
//    }
//
//    public int getPerimeter(){
//        return 2 * this.getLength() + 2 * this.getWidth();
//    }


}
