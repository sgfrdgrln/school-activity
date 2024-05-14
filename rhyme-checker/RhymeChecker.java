import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RhymeChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean validator = false;

        int choice;

        while(!validator) {
            try {

                do {
                    System.out.println("Options:");
                    System.out.println("\n1. Rhyme Checker");
                    System.out.println("\n2. Stop the Program.");
                    System.out.print("\nEnter a number: (1-2): ");
                    choice = input.nextInt();

                    if(choice > 2 || choice < 1) {
                        System.out.println("Invalid number.");
                    }
    
                }
                while(choice > 2 || choice < 1);

                if(choice == 1) {
                    rhymeCheckerUserInput();
                    System.out.println();

                }
                else {
                    System.out.println("Program stopped.");
                    validator = true;
                }

            }
            catch(InputMismatchException e) {

                System.out.println("Please enter a number.");
                input.nextLine();

            }
            

        }

       
    }
    public static void rhymeCheckerUserInput() {

        String firstWord, secondWord;

        Scanner input = new Scanner(System.in);

        System.out.println("\nFind out if the words you input actually rhymes!");

         // Enable user input

         do {
            System.out.print("\nEnter the first word: ");
            firstWord = input.nextLine().toLowerCase();
            if (!firstWord.matches("[a-zA-Z]+")) {
                System.out.println("Please enter a valid word without numbers.");
            }
        } while (!firstWord.matches("[a-zA-Z]+"));

        do {
            System.out.print("\nEnter the second word: ");
            secondWord = input.nextLine().toLowerCase();
            if (!secondWord.matches("[a-zA-Z]+")) {
                System.out.println("Please enter a word without numbers.");
            }
        } while (!secondWord.matches("[a-zA-Z]+"));
 
         // Get the last two letters of firstWord
         String sub = firstWord.substring(firstWord.length() - 2);
 
         // Initialize pattern
         Pattern pattern = Pattern.compile("[a-zA-Z]{1,2}" + sub + "\\b");
 
         // Initialize matcher
         Matcher matcher = pattern.matcher(secondWord);
 

 
         // Check if the two words rhyme
         if (matcher.matches()) {
             System.out.println(firstWord + " rhymes with "+secondWord);
         } else {
             System.out.println(firstWord + " does not rhyme with "+secondWord);
         }

    }
}
