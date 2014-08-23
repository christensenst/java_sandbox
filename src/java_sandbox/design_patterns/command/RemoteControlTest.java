package java_sandbox.design_patterns.command;

import java_sandbox.design_patterns.command.receiver.Light;
import java_sandbox.design_patterns.command.receiver.GarageDoor;

/**
 * This is the client for the remote
 */
public class RemoteControlTest {
    
    public static void main(String[] args) {
        //The remote is our Invoker, it will be passed a command object that can be used to make requests
        SimpleRemoteControl remote = new SimpleRemoteControl();
        //Create a Light and a GarageDoor object, these will be the Receivers of the request
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        //Create command objects and pass the appropriate Receiver to them
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        
        //Pass the command to the Invoker
        remote.setCommand(lightOn);
        //Simulate the button being pressed
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
