package java_sandbox.recursion;

import java.util.ArrayList;

/**
 * This class generates permutations of a word using recursion.
 */
public class PermutationGenerator {
    
    private String word;
    
    public PermutationGenerator(String aWord) {
        word = aWord;
    }
    
    public ArrayList<String> getPermutations() {
        ArrayList<String> result = new ArrayList<String>();
        
        //The empty string has a single permutation itself
        if (word.length() == 0) {
            result.add(word);
            return result;
        }
        //loop through all character positions
        for (int i = 0; i < word.length(); i++) {
            //form a simpler word by removing the ith character
            String shorterWord = word.substring(0,i) + word.substring(i + 1);
            //generate all permutations of the simpler word
            PermutationGenerator shorterPermutationGenerator = new PermutationGenerator(shorterWord);
            ArrayList<String> shorterWordPermutations = shorterPermutationGenerator.getPermutations();
            //add the removed character to the front of each permutation of the simpler word
            for (String s : shorterWordPermutations) {
                result.add(word.charAt(i) + s);
            }
        }
        //return all permutations
        return result;
    }
}
