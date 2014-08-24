package java_sandbox.design_patterns.command.receiver;

/**
 *
 */
public class Stereo {
    
    String location;
    int volume;
    
    public Stereo() {
        this.location = "";
    }
    
    public Stereo(String location) {
        this.location = location;
    }
    
    public void on() {
        System.out.println("[ Turning " + location + " stereo on ]");
    }
    
    public void off() {
        System.out.println("[ Turning " + location + " stereo off ]");
    }
    
    public void setCd() {
        System.out.println("[ Setting stereo cd to slot 1 ]");
    }
    
    public void setDvd() {
        System.out.println("[ Setting stereo DVD ]");
    }
    
    public void setRadio() {
        System.out.println("[ Setting stereo radio to favorite station ]");
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("[ Setting volume to " + Integer.toString(volume) + " ]");
    }
}
