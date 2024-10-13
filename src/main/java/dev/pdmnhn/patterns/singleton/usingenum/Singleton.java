package dev.pdmnhn.patterns.singleton.usingenum;

public enum Singleton {
    UNIQUE_INSTANCE;

    private String name;

    Singleton() {
        this.name = "I am a singleton object implemented with enum";
    }

    @Override
    public String toString() {
        return this.name;
    }
}
