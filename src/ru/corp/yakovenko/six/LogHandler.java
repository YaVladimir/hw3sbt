package ru.corp.yakovenko.six;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by 2 on 04.09.2017.
 */
public class LogHandler implements InvocationHandler {
    private final Object delegate;

    public LogHandler(Object delegate) {
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Started " + method.getName());
        Object result = method.invoke(delegate, args);
        System.out.println("Finished " + method.getName());
        return result;
    }
}
