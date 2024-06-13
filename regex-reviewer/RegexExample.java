import java.util.regex.Matcher;
import java.util.regex.Pattern;

// A Pattern stores a format of a regular expression.

// The compile() method compiles the given regular expression into a pattern.

// A Matcher stores a possible match between a pattern and a string.

public class RegexExample {
    public static void main(String[] args) {
        // Define the regex pattern for a phone number (e.g., XXX-XXX-XXXX)
        String regexPattern = "\\d{3}-\\d{3}-\\d{4}";

        // Create a Pattern object from the regex pattern
        Pattern pattern = Pattern.compile(regexPattern);

        // Test phone numbers
        String phoneNumber1 = "123-456-7890"; // Valid phone number
        String phoneNumber2 = "abc-def-ghi"; // Invalid phone number

        // Create Matcher objects to match the pattern against the phone numbers
        Matcher matcher1 = pattern.matcher(phoneNumber1);
        Matcher matcher2 = pattern.matcher(phoneNumber2);

        // Check if the phone numbers match the pattern
        System.out.println("Phone number 1 is valid: " + matcher1.matches());
        System.out.println("Phone number 2 is valid: " + matcher2.matches());


        // The find() method of the Matcher class attempts to find the next subsequence of the input sequence that matches the pattern.
        // It returns true if a match is found, and false otherwise.

        String text = "The quick brown fox jumps over the lazy dog.";
        Pattern pattern2 = Pattern.compile("\\b\\w{5}\\b"); // Matches words with exactly 5 characters
        Matcher matcher = pattern2.matcher(text);

        while (matcher.find()) {
            System.out.println("Found match: " + matcher.group());
        }

        // The split() method of the Matcher class splits the input sequence around matches of the pattern.
        // It returns an array of strings containing the substrings split from the input sequence.

        // String text = "apple,banana,orange,grape";
        // Pattern pattern = Pattern.compile(",");
        // Matcher matcher = pattern.matcher(text);

        // String[] fruits = matcher.split();

        // for (String fruit : fruits) {
        //     System.out.println("Fruit: " + fruit);
        // }

        // The replaceAll() method of the Matcher class replaces every subsequence of the input sequence that matches the pattern with a given replacement string.
        // It returns a string resulting from the replacements.

        // String text = "The quick brown fox jumps over the lazy dog.";
        // Pattern pattern = Pattern.compile("\\b\\w{5}\\b"); // Matches words with exactly 5 characters
        // Matcher matcher = pattern.matcher(text);

        // String replacedText = matcher.replaceAll("*****");

        // System.out.println("Replaced text: " + replacedText);


    }
}
