package java_sandbox.input_output;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This class
 * @author christensenst
 */
public class TextReader
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner console = new Scanner(System.in);
        System.out.print("What file would you like to read? ");
        String inputFileName = console.next();
        System.out.print("Output file: ");
        String outputFileName = console.next();
        FileReader reader = new FileReader(inputFileName);
        Scanner in = new Scanner(reader);
        PrintWriter out = new PrintWriter(outputFileName);
        int lineNumber = 1;
        
        while (in.hasNextLine())
        {
            String line = in.nextLine();
            out.println("/* " + lineNumber + " */ " + line);
            System.out.println(line);
            lineNumber++;
        }
        
        out.close();
    }
}
