package ru.corp.yakovenko;

import ru.corp.yakovenko.comparators.ComparatorByAlpha;
import ru.corp.yakovenko.comparators.ComparatorByLength;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by Yakovenko on 26.08.2017.
 */
public class Task2 {
    private static final String FILE_NAME = "C:\\Users\\Yakovenko\\IdeaProjects\\SBTJavaSchool\\hw3\\res\\Test.txt";

    public static void main(String[] args) {
        List<String> inputStrings = null;
        Comparator<String> cbl = new ComparatorByLength().thenComparing(new ComparatorByAlpha());
        TreeSet<String> tSet = new TreeSet<>(cbl);

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
                    if (!s.equals("")) tSet.add(s);
                }
            }
        }

        for (String s : tSet) {
            System.out.println(s);
        }
        //System.out.println(tSet.size());
    }
}
