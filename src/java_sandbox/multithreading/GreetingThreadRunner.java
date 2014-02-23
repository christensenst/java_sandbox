package java_sandbox.multithreading;

/**
 * This program runs two greeting threads in parallel.  Because both threads
 * are running in parallel, the two message sets are interleaved.  However,
 * they are not exactly interleaved.  The thread scheduler gives no guarantee
 * about the order in which threads are executed.  Each thread runs for a short
 * amount of time, called a time slice.  Then the scheduler activates another
 * thread.  Therefore, the order in which each thread gains control is somewhat
 * random, so in this example, the messages 
 * @author christensenst
 */
public class GreetingThreadRunner
{
    public static void main(String[] args)
    {
        GreetingRunnable r1 = new GreetingRunnable("Hello, World");
        GreetingRunnable r2 = new GreetingRunnable("Goodbye, World");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
