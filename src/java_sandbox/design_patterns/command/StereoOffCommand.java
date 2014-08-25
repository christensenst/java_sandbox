package java_sandbox.design_patterns.command;

import java_sandbox.design_patterns.command.receiver.Stereo;

/**
 *
 */
public class StereoOffCommand implements Command {
    
    Stereo stereo;
    
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    
    public void execute() {
        stereo.off();
    }
    
    public void undo() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
