package may24;

import java.io.File;
import java.io.IOException;

public class RelativeVSAbsolute


{

    public static void main(String[] args) throws IOException {


//        File file = new File("/Users/duotech/IdeaProjects/B14/src/may24/absolute.txt");

//        String absolute = System.getProperty("user.dir") + "/src/may24/absolute.txt";
//        System.out.println(absolute);
//        File file = new File(absolute );

        File file = new File("src/may24/relative.txt");
        file.createNewFile();






    }

}
