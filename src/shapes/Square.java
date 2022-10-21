package shapes;

public class Square extends Rectangle{
    //constructor
    public Square(){

    }

    public Square(int side){
        super(side, side);
    }

    //Methods

    public int getPerimeter(){
        int side = getLength();
        return 4 * side;
    }

    public double getArea(){
        int side = getLength();
        return Math.pow(side, 2);
    }
}
