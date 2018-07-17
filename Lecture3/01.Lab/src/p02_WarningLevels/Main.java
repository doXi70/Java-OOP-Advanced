package p02_WarningLevels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Logger logger = new Logger(Enum.valueOf(Importance.class, reader.readLine()));

        String line;
        while (!"END".equals(line = reader.readLine())) {
            String[] tokens = line.split(" ", 2);
            logger.addMessage(
                    new Message(Enum.valueOf(Importance.class, tokens[0].replace(":", "")), tokens[1]));
        }

        logger.getMessages().forEach(System.out::println);
    }
}
