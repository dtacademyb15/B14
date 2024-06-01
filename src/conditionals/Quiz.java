package conditionals;

public class Quiz {


    public static void main(String[] args) {

        // Valid main method syntax:
//        public final static void main(String[] args) {
//        public static void main(String... args) {
//



            int pterodactyl = 6;
        int triceratops = 3;

        if(pterodactyl % 3 >= 1)
            triceratops++;
            triceratops--;


        System.out.println(triceratops);

        String flag = "true";
        switch (flag){
            case "true" :
                System.out.println("True");
            default:
                System.out.println("False");
        }
    }
}
