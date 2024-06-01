package may1;













public class Chicken extends Animal implements Edible,Consumable  {
    @Override
    public void howToEat() {
        String st;
        System.out.println("make a chipotle chicken");
    }




    @Override
    public void makeSound() {
        System.out.println("Cluck");
    }

    @Override
    public void move() {
        System.out.println("Roam around");
    }
}
