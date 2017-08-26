package ru.corp.yakovenko;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class Task3 {
    private static final String FILE_NAME = "C:\\Users\\Yakovenko\\IdeaProjects\\SBTJavaSchool\\hw3\\res\\Test.txt";

    public static void main(String[] args) {
        List<String> inputStrings = null;
        HashMap<String, Integer> map = new HashMap<>();
        try {
            inputStrings = Files.readAllLines(Paths.get(FILE_NAME), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Pattern pattern = Pattern.compile("[0-9]+|\\W");
        if (inputStrings != null) {
            for (String string : inputStrings) {
                String[] strings = pattern.split(string);
                for (String s : strings) {
                    if (map.containsKey(s)) {
                        int i = map.get(s);
                        map.remove(s);
                        map.put(s, ++i);
                    } else
                        map.put(s, 1);
                }
            }
        }
        map.remove("");
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(map.size());
    }
}
