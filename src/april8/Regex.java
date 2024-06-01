package april8;

import java.util.Arrays;

public class Regex {

    public static void main(String[] args) {


        // Hello.* -> starts with "Hello"
        // .*bye -> ends with "bye"
        // .*good.* -> contains "good"

        System.out.println("Hello World".matches("Hello.*"));
        System.out.println("Goodbye".matches(".*bye"));
        System.out.println("briangoodman".matches(".*good.*"));

        // 123-23-3456
        // [0-9]
        String ssnPattern = "\\d{3}-\\d{2}-\\d{4}";

        String ssn = "123-34-2332";

        if(ssn.matches(ssnPattern)){
            System.out.println("SSN is valid");
        }else{
            System.out.println("SSN is invalid");
        }

        // Check is a string starts with uppercase letter

        System.out.println("Brian".matches("[A-Z].*")); //uppercase chars
        System.out.println("oh".matches("[a-z].*")); //lowercase chars
        System.out.println("12h".matches("[0-9].*")); //numbers

        System.out.println("98".matches("[0-9][0-9]")); //2 digit
        System.out.println("&rounds".matches("[^a-z].*"));

        // Password with at least one uppercase, one lowercase, one symbol, at least 8 chars

        String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\\$%\\^&\\*]).{8,}$";

        // +1 ( )
        String pass = "Hello4World$";
        if(pass.matches(passwordPattern)){
            System.out.println("Password is valid");
        }

        String message = "Hello world,bye:universe; hi.everyone";

        String[] split = message.split("[ ,.:;]");

        System.out.println(Arrays.toString(split));


        String text = "hello6wor8ld,9by2universe;";

        text = text.replaceAll("[0-9]", "A");

        System.out.println(text);

        String price = "$1,234,456.89";

        price = price.replaceAll("[$,]", "");

        System.out.println(price);

        System.out.println("$$$123".replaceFirst("\\$", ""));


    }
}
