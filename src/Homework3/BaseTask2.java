package Homework3;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BaseTask2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/treenite/IdeaProjects/homework_java_core/my_first_file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String text = "";
        while (fileReader.ready()) {
            char read = (char) fileReader.read();
            if (read != '\n') {
                text = text.concat(read + "");
            }
        }
            fileReader.close();
            bufferedReader.close();
            System.out.print(text);
    }
}
