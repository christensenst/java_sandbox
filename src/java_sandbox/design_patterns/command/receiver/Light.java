package java_sandbox.design_patterns.command.receiver;

/**
 *
 */
public class Light {
    
    public Light() {
        
    }
    
    public void on() {
        System.out.println("[Light turns on]");
    }
    
    public void off() {
        System.out.println("[Light turns off]");
    }
}
