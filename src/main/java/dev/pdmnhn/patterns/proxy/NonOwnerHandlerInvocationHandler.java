package dev.pdmnhn.patterns.proxy;

import java.lang.reflect.*;

public class NonOwnerHandlerInvocationHandler implements InvocationHandler {
    private final Person person;

    public NonOwnerHandlerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else if (method.getName().equals("setGeekRating")) {
                return method.invoke(person, args);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException exception) {
            exception.printStackTrace();
        }
        return null;
    }
}
