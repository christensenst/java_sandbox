package java_sandbox.design_patterns.command;

import java_sandbox.design_patterns.command.receiver.Hottub;

/**
 *
 */
public class HottubOnCommand implements Command {
    
    Hottub hottub;
    
    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }
    
    public void execute() {
        hottub.on();
    }
    
    public void undo() {
        hottub.off();
    }
}
