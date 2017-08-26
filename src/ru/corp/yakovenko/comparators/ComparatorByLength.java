package ru.corp.yakovenko.comparators;

import java.util.Comparator;

/**
 * Created by Yakovenko on 26.08.2017.
 */
public class ComparatorByLength implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

}
