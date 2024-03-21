import java.util.*;
import java.io.*;

class BlankInputException extends Exception {
    public BlankInputException(String error) {
        super(error);
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String error) {
        super(error);
    }
}


public class Quiz {

    String[] questions = 
    {"1. Which is NOT a programming language?\nA. Java\nB. JavaScript\nC. HTML",
    "2. Can you run java without a main method?\nA. Yes\nB. No\nC. Maybe",
    "3. Which is a framework of JavaScript?\nA. Spring\nB. Flutter\nC. Next.js",
    "4. Who invented java?\nA. Bill Gates\nB. Mark Zuckerberg\nC. James Gosling",
    "5. Who is the first programmer?\nA. Ada Lovelace\nB. Taylor Swift\nC. Pewdiepie",
    "6. Why do birds?\nA. Suddenly appear everytime you are near.\nB. Because birds\nC. fly?",
    "7. What is the first programming language?\nA. C\nB. FORTRAN\nC. VB.net",
    "8. Who created Linux?\nA. Mark Zuckerberg\nB. Elon Musk\nC. Linus Torvald",
    "9. Which component is used to compile, debug and execute the java programs?\nA. JRE\nB. JIT\nC. JDK",
    "10. What is the extension of JavaScript code file?\nA. .js\nB. .java\nC. .html"};

    String[] answers = {"C", "B", "C", "C", "A", "A", "B", "C", "C", "A"};

public static void main(String[] args) {
    Quiz quiz = new Quiz();
    Scanner sc = new Scanner(System.in);
    int score = 0;
    boolean validator = false;
    int numOfGuess = 0;
    String guess;
    String[] userAnswer = new String[10];

    System.out.println("\t\tQuiz Game\n");

    for(int i = 0; i < quiz.questions.length; i++) {
        validator = false;

        System.out.println(quiz.questions[i]);

        while (!validator) {
            try {
            System.out.print("Enter a letter (A, B, or C) only: ");
            guess = sc.nextLine();
            if(guess.equalsIgnoreCase("")) {
                throw new BlankInputException("You did not input anything.");
            }
            else if(!guess.equalsIgnoreCase("A") && !guess.equalsIgnoreCase("B") && !guess.equalsIgnoreCase("C") ) {
                throw new InvalidInputException("Invalid input. Please enter (A, B, or C) only.");
            }
            else {
                validator = true;
                userAnswer[i] = guess.toUpperCase(); 
            }
            }
            catch(BlankInputException e) {
                System.out.println(e.getMessage());
            }
            catch(InvalidInputException e) {
                System.out.println(e.getMessage());   
            }   
        }
    }
    for (int i = 0; i < quiz.questions.length; i++) {
       if (userAnswer[i].equalsIgnoreCase(quiz.answers[i])) {
           score++;
       }   
    }
    System.out.println("You scored: "+score+"/"+quiz.questions.length);
}
}
