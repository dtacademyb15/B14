package day9;

public class ComparisonMethodsString {

    public static void main(String[] args) {

        String str = "Leo loves burgers";


        boolean leoLovesBurger = str.equals("Leo loves burger");

        System.out.println(leoLovesBurger);

        System.out.println(str.equalsIgnoreCase("leo LOVES Burgers"));
        // Never use == to compare Strings
        // == when used with Strings, compares the memory location of the objects

        String str1 = new String("Hello");
        String str2 = "Hello";

//        if(str1 == str2){
        if(str1.equals(str2)){
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }
        int difference = "abc".compareTo("bbc");
        System.out.println("abc".compareTo("bbc"));
        System.out.println("bbc".compareTo("abc"));
        System.out.println("aaad".compareTo("aaae"));

        if(str.startsWith("Leo")){

        }

        System.out.println(str.startsWith("leo"));
        System.out.println(str.startsWith("Leo l"));
        System.out.println(str.endsWith("ers"));
        System.out.println(str.contains("s b"));
        System.out.println(str.contains("loves bur"));



    }
}
