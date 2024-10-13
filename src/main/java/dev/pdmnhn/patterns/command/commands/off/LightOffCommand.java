package dev.pdmnhn.patterns.command.commands.off;

import dev.pdmnhn.patterns.command.commands.Command;
import dev.pdmnhn.patterns.command.receivers.Light;

public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
