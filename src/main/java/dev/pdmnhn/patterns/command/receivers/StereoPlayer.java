package dev.pdmnhn.patterns.command.receivers;

public class StereoPlayer {
    public void on() {
        System.out.println("Stereo Player turned on!");
    }

    public void off() {
        System.out.println("Stereo Player turned off!");
    }

    public void setCd() {
        System.out.println("CD set!");
    }

    public void ejectCd() {
        System.out.println("Ejected CD!");
    }

    public void setVolume(int volume) {
        System.out.println("Volume set to " + volume);
    }

    public void play() {
        System.out.println("Music is playing now!");
    }
}
