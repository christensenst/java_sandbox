package java_sandbox.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * This example shows how to get the intersecting values of 2 lists and iterate over the results
 */
public class CompareListTest {
    
    public static void main(String[] args) {
        //create and populate 2 lists to compare
        List<String> allstars = new ArrayList<String>();
        allstars.add("Alan");
        allstars.add("Bo");
        allstars.add("Charles");
        List<String> players = new ArrayList<String>();
        players.add("Wally");
        players.add("Bill");
        players.add("Alan");
        players.add("Charles");
        
        // make a copy of the 2nd list
        List<String> copyPlayers = new ArrayList<String>(players);
        // keep only the matches
        copyPlayers.retainAll(allstars);
        // iterate over the matches
        for (String player : copyPlayers) {
            System.out.println(player);
        }
        
        // create a 3rd list with no matches
        List<String> bTeam = new ArrayList<String>();
        bTeam.add("Ben");
        bTeam.add("Stewart");
        bTeam.add("Obie");
        
        // there are no matches, so nothing is printed
        bTeam.retainAll(allstars);
        for (String player : bTeam) {
            System.out.println(player);
        }
    }
}
