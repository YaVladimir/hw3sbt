package ru.corp.yakovenko.comparators;

import java.util.Comparator;

/**
 * Created by Yakovenko on 26.08.2017.
 */
public class ComparatorByAlpha implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return (int) o1.toCharArray()[0] - (int) o2.toCharArray()[0];
    }
}
