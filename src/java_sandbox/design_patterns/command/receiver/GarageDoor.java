package java_sandbox.design_patterns.command.receiver;

/**
 *
 */
public class GarageDoor {
    
    private String location;
    
    public GarageDoor() {
        this.location = "";
    }
    
    public GarageDoor(String location) {
        this.location = location;
    }
    
    public void up() {
        System.out.println("[" + location + " Garage door going up ]");
    }
    
    public void down() {
        System.out.println("[" + location + " Garage door going down ]");
    }
}
