package may24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {




    public static List<List<String>> readCsv(String path){

        List<String> list = null;
        try {
            list = Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        List<List<String>> fileContent = new ArrayList<>();

        for (String eachLine : list) {
            String[] split = eachLine.split(",");
            List<String> eachRow = new ArrayList<>(Arrays.asList(split));
            fileContent.add(eachRow);
        }

        return fileContent;

    }
}
