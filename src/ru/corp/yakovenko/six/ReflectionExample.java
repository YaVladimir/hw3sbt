package ru.corp.yakovenko.six;


import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 2 on 04.09.2017.
 */
public class ReflectionExample {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {

        List<String> strings = (List<String>)
                Proxy.newProxyInstance(
                        ClassLoader.getSystemClassLoader(),
                        new Class[]{List.class},
                        new LogHandler(new ArrayList<String>())
                );
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        strings.remove("Second");
        /*for (String s : strings) {
            System.out.println(s);
        }*/
    }
}
