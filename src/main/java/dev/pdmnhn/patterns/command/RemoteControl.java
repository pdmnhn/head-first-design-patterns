package dev.pdmnhn.patterns.command;

import java.util.Arrays;
import dev.pdmnhn.patterns.command.commands.Command;


public class RemoteControl {
    private static final int BUTTONS_COUNT = 7;
    private static final Command NO_COMMAND = new NoCommand();
    private Command undoCommand = NO_COMMAND;

    private final Command[] onCommands;
    private final Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[BUTTONS_COUNT];
        offCommands = new Command[BUTTONS_COUNT];
        Arrays.fill(onCommands, NO_COMMAND);
        Arrays.fill(offCommands, NO_COMMAND);
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void undoButtonWasPressed() {
        undoCommand.execute();
    }

    public void setCommand(Command onCommand, Command offCommand, int slot) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }
}

class NoCommand implements Command {
    @Override
    public void execute() {
    }
}
