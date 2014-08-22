package java_sandbox.design_patterns.command;

import java_sandbox.design_patterns.command.receiver.Light;

/**
 * This is the client for the remote
 */
public class RemoteControlTest {
    
    public static void main(String[] args) {
        //The remote is our Invoker, it will be passed a command object that can be used to make requests
        SimpleRemoteControl remote = new SimpleRemoteControl();
        //Create a Light object, this will be the Receiver of the request
        Light light = new Light();
        //Create a command and pass the Receiver to it
        LightOnCommand lightOn = new LightOnCommand(light);
        
        //Pass the command to the Invoker
        remote.setCommand(lightOn);
        //Simulate the button being pressed
        remote.buttonWasPressed();
    }
}
