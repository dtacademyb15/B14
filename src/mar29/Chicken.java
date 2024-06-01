package mar29;

public class Chicken {

    int instanceCount;
    static int staticCount;

    public Chicken(){
        instanceCount++;
        staticCount++;
    }

    public static void main(String[] args) {
         Chicken chicken1 = new Chicken();
         Chicken chicken2 = new Chicken();
         Chicken chicken3 = new Chicken();
         Chicken chicken4 = new Chicken();

        System.out.println(chicken4.instanceCount); //1
        System.out.println(chicken4.staticCount); //4

    }
}
