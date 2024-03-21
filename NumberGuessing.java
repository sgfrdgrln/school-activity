import java.util.*;


public class NumberGuessing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int max = 50;
        int min = 1;
        int numOfGuess = 0;
        int guess;
        int randomNumber = random.nextInt(max + 1 - min) + min;
        boolean validator = false;
        
        
        while(!validator) {
            
        try {
            System.out.println("\n\n*---------------------------------------------------*");
            System.out.println("|\t         NUMBER GUESSING GAME               |");
            System.out.println("*---------------------------------------------------*");
            System.out.print("Guess the number from 1-50: ");
            guess = sc.nextInt();

           if(guess == randomNumber) {
            numOfGuess++;
            validator = true;
            System.out.println("Your guess was correct! The number was "+randomNumber);
            System.out.println("Your total number of guess is: "+numOfGuess);
           }
           
           else if(guess > 50) {

            throw new Exception("The guess was out of range. (1-50) only. ");

           }
           else if(guess < 1) {
            throw new Exception("The guess was out of range. (1-50) only. ");
            
           }
           else if(guess > randomNumber) {
            numOfGuess++;
            System.out.println("Your guess is too high.");
           }
           else if(guess < randomNumber) {
            numOfGuess++;
            System.out.println("Your guess is too low.");
           }

        }
        catch(InputMismatchException e) {
            System.out.println("Invalid input.");
            System.out.println("We will not count that as a guess.");
            sc.next();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("We will not count that as a guess.");
        }
    }
    }
}