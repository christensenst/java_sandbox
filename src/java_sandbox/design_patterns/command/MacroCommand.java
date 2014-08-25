package java_sandbox.design_patterns.command;

/**
 *
 */
public class MacroCommand implements Command {
    
    Command[] commands;
    
    public MacroCommand(Command[] commands) {
        //take an array of Commands and store them in the MacroCommand
        this.commands = commands;
    }
    
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }
    
    public void undo() {
        
    }
}
