package conditionals;

public class LogicalOR {

    public static void main(String[] args) {


        char ch = 'x';

        // vowel -> aieou
        if(     ch == 'a'||
                ch == 'i'||
                ch == 'o'||
                ch == 'u'||
                ch == 'e'

          ){
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }


    }
}
