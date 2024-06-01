package may1;

public class Bird extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }

    @Override
    public void move() {
        System.out.println("Fly");
    }
}
