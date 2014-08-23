package java_sandbox.design_patterns.command.receiver;

/**
 *
 */
public class GarageDoor {
    
    public GarageDoor() {
        
    }
    
    public void up() {
        System.out.println("[Garage door going up]");
    }
    
    public void down() {
        System.out.println("[Garage door going down]");
    }
}
