import java.util.*;



public class ExceptionHandling {

    // midterm

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            int errorCounter = 0;

        try {
            int input;
            System.out.println("Tip: Do not enter a number to get an error :D");
            System.out.print("Enter a number: ");
            input = sc.nextInt();
        }
        catch(InputMismatchException inputMismatchError) {
            errorCounter++;
            System.out.println("\nERROR 1 for InputMismatchException:");
            System.out.println("invalid input. you inputted a string (word) or double (decimal) to an integer scanner.");
            System.out.println(inputMismatchError);
            
            try {
                String[] name = new String[1];

                
                // since you made an array with only index 0, you cannot initialize a value on index 1
                name[1] = "Bobby"; 
            }catch(ArrayIndexOutOfBoundsException arrayIndexError) {
                errorCounter++;
                System.out.println("\nERROR 2 for ArrayIndexOutOfBoundsException:");
                System.out.println("index out of bound.");
                System.out.println(arrayIndexError);

                try{
                    String animal = "Cat"; 
                    // since Cat has only 2 index it cannot print the index 3 
                    System.out.println(animal.charAt(3));
                }catch(StringIndexOutOfBoundsException stringIndexError) {
                    errorCounter++;
                    System.out.println("\nERROR 3 for StringIndexOutOfBoundsException:");
                    System.out.println("String index out of range.");
                    System.out.println(stringIndexError);

                    try{
                        // you cannot convert a word to an integer. only numbers ex: "123".
                        Integer.parseInt("banana");
                    }catch(NumberFormatException numberFormatError) {
                        errorCounter++;
                        System.out.println("\nERROR 4 for NumberFormatException:");
                        System.out.println("cannot convert a word to integer, only numbers.");
                        System.out.println(numberFormatError);

                        try {
                            
                            Object[] stringArray = new String[2];
                            // you cannot store an integer to a String array.
                            stringArray[1] = 123;

                        }catch(ArrayStoreException arrayStoreError) {
                            errorCounter++;
                            System.out.println("\nERROR 5 for ArrayStoreException:");
                            System.out.println("cannot store integer to a String array.");
                            System.out.println(arrayStoreError);

                            try {

                                // you cannot divide a number by 0
                                System.out.println(13 / 0);

                            }catch(ArithmeticException mathError) {
                                errorCounter++;
                                System.out.println("\nERROR 6 for ArithmeticException:");
                                System.out.println("cannot divide a number to zero.");
                                System.out.println(mathError);

                                try {
                                    String value = null;
                                    // you are trying a get the length of a variable which is null?
                                    System.out.println(value.length());

                                }catch(NullPointerException nullError) {
                                    errorCounter++;
                                    System.out.println("\nERROR 7 for NullPointerException:");
                                    System.out.println("you tried to get the length of a null variable.");
                                    System.out.println(nullError);

                                    try {

                                        boolean uwu = false;

                                        if(!uwu || uwu == false) {
                                            errorCounter++;
                                            // a custom exception I made :D
                                            throw new SampleException("Not UwU");
                                        }

                                    }catch(SampleException sampleError) {
                                        System.out.println("\nERROR 8: Custom Exception only.");
                                        System.out.println(sampleError.getMessage());

                                        try {

                                            if(1 + 1 == 2) {
                                                throw new MinecraftException();
                                            }

                                        }catch(MinecraftException mcError) {
                                            errorCounter++;
                                            System.out.println("\nERROR 9: Another Custom Exception.");
                                            System.out.println(mcError.getMessage());
                                        }
                                    }
                                }
                                finally {

                                    System.out.println("\nAll errors successfully catched!");
                                }
                            }
                        }
                    }
                }

            }
        }

       

        System.out.println("\nYour total error is: "+errorCounter);

        if(errorCounter == 0) {
            System.out.println("Zero error. Good job!");
        }
        else {
            System.out.println("Total error handled: "+errorCounter);
        }
    }
    
}

// custom exception that I've created (a user-defined exception)
class SampleException extends Exception {

    public SampleException(String error_message) {
        super(error_message);
    }
}
// custom exception that I've created (a user-defined exception)
class MinecraftException extends Exception {

    // I didn't add a parameter this time.
    public MinecraftException() {
        super("Minecraft");
    }
}