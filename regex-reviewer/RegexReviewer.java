
// pre-final

// A regular expression (regex) is a character or sequence of characters that represent a string
// or multiple string.

// A repetition operator is any symbol in regex that indicates the number of times a specified
// character appears in a matching string.


import java.util.*;
import java.util.regex.*;


public class RegexReviewer {
    
    public static void main(String[] args) {

        System.out.println(matchChecker("apple")); 

        String str = "hello123";
        boolean matches = str.matches("[a-z]+\\d+"); // true (matches letters followed by digits)

        String text = "aaaabbbccc";
        boolean matches2 = text.matches("a{4}b{3}c{3}"); // true (exactly 4 'a's, 3 'b's, and 3 'c's)
        

        System.out.println(matches);


    }

    public static boolean matchChecker(String input) {

        String animal = input;
 
        // equals() method - compares one (1) string to another by comparing a single argument.

        if(animal.equals("cat")) {
            return true;
        }
        else if(animal.equals("dog")) {
            return true;
        }
        return false;
      

    }

}
