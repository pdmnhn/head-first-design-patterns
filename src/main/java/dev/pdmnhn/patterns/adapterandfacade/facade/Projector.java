package dev.pdmnhn.patterns.adapterandfacade.facade;

public class Projector {
    public void openScreen() {
        System.out.println("Opening the screen...");
    }

    public void closeScreen() {
        System.out.println("Closing the screen...");
    }

    public void turnOn() {
        System.out.println("Projector turned on!");
    }

    public void turnOff() {
        System.out.println("Projector turned off");
    }
}
