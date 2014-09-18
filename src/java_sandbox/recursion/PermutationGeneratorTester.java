package java_sandbox.recursion;

import java.util.ArrayList;

/**
 * Test to find the permutations of a given word.
 */
public class PermutationGeneratorTester {
    
    public static void main(String[] args) {
        PermutationGenerator pg = new PermutationGenerator("eat");
        ArrayList<String> permutations = pg.getPermutations();
        int i = 1;
        for (String permutation : permutations) {
            System.out.println(i + ": " + permutation);
        }
    }
}
