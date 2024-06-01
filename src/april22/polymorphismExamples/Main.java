package april22.polymorphismExamples;

public class Main {


    public static void main(String[] args) {

//        Fruit fruit = new Apple();   //polymorphism in assignment

//        doSomethingWithFruit(new Apple()); // polymorphism in method parameter
//        doSomethingWithFruit(new Banana());


//        Apple[] apples =  {new Apple(), new Apple(), new Apple(), new Banana()};
        Fruit[] fruits =  new Fruit[]{ // polymorphism in collections
                new Apple(),
                new Banana(),
                new Orange(),
                new Orange(),
                new Orange()
        };

        for (Fruit fruit  :  fruits){
            fruit.eat();
            System.out.println(fruit.getClass()); // when you want to know the actual class behind the scenes
            System.out.println("-----------------");
        }

    }




    public static void doSomethingWithFruit(Fruit fruit){
        fruit.eat();
    }
}
