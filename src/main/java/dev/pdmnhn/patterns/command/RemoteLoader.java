package dev.pdmnhn.patterns.command;

import dev.pdmnhn.patterns.command.commands.Command;
import dev.pdmnhn.patterns.command.commands.MacroCommand;
import dev.pdmnhn.patterns.command.commands.off.LightOffCommand;
import dev.pdmnhn.patterns.command.commands.off.StereoPlayerWithCdOffCommand;
import dev.pdmnhn.patterns.command.commands.on.LightOnCommand;
import dev.pdmnhn.patterns.command.commands.on.StereoPlayerWithCdOnCommand;
import dev.pdmnhn.patterns.command.receivers.Light;
import dev.pdmnhn.patterns.command.receivers.StereoPlayer;


public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        StereoPlayer stereoPlayer = new StereoPlayer();
        StereoPlayerWithCdOnCommand stereoPlayerOnCommand = new StereoPlayerWithCdOnCommand(stereoPlayer);
        StereoPlayerWithCdOffCommand stereoPlayerOffCommand = new StereoPlayerWithCdOffCommand(stereoPlayer);

        MacroCommand partyModeOnCommand = new MacroCommand(new Command[] { lightOffCommand, stereoPlayerOnCommand });
        MacroCommand partyModeOffCommand = new MacroCommand(new Command[] { stereoPlayerOffCommand, lightOnCommand });

        remoteControl.setCommand(lightOnCommand, lightOffCommand, 0);
        remoteControl.setCommand(stereoPlayerOnCommand, stereoPlayerOffCommand, 1);
        remoteControl.setCommand(partyModeOnCommand, partyModeOffCommand, 2);

        remoteControl.onButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);

        remoteControl.undoButtonWasPressed();

        remoteControl.offButtonWasPressed(1);
        remoteControl.offButtonWasPressed(0);

        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
    }
}
