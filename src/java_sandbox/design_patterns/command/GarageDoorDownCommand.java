package java_sandbox.design_patterns.command;

import java_sandbox.design_patterns.command.receiver.GarageDoor;

/**
 *
 */
public class GarageDoorDownCommand implements Command {
    
    GarageDoor garageDoor;
    
    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    
    public void execute() {
        garageDoor.down();
    }
}
