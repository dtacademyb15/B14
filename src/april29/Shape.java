package april29;

public  abstract class Shape {

    protected String color;
    protected boolean isFilled;

    protected Shape(){}
    protected Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    /**
     *  This method returns the area for a shape
     *  Implementation depends on the specific shape
     * @return
     */
    public abstract double getArea();

    /**
     *  This method returns the perimeter for a shape
     *  Implementation depends on the specific shape
     * @return
     */
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", isFilled=" + isFilled +
                '}';
    }
}
