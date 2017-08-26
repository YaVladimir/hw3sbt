package ru.corp.yakovenko;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Yakovenko on 26.08.2017.
 */
public class Task5 {
    private static final String FILE_NAME = "C:\\Users\\Yakovenko\\IdeaProjects\\SBTJavaSchool\\hw3\\res\\Test.txt";

    public static void main(String[] args) {
        List<String> inputStrings = null;

        try {
            inputStrings = Files.readAllLines(Paths.get(FILE_NAME), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Pattern pattern = Pattern.compile("[0-9]+|\\W");
        if (inputStrings != null) {
            for (String string : inputStrings) {
                Words words = new Words(pattern.split(string));
                Iterator iterator = words.iterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next() + " ");
                }
                System.out.println();
            }
        }
    }
}
