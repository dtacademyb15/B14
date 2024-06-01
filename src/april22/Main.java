package april22;

import april15.constructorChaining.Super;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

     //   Supertype reference =  subtype object
 //       Animal animal   =        new Bird();

    //   Declared type           Actual type
 //       Animal animal   =        new Bird();

        // Actual type determines which method to be called





        System.out.println("Enter your animal:");
        String userInput = new Scanner(System.in).next();

        Animal animal;

        if (userInput.equals("bear")){
            animal = new Bear();
        }else if (userInput.equals("bird")){
            animal = new Bird();
        }else {
            animal = new Snake();
        }


        animal.eat();
        animal.move();
        animal.sleep();


//        if(userInput.equals("bear")){
//            Bear bear = new Bear();
//            bear.eat();
//            bear.move();
//            bear.sleep();
//        } else if (userInput.equals("bird")) {
//            Bird bird = new Bird();
//            bird.eat();
//            bird.move();
//            bird.sleep();
//        }else {
//            Snake snake = new Snake();
//            snake.eat();
//            snake.move();
//            snake.sleep();
//        }







//

    }
}
