package ru.corp.yakovenko;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Yakovenko on 26.08.2017.
 */
public class Task6 {
    private static final String FILE_NAME = "C:\\Users\\Yakovenko\\IdeaProjects\\SBTJavaSchool\\hw3\\res\\Test.txt";

    public static void main(String[] args) {
        List<String> inputStrings = null;

        try {
            inputStrings = Files.readAllLines(Paths.get(FILE_NAME), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Pattern pattern = Pattern.compile("[0-9]+|\\W");
        if (inputStrings != null) {
            int chose = 1;
            Scanner in = new Scanner(System.in);
            while (chose != 0) {
                System.out.println("If you want choose string's numbers enter 1");
                System.out.println("If you want end enter 0");
                chose = in.nextInt();
                switch (chose) {
                    case 1:
                        System.out.println("Enter count of string from 1 to " + inputStrings.size());
                        int count = in.nextInt();
                        int[] numbers = new int[count];
                        System.out.println("Enter " + count + " string's numbers from 1 to " + inputStrings.size());
                        for (int i = 0; i < count; i++)
                            numbers[i] = in.nextInt();
                        for (int i = 0; i < count; i++)
                            System.out.println(inputStrings.get(numbers[i] - 1) + "\n");
                        break;
                    case 0:
                        break;
                }
            }
        }
    }
}
