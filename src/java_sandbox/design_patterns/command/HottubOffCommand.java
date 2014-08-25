package java_sandbox.design_patterns.command;

import java_sandbox.design_patterns.command.receiver.Hottub;

/**
 *
 */
public class HottubOffCommand implements Command {
    
    Hottub hottub;
    
    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }
    
    public void execute() {
        hottub.off();
    }
    
    public void undo() {
        hottub.on();
    }
}
