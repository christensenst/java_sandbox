package java_sandbox.design_patterns.command;

/**
 *
 * @author christensenst
 */
public class NoCommand implements Command {
    
    public void execute() {
        System.out.println("[ Nothing here ]");
    }
    
    public void undo() {
        System.out.println("[ Undo nothing ]");
    }
}
