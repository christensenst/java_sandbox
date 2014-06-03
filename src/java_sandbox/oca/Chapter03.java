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
        
        /* Complete set of valid Java assignment operators:
         * %=, &=, *=, /=, ^=, |=, +=, <<=, =, -=, >>=, >>>=
        */
        int a;
        a = 10;
        System.out.println(a += 3); //Eq: a = a + 3; Prints: 13
        a = 15;
        System.out.println(a -= 3); //Eq: a = a - 3; Prints: 12
        a = 20;
        System.out.println(a *= 3); //Eq: a = a * 3; Prints: 60
        a = 25;
        System.out.println(a /= 3); //Eq: a = a / 3; Prints: 8
        a = 30;
        System.out.println(a %= 3); //Eq: a = a % 3; Prints: 0
        a = 35;
        // The bitwise & operator performs a bitwise AND operation.
        System.out.println(a &= 3); // Binary: 00100011 & 00000011 = 00101011 Prints: 3
        a = 40;
        //The bitwise ^ operator performs a bitwise exclusive OR operation.
        System.out.println(a ^= 3); // Binary: 00101000 ^ 00000011 = 00101011 Prints: 43
        a = 45;
        // The bitwise | operator performs a bitwise inclusive OR operation.
        System.out.println(a |= 3); // Binary: 00101101 | 00000011 = 00101111 Prints: 47
        //System.out.println(a = a | 3);
        a = 50;
        // The signed left shift operator "<<" shifts a bit pattern to the left
        System.out.println(a <<= 3); //Prints: -112
        a = 55;
        System.out.println(a >>= 3); //Prints: 6
        a = 60;
        System.out.println(a >>>= 3); //Prints: 7
    }
}
