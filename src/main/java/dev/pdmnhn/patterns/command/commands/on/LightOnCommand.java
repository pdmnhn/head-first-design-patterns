package dev.pdmnhn.patterns.command.commands.on;

import dev.pdmnhn.patterns.command.commands.Command;
import dev.pdmnhn.patterns.command.receivers.Light;


public class LightOnCommand implements Command {
    private final Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
