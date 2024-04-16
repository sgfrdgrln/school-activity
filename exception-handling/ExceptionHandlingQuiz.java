import java.util.*;

public class ExceptionHandlingQuiz {
 
    // GLOBAL VARIABLES

    static int errorCounter = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
       
        
        System.out.println("\nGAME: TRY NOT TO GET AN ERROR");
        

        try {
            System.out.println("-------------------------------------------------------");
            System.out.println("Instruction: Avoid getting an InputMismatchException.");
            System.out.print("\nEnter a number: ");
            num = input.nextInt();
            System.out.println("\nGood job! You didnt input something else. :D");
            arithmeticTime();
            

            


        }
        catch(InputMismatchException inputError) {
            errorCounter++;
            System.out.println("\nERROR!");
            System.out.println("You tried to input a String or decimal to an integer scanner?");
            System.out.println(inputError);
            arithmeticTime();
           
        }


    }
    private static void arithmeticTime() {
        input.nextLine();
        System.out.println("-------------------------------------------------------");
        System.out.println("Okay, this time. Try not to get an error when dividing a number!");
        System.out.println("\nInstruction: Avoid getting an ArithmeticException.");

        try {
        int dividend, divisor;
        double quotient;

        // NOTE: 0.0 / 0 returns NaN, 1 / 0.0 returns Infinity, -1 / 0.0 returns -Infinity

         // System.out.println(0.0 / 0);
        // System.out.println(1 / 0.0);
        // System.out.println(-1 / 0.0);
        
        System.out.print("\nEnter a dividend: ");
        dividend = input.nextInt();
        System.out.print("\nEnter a divisor: ");
        divisor = input.nextInt();

        quotient = dividend / divisor;

        System.out.println("\nThe quotient is: "+quotient);

        

        arrayChecker();

        }
        catch(ArithmeticException mathError) {
            errorCounter++;
            System.out.println("\nERROR!");
            System.out.println("Did you really divide a number to zero?");
            System.out.println(mathError);
            arrayChecker();
        }
        catch(InputMismatchException inputError) {
            errorCounter++;
            System.out.println("\nERROR");
            System.out.println("You tried to enter a String or decimal to an integer scanner?");
            System.out.println(inputError);
            input.nextLine();
            arrayChecker();
          
        }
    }
    private static void arrayChecker() {
       
        try {
        String[] name = new String[1];
        int i;
        System.out.println("-------------------------------------------------------");
        System.out.println("You have an array with an index of 0. Which allows only 1 element.");
        System.out.println("\nInstruction: Avoid getting an ArrayIndexOutOfBoundsException.");
        System.out.println("\nname[i] = \"Bob\";");
        System.out.print("\nEnter a number to replace your i variable: ");
        i = input.nextInt();
        name[i] = "Bob";

       System.out.println("\nYou successfully stored "+name[i]+" to your array. Good job!");

       arrayStoreChecker();
        }
        catch(ArrayIndexOutOfBoundsException arrayError) {
            errorCounter++;
            System.out.println("\nERROR");
            System.out.println("Out of bound. Did you just input a number greater than your index range?");
            System.out.println(arrayError);
            arrayStoreChecker();
        }
        catch(InputMismatchException inputError) {
            errorCounter++;
            System.out.println("\nERROR");
            System.out.println("You tried to enter a String or decimal to an integer scanner?");
            System.out.println(inputError);
            input.nextLine();
            arrayStoreChecker();
        }
    }
    private static void arrayStoreChecker() {
        boolean validator = true;
        int answer;
        System.out.println("-------------------------------------------------------");
        while (validator) {
            try {

                Object[] stringArray = new String[1];


            do {
                System.out.println("Instruction: Avoid getting an ArrayStoreException.");
                System.out.println("\nWill an error occur if I store an integer (number) to a String array?");
                System.out.println("1. Yes\n2. No");
                System.out.print("\nEnter a number: ");
                answer = input.nextInt();
            }while(answer < 1 || answer > 2);

            if (answer == 1) {
                System.out.println("\nCorrect!");
                validator = false;
                stringIndexChecker();
            }
            else if(answer == 2){
                System.out.println("Wrong!");
                validator = false;
                stringArray[0] = 123;
                
            }
            else {
                System.out.println("Please enter 1 or 2 only.");
            }

        }catch(ArrayStoreException arrayStoreError) {
            errorCounter++;
            System.out.println("\nERROR");
            System.out.println("Did you just try to store an integer to a String array?");
            System.out.println(arrayStoreError);
            stringIndexChecker();
            
        }
        catch(InputMismatchException inputError) {
            errorCounter++;
            System.out.println("\nERROR");
            System.out.println("You tried to enter a String or decimal to an integer scanner?");
            System.out.println(inputError);
            validator = false;
            input.nextLine();
            stringIndexChecker();
        }


        }
        

    }
    private static void stringIndexChecker() {
        System.out.println("-------------------------------------------------------");
        try {
        String name = "Keene"; 
        System.out.println("Instruction: Avoid getting a StringIndexOutOfBoundsException.");
        System.out.println("\nNote: Keene has only 4 index when you count it.");
        System.out.print("\nEnter a number to get a letter from the name \'Keene\' ");
        int indexNum = input.nextInt();
            
        System.out.println("\nThe letter on index "+indexNum +" is "+name.charAt(indexNum));
        numberFormatChecker();
        }
        catch(StringIndexOutOfBoundsException stringIndexError) {
            errorCounter++;
            System.out.println("\nERROR");
            System.out.println("String index out of range.");
            System.out.println(stringIndexError);
            numberFormatChecker();
        }
        catch(InputMismatchException inputError) {
            errorCounter++;
            System.out.println("\nERROR");
            System.out.println("You tried to enter a String or decimal to an integer scanner?");
            System.out.println(inputError);
            numberFormatChecker();
        }
        
    }
    private static void numberFormatChecker() {
        input.nextLine();
        System.out.println("-------------------------------------------------------");
        try {
            String userInput;
            System.out.println("Instruction: Avoid getting a NumberFormatException.");
            System.out.println("\nWe can convert a String that is a number using Integer.parseInt()");
            System.out.println("\nBut make sure it is a number!");
            System.out.print("\nEnter a number: ");
            userInput = input.nextLine();

            Integer.parseInt(userInput);
            System.out.println("\nGood job! Successfully converted "+userInput+" into an integer!");
            nullPointerChecker();

        }catch(NumberFormatException numberFormatError) {
            errorCounter++;
            System.out.println("\nERROR");
            System.out.println("Cannot convert a word to integer, only numbers (no decimal).");
            System.out.println(numberFormatError);
            
            nullPointerChecker();
        }
        
        

    }
    private static void nullPointerChecker() {
        boolean checker = true;
        int user_answer;
        String username = null;
        System.out.println("-------------------------------------------------------");
        try {
            while (checker) {
            do {
            
            System.out.println("Instruction: Avoid getting a NullPointerException.");
            System.out.println("\nIf I try to get the length of a String with a null value will an error occur? ");
            System.out.println("1. Yes\n2. No");
            System.out.print("\nEnter a number: ");
            user_answer = input.nextInt();
            }
            while(user_answer < 1 || user_answer > 2);

            if(user_answer == 1) {
                checker = false;
                System.out.println("\nCorrect! It will return an error.");
            }
            else if(user_answer == 2) {
                checker = false;
                System.out.println("\nWrong!");
                username.length();
            }else {
                System.out.println("Enter a number from 1-2 only.");
            }
        }

        }catch(NullPointerException nullError) {
            errorCounter++;
            System.out.println("\nERROR");
            System.out.println("You tried to get the length of a null variable?");
            System.out.println(nullError);
        }
        catch(InputMismatchException inputError) {
            errorCounter++;
            System.out.println("\nERROR");
            System.out.println("\nYou tried to enter a String or decimal to an integer scanner?");
            System.out.println(inputError);
            
        }
    
    System.out.println("\nGame finished!");
    System.out.println("\nExceptions occured: "+errorCounter);

    try {
    if(errorCounter == 0) {
        throw new NoErrorException("Wow! You got zero error. Good job!");
    }
    else if(errorCounter == 7) {
        throw new CatchingErrorsException();
    }
    else {
        throw new CustomException();
    }
}
    catch(CustomException customException) {
    System.out.println(customException.getMessage());
    }
    catch(NoErrorException noErrorException) {
    System.out.println(noErrorException.getMessage());
    }
    catch(CatchingErrorsException catchingErrorsException) {
    System.out.println(catchingErrorsException.getMessage());
    }
    System.out.println("Program stopped.");
    }

    

}
class CustomException extends Exception {

    public CustomException() {
        super("This is a custom exception!");
    }
}
class NoErrorException extends Exception {

    public NoErrorException(String message) {
        super(message);
    }
}
class CatchingErrorsException extends Exception{
    
    public CatchingErrorsException() {
        super("You like catching all the errors, huh?");
    }
}