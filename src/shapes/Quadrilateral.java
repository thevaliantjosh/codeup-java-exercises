package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{

    protected int length;
    protected int width;

//A four sided figure
    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    //Abstract methods
    abstract void setLength(int length);
    abstract void setWidth(int width);

//    @Override
//    public double getPerimeter() {
//        return 2 * length + 2 * width;
//    }
//
//    @Override
//    public double getArea() {
//        return length * width;
//    }
}
