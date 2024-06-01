package may24;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ExceptionDemo {

    public static void main(String[] args) throws IOException {


       File file  = new File("hello.txt");
       file.createNewFile();

        List<String> list = List.of("Acdsv", "dsd", "dsdsds");
        Files.write(Path.of("passwords.txt"), list);


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("pass.txt"));

        for (int i = 0; i < 10; i++) {
            bufferedWriter.write("dssds");
            bufferedWriter.newLine();
        }

        bufferedWriter.close();



//       file.delete();


    }
}
