package java_sandbox.design_patterns.command;

import java_sandbox.design_patterns.command.receiver.Light;

/**
 *
 */
public class LightOffCommand implements Command {
    
    Light light;
    
    public LightOffCommand(Light light) {
        this.light = light;
    }
    
    public void execute() {
        light.off();
    }
}
