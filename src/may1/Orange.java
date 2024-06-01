package may1;

public class Orange extends Fruit implements Commercializable{

   // Interfaces have 2 advantages over abstract classes:
    // - any related or unrelated class can implement an interface
    // Ex: Orange and Chicken implementing Edible
    // - classes can implement multiple interfaces at once which is not possible with abtract classes
    //


    @Override
    public void howToEat() {
        System.out.println("Make orange juice");
    }

    @Override
    public void makeMoney() {
        System.out.println("Sell orange juice");
    }

    @Override
    public void market() {
        System.out.println("Creating an ad on TV");
    }
}
