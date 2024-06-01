package april29;

public class Circle extends Shape{

    private double radius;


    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    public double getArea(){
        return Math.PI * radius *radius;
    }

    public double getPerimeter(){
        return 2* Math.PI * radius;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }



}
