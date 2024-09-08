package dev.pdmnhn.patterns.singleton.usingenum;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
        System.out.println(singleton);
    }
}
