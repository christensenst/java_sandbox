package java_sandbox.oca;

/**
 * Examples from Chapter 2: OCA Java SE 7 Programmer I Study Guide
 */
public class Chapter02 {
    
    public static void main(String[] args) {
        // you can have an assignment statement as the evaluated expression for the if statement
        // this if statement evaluates to true
        boolean isThisReal = false;
        if (isThisReal = true) {
            System.out.println("You're a rockstar");
        } else {
            System.out.println("The cat's pajamas");
        }
        
        //declare boolean variables
        Boolean isValid = true;
        //boolean isValid2 = TRUE; //Not a valid literal value
        boolean isValid3 = new Boolean(true);
        //boolean isValid4 = 1; // can't assign an int to a boolean
        
        //can have multiple semicolons in a row
        if (true) ;;;;
        if (true) {;;;;;}
        if  (true) ;{};
        
    }
}
