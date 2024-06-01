package may24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class FileWrite {


    public static void main(String[] args) throws IOException {


       // To create a unique id
      // Use Random/ThreadLocalRandom class
        ThreadLocalRandom random = ThreadLocalRandom.current();
        long l = random.nextLong(100000000000000000L);

        System.out.println(l);

        //Use System.currentTimeMillis();

       long unique = System.currentTimeMillis();
        System.out.println(unique);

        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
        System.out.println(uuid.toString().replace("-", ""));


        List<String> passwords = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            passwords.add(UUID.randomUUID().toString());
        }

        System.out.println(passwords);

        Files.write(Path.of("src/may24/passwords.txt"), passwords);
        Files.writeString(Path.of("src/may24/novel.txt"), "Once upon a time...");



    }
}
