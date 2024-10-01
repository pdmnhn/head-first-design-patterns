package dev.pdmnhn.patterns.command.commands.off;

import dev.pdmnhn.patterns.command.commands.Command;
import dev.pdmnhn.patterns.command.receivers.StereoPlayer;


public class StereoPlayerWithCdOffCommand implements Command {
    private final StereoPlayer stereoPlayer;
    public StereoPlayerWithCdOffCommand(StereoPlayer stereoPlayer) {
        this.stereoPlayer = stereoPlayer;
    }
    @Override
    public void execute() {
        stereoPlayer.ejectCd();
        stereoPlayer.off();
    }
}
