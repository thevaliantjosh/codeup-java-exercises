package shapes;

public class Circle {
    private double radius;


    //getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }



    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference(){
        return Math.PI * 2 * radius;
    }

    //Constructors
    public Circle(){ //no arg constructor

    }
    public Circle(double radius){
        this.radius = radius;
    }
}
