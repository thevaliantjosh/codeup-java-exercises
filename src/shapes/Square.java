package shapes;

public class Square extends Quadrilateral{
    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    void setLength(int length) {
        this.length = length;
        this.width = length;
    }

    @Override
    void setWidth(int width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }




    //constructor
//    public Square(){
//
//    }
//
//    public Square(int side){
//        super(side, side);
//    }
//
//    //Methods
//
//    public int getPerimeter(){
//        int side = getLength();
//        return 4 * side;
//    }
//
//    public double getArea(){
//        int side = getLength();
//        return Math.pow(side, 2);
//    }
}
