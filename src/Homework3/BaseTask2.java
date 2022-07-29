package Homework3;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BaseTask2 {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader(" \\Users\\treenite\\IdeaProjects\\homework_java_core\\my_first_file.txt");
         while (fileReader.ready()) {
             char read = (char) fileReader.read();
             System.out.print(read + " ");
         }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
         while (bufferedReader.ready()) {
             bufferedReader.readLine();
             System.out.println(Line);
         }

    }
}
