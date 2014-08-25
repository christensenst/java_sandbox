package java_sandbox.design_patterns.command;

import java_sandbox.design_patterns.command.receiver.CeilingFan;

/**
 *
 */
public class CeilingFanOnCommand implements Command {
    
    CeilingFan ceilingFan;
    
    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    
    public void execute() {
        ceilingFan.high();
    }
    
    public void undo() {
        ceilingFan.off();
    }
}
