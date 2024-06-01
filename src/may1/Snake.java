package may1;

public class Snake extends Animal{
    @Override
    public void makeSound() {
        System.out.println("hiss");
    }

    @Override
    public void move() {
        System.out.println("Crawl");
    }
}
