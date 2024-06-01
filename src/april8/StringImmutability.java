package april8;

public class StringImmutability {


    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("hello world");

        sb.append("bye");
        System.out.println(sb);
        sb.replace(0,2, "she");
        System.out.println(sb);
        sb.delete(sb.length()-5, sb.length());

        System.out.println(sb);



        String str =  new String("hello world");

        str.concat("bye");
        System.out.println(str);
        str.replace("he", "she");
        System.out.println(str);
        str.replace("ldbye", "");

        System.out.println(str);

        StringBuilder accumulate = new StringBuilder();

        for (int i = str.length()-1; i >0 ; i--) {
            accumulate.append(str.charAt(i));
//            System.out.println(accumulate);
        }

    }



}
