package java_sandbox.collections;

/**
 * A test program for the implemented LinkedList
 * @author christensenst
 */
public class ListTester
{
    public static void main(String[] args)
    {
        LinkedList<String> movies = new LinkedList<>();
        movies.addFirst("The Glimmer Man");
        movies.addFirst("Under Siege");
        movies.addFirst("Out For Justice");
        movies.addFirst("Hard To Kill");
        
        ListIterator<String> iterator = movies.listIterator(); // |HJUG
        iterator.next(); // H|JUG
        iterator.add("Marked for Death"); // HM|JUG
        iterator.next(); // HMJ|UG
        iterator.remove(); // HM|UG;
        iterator.next(); // HMU|G;
        iterator.next(); // HMUG|
        
        ListIterator<String> iteratorTest = movies.listIterator();
        
        while(iteratorTest.hasNext())
            System.out.println(iteratorTest.next());
        System.out.println("\nExpected:");
        System.out.println("Hard To Kill");
        System.out.println("Marked for Death");
        System.out.println("Out for Justice");
        System.out.println("The Glimmer Man");
    }
}
