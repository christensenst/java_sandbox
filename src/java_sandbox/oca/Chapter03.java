package java_sandbox.oca;

/**
 * Examples from Chapter 3: OCA Java SE 7 Programmer I Study Guide
 */
public class Chapter03 {
    public static void main(String[] args) {
        //Strings can be created with or without a constructor
        String empty1 = new String();
        String empty2 = new String("");
        String quote1 = "Where's the party?";
        String quote2 = new String("Who dat is?");
        
        //String concatenation
        float reale = .007812f;
        float escudo = .125f;
        
        /* The + operator is syntactically left-associative, no matter whether it is
         * determined by type analysis to represent string concatenation or numeric
         * addition
         */
        //Prints "0.132812% of one gold doubloon"
        System.out.println(reale + escudo + "% of one gold doubloon");
        
        //Prints "0.132812% of one gold doubloon"
        System.out.println((reale + escudo) + "% of one gold doubloon");
        
        //Prints "% of one gold doubloon: 0.132812"
        System.out.println("% of one gold doubloon: " + (reale + escudo));
        
        //Prints "Coint values concatenated: 0.0078120.125"
        System.out.println("Coin values concatenated: " + reale + escudo);
        
        //Use StringBuilder to represent a mutable character string
        
        //Use StringBuffer to represent a thread-safe mutable character string
    }
}
