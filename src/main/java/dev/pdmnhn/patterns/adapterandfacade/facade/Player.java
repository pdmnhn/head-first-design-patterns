package dev.pdmnhn.patterns.adapterandfacade.facade;

public class Player {
    public void turnOn() {
        System.out.println("Player turned on!");
    }

    public void turnOff() {
        System.out.println("Player turned off");
    }

    public void play(String movie) {
        System.out.println("Playing " + movie + " movie!");
    }
}
