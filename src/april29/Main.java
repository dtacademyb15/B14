package april29;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main
{


    public static void main(String[] args) {



//
//        Shape shape1 = ;

        List<Shape> shapes = List.of(
                new Rectangle("green", true, 3,5),
                new Circle("blue", true, 3.6),
                new Circle("white", false, 21.7),
                new Rectangle("red", true, 21,90)

        );


        for (Shape shape : shapes) {
            System.out.println( shape.getClass() + " Area: " + shape.getArea());
            System.out.println( shape.getClass() + " Perimeter: " + shape.getPerimeter());
            System.out.println("--------------------------------");
        }


//        Shape shape = new Shape(); //Shape is abstract; cannot be instantiated

//        Collections collections = new Collections();  // private constructor
//        Arrays collections = new Arrays();


        Shape[] shapes1 =  new Shape[3];

        System.out.println(getShapesPerimeter(new Circle("blue", true, 3.6)));

        System.out.println(getRandomShape());

        Shape shape1 = new Circle("blue", true, 3.6);

        changeShapeColorToBlack(shape1);

        System.out.println(shape1);





    }


    public static Shape getRandomShape(){
        List<Shape> shapes = List.of(
                new Rectangle("green", true, 3,5),
                new Circle("blue", true, 3.6),
                new Circle("white", false, 21.7),
                new Rectangle("red", true, 21,90)

        );
        return shapes.get(new Random().nextInt(shapes.size()));
    }

    public static void changeShapeColorToBlack(Shape shape){
        shape.setColor("black");
    }

    public static double getShapesPerimeter(Shape shape){
        return shape.getPerimeter();
    }

}
