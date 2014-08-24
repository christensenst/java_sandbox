package java_sandbox.design_patterns.command.receiver;

/**
 *
 */
public class Light {
    
    String location;
    
    public Light() {
        this.location = "";
    }
    
    public Light(String name) {
        this.location = name;
    }
    
    public void on() {
        System.out.println("[ " + location + " Light turns on ]");
    }
    
    public void off() {
        System.out.println("[ " + location + " Light turns off ]");
    }
}
