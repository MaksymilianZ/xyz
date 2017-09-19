package pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Maksymilian on 2017-02-12.
 */
public class FileMessageProducer implements MessageProducer {
    @Override
    public String getMessage() {
        List<String> lines = null;
        Path path = FileSystems.getDefault().getPath("src", "message.txt");
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String result = "";
        if (lines != null) {
            result = lines.stream().reduce(result, (a,b) -> a+b);
        }
            return result;
    }
}