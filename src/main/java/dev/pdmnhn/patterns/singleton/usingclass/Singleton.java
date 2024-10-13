package dev.pdmnhn.patterns.singleton.usingclass;

public class Singleton {
    private static volatile Singleton singleInstance;

    private String name;

    private Singleton() {
        this.name = "I am a singleton object implemented with class";
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static Singleton getInstance() {
        if (singleInstance == null) {
            synchronized (Singleton.class) {
                if (singleInstance == null) {
                    singleInstance = new Singleton();
                }
            }
        }
        return singleInstance;
    }
}
