package java_sandbox.design_patterns.command;

import java_sandbox.design_patterns.command.receiver.Light;

/**
 *
 */
public class LightOnCommand implements Command {
    
    Light light;
    /**
     * The constructor is passed the specific light that this command is going to control.
     * @param light 
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }
    /**
     * The execute method calls the on() method on the receiving object, which is the light we are controlling
     */
    public void execute() {
        light.on();
    }
}
