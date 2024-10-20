package dev.pdmnhn.patterns.proxy;

import java.lang.reflect.Proxy;

public class ProxyTestDrive {
    public static void main(String[] args) {
        Person person = new PersonImpl();
        Person ownerProxy = getOwnerProxy(person);
        Person nonOwnerProxy = getNonOwnerProxy(person);

        ownerProxy.setName("Person1");
        ownerProxy.setGender("Male");
        ownerProxy.setInterests("Coding");
        try {
            ownerProxy.setGeekRating(10);
        } catch (RuntimeException e) {
            System.out.println("This is not allowed");
        }

        nonOwnerProxy.setGeekRating(10);
        try {
            nonOwnerProxy.setName("Person2");
        } catch (RuntimeException e) {
            System.out.println("This is not allowed");
        }
        try {
            nonOwnerProxy.setGender("Female");
        } catch (RuntimeException e) {
            System.out.println("This is not allowed");
        }
        try {
            nonOwnerProxy.setInterests("Singing");
        } catch (RuntimeException e) {
            System.out.println("This is not allowed");
        }

        System.out.println(ownerProxy.getName() + " " + ownerProxy.getGender() + " " + ownerProxy.getInterests() + " "
                + ownerProxy.getGeekRating());
        System.out.println(nonOwnerProxy.getName() + " " + nonOwnerProxy.getGender() + " "
                + nonOwnerProxy.getInterests() + " " + nonOwnerProxy.getGeekRating());
    }

    private static Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    private static Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),
                new NonOwnerHandlerInvocationHandler(person));
    }
}
