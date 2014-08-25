package java_sandbox.design_patterns.command;

/**
 * The Remote Control manages a set of Command objects, one per button. When a button is 
 * pressed, the corresponding ButtonWasPushed() method is called, which invokes the execute()
 * method on the command. That is the full extent of the remote's knowledge of the classes
 * it's invoking as the Command object decouples the remote from the classes doing the actual
 * home-automation work.
 */
public class RemoteControl {
    
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }
    
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
    
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() +
                    "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
