import java.util.*;
import java.io.*;

public class QuizGame
{
    static Scanner sc = new Scanner(System.in);
    static int timer = 20;
    static int timeRemaining = timer;
    static String[] userAnswer = new String[6];
    static String[] answers = {"A", "B", "C", "A", "B", "C"};
    static int score = 0;
    static ArrayList<String> questions = new ArrayList<String>();
    static boolean allQuestionsAnswered = false;
    
	public static void main(String[] args) {
	    
	
	
	

	
	String userInput;
	

	boolean isValid;
	
	
	questions.add("|  1. What is the capital of the Philippines?\t    |\n|     A. Manila\t\t\t\t\t    |\n|     B. Bangkok\t\t\t\t    |\n|     C. Singapore\t\t\t\t    |");
	questions.add("|  2. What is the capital of the Thailand?\t    |\n|     A. Manila\t\t\t\t\t    |\n|     B. Bangkok\t\t\t\t    |\n|     C. Singapore\t\t\t\t    |");
	questions.add("|  3. What is the capital of the Singapore?\t    |\n|     A. Manila\t\t\t\t\t    |\n|     B. Bangkok\t\t\t\t    |\n|     C. Singapore\t\t\t\t    |");
	questions.add("|  4. What is the capital of the Russia?\t    |\n|     A. Moscow\t\t\t\t\t    |\n|     B. Paris\t\t\t\t\t    |\n|     C. Rome\t\t\t\t\t    |");
	questions.add("|  5. What is the capital of the France?\t    |\n|     A. Moscow\t\t\t\t\t    |\n|     B. Paris\t\t\t\t\t    |\n|     C. Rome\t\t\t\t\t    |");
	questions.add("|  6. What is the capital of the Italy?\t            |\n|     A. Moscow\t\t\t\t\t    |\n|     B. Paris\t\t\t\t\t    |\n|     C. Rome\t\t\t\t\t    |");

	for(int i = 0; i < questions.size(); i++) {
	    
	    isValid = false;
	    
	    while(!isValid) {
	    System.out.println("\n*-------------------- QUIZ GAME --------------------*\n|\t\t\t\t\t\t    |");
	    System.out.println(questions.get(i));
	    System.out.println("|\t\t\t\t\t\t    |\n*---------------------------------------------------*");
	    startTimer();
	    try {
	    System.out.print(" Enter a letter (A, B, or C) only: ");
	    userInput = sc.nextLine();
	    
	    
	    if(userInput.equalsIgnoreCase("A") || userInput.equalsIgnoreCase("B") || userInput.equalsIgnoreCase("C")) {
	        isValid = true;
	        System.out.println(" Your answer: "+userInput.toUpperCase());
	        userAnswer[i] = userInput;
	        
	    }
	   
	    
	    else {
	        isValid = false;
	        throw new Exception("\n Invalid input.");
	    }
	    
	    }
	    catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	    
	}
	}
	
	
    allQuestionsAnswered = true;
	
	
	}

	public static void checkAnswers() {
	    
	   
	    
	    if(userAnswer[0] == null) {
	        
	        userAnswer[0] = "";
	    }
	    if(userAnswer[1] == null) {
	        
	        userAnswer[1] = "";
	    }
	    if(userAnswer[2] == null) {
	        
	        userAnswer[2] = "";
	    }
	    if(userAnswer[3] == null) {
	        
	        userAnswer[3] = "";
	    }
	    if(userAnswer[4] == null) {
	        
	        userAnswer[4] = "";
	    }
	    if(userAnswer[5] == null) {
	        
	        userAnswer[5] = "";
	    }
	    
	    
	    
	    
	if(userAnswer[0].equalsIgnoreCase(answers[0])) {
	    score++;
	}
	if(userAnswer[1].equalsIgnoreCase(answers[1])) {
	    score++;
	}
	if(userAnswer[2].equalsIgnoreCase(answers[2])) {
	    score++;
	}
	if(userAnswer[3].equalsIgnoreCase(answers[3])) {
	    score++;
	}
	if(userAnswer[4].equalsIgnoreCase(answers[4])) {
	    score++;
	}
	if(userAnswer[5].equalsIgnoreCase(answers[5])) {
	    score++;
	}
	System.out.println("\n\n*---------------------------------------------------*");
		System.out.println("|\t             Score: "+score+"/"+questions.size()+"\t\t\t    |");
    	System.out.println("*---------------------------------------------------*");
	}
	public static void startTimer() {
        Thread timerThread = new Thread(() -> {
            while (timeRemaining > 0 && !allQuestionsAnswered) {
                try {
                    Thread.sleep(1000);
                    timeRemaining -- ;
                    if(timeRemaining == 10) {
                    System.out.println("\n\n*---------------------------------------------------*");
                    System.out.println("|\t    Time remaining: " + timeRemaining + " seconds\t\t    |");
                    System.out.println("*---------------------------------------------------*");
                    System.out.print(" Enter a letter (A, B, or C) only: ");
                    
                    }
                    
                    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (timeRemaining == 0) {
                System.out.println("\n\n ***************** Time's up! **********************");
                checkAnswers(); 
                System.exit(0); 
            }
            else if(allQuestionsAnswered) {
                System.out.println("\n ***************** Quiz Finished! ******************");
                checkAnswers(); 
                System.exit(0); 
            }
        });
        timerThread.start();
    }
}
