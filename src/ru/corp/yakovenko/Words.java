package ru.corp.yakovenko;

import java.util.Iterator;

/**
 * Created by Yakovenko on 26.08.2017.
 */
/*
public class Words<String> implements Iterable<String> {
    private String[] strings;
    private int currentSize;

    public Words(String[] strings) {
        this.strings = strings;
        this.currentSize = strings.length;
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> iterator = new Iterator<String>() {
            private int currentIndex = currentSize - 1;

            @Override
            public boolean hasNext() {
                return currentIndex != 0 && strings[currentIndex] != null;
            }

            @Override
            public String next() {
                return strings[currentIndex--];
            }
        };
        return iterator;
    }
}
*/
public class Words<String> implements Iterable<String> {
    private String[] strings;
    private int currentSize;

    public Words(String[] strings) {
        this.strings = strings;
        this.currentSize = strings.length;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int currentIndex = currentSize;

            @Override
            public boolean hasNext() {
                return currentIndex != 0 && strings[currentIndex] != null;
            }

            @Override
            public String next() {
                return strings[--currentIndex];
            }
        };
    }
}