package java_sandbox.multithreading;

import java.util.Date;

/**
 * A runnable that repeatedly prints a greeting. This program executes the
 * essential steps for running separate threads:
 * 1. Implement a class that implements the Runnable interface.
 * 2. Place the code for your task into the run method of your class.
 * 3. Create an object of your subclass.
 * 4. Construct a Thread object from the runnable object.
 * 5. Call the start method to start the thread.
 * @author christensenst
 */
public class GreetingRunnable implements Runnable
{
    private static final int REPETITIONS = 10;
    private static final int DELAY = 1000;
    private String greeting;
    
    /**
     * Constructs the runnable object.
     * @param aGreeting the greeting to display
     */
    public GreetingRunnable(String aGreeting)
    {
        greeting = aGreeting;
    }
    
    public void run()
    {
        try
        {
            for (int i = 1; i <= REPETITIONS; i++)
            {
                Date now = new Date();
                System.out.println(now + " " + greeting);
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException exception)
        {
        }
    }
}
