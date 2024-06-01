package may24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public class FileRead {


    public static void main(String[] args) throws IOException {


        List<String> fileContent = Files.readAllLines(Path.of("src/may24/passwords.txt"));
        fileContent.forEach(System.out::println);

        String s = Files.readString(Path.of("src/may24/novel.txt"));

        System.out.println(s);

        LocalDate parse = LocalDate.parse("2024-04-12");

        System.out.println(parse);


    }
}
