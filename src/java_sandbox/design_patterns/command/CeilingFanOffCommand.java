package java_sandbox.design_patterns.command;

import java_sandbox.design_patterns.command.receiver.CeilingFan;

/**
 *
 */
public class CeilingFanOffCommand implements Command {
    
    CeilingFan ceilingFan;
    
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    
    public void execute() {
        ceilingFan.off();
    }
}
