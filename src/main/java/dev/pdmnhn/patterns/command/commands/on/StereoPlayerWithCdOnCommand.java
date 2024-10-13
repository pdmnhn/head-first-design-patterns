package dev.pdmnhn.patterns.command.commands.on;

import dev.pdmnhn.patterns.command.commands.Command;
import dev.pdmnhn.patterns.command.receivers.StereoPlayer;

public class StereoPlayerWithCdOnCommand implements Command {
    private final StereoPlayer stereoPlayer;

    public StereoPlayerWithCdOnCommand(StereoPlayer stereoPlayer) {
        this.stereoPlayer = stereoPlayer;
    }

    @Override
    public void execute() {
        stereoPlayer.on();
        stereoPlayer.setCd();
        stereoPlayer.setVolume(11);
        stereoPlayer.play();
    }
}
