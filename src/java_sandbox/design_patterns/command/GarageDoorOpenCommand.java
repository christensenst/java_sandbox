package java_sandbox.design_patterns.command;

import java_sandbox.design_patterns.command.receiver.GarageDoor;

/**
 *
 */
public class GarageDoorOpenCommand implements Command {
    
    GarageDoor garageDoor;
    
    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    
    public void execute() {
        garageDoor.up();
    }
    
    public void undo() {
        garageDoor.down();
    }
}
