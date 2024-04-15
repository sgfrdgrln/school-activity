import java.io.*;
import java.util.*;

public class Authentication {

    static boolean timerRunning = false; // for my startTimer function
    static boolean validator = true; // for log out function purposes to stop the loop entirely for stop the program.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
       

      
      
        

        while(validator) {

            while (timerRunning) {
                sc.nextLine();
                if(timerRunning) {
                    System.out.println("You have to wait for the timer to run out to Login/Register again.");
                }
               
            }

        
            try {
                
                do {
                    System.out.print("User Authentication\n1. Login\n2. Register\n3. Stop Program\nEnter a number: ");
                    input = sc.nextInt();
                } while (input <= 0 || input > 3);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number only.");
                sc.nextLine(); 
                continue;
            }
        switch (input) {
            case 1:
                userLogin();
                break;
            
            case 2:
                userRegister();
                break;
            
            case 3:
                validator = false;
                System.out.println("Program stopped.");
                break;
        }
    }
    }
    private static void userRegister() {
        try {
            FileWriter fileWriter = new FileWriter("records.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            Scanner scanner = new Scanner(System.in);

            String username;
            String password;
            boolean validUsername = false;
            boolean validPassword = false;
            do {
                System.out.print("Enter username: ");
                username = scanner.nextLine();

                if (!username.matches("[a-zA-Z0-9]+")) {
                    System.out.println("Invalid username. Only alphanumeric characters are allowed.");
                } else {
               
                    FileReader fileReader = new FileReader("records.txt");
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String line;
                    boolean usernameExists = false;
                    while ((line = bufferedReader.readLine()) != null) {
                        String[] parts = line.split(":");
                        if (parts.length > 0 && parts[0].equals(username)) {
                            usernameExists = true;
                            break;
                        }
                    }
                    bufferedReader.close();
                    if (usernameExists) {
                        System.out.println("Username already exists. Please choose another.");
                    } else {
                        validUsername = true;
                    }
                }
            } while (!validUsername);

            do {
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            if (!password.matches("[a-zA-Z0-9]+")) {
                System.out.println("Invalid password. Only alphanumeric characters are allowed.");
            }
            else {
                validPassword = true;
            }
            }while(!validPassword);
            printWriter.println(username + ":" + password);
            System.out.println("User registered successfully.");

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void userLogin() {
        try {
            boolean validUserCredentials = false;
            int attempts = 3;
            File file = new File("records.txt");
            if (!file.exists()) {
                file.createNewFile(); // Create a records.txt if it doesn't exist yet.
            }
            Scanner scanner = new Scanner(System.in);
    
            do {
                FileReader fileReader = new FileReader("records.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
    
           
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
    
                String line;
                boolean userFound = false;
    
                // Validate credentials
                while ((line = bufferedReader.readLine()) != null) {
                    String[] parts = line.split(":");
                    if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                        userFound = true;
                        break;
                    }
                }
    
                bufferedReader.close(); // Close the BufferedReader
    
                if (userFound) {
                    System.out.println("Successfully logged in.");
                    validUserCredentials = true;
                    userLogout(username);
                } else {
                    attempts--;
                    System.out.println("Incorrect username or password.");
                }
                
                if(attempts == 0) {
                    System.out.println("Too many attempts, please try again later.");
                    startTimer();
                    timerRunning = true;
                    break;
                }
            } while (!validUserCredentials);
    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void startTimer() {
       
        Thread timerThread = new Thread(() -> {
           
            int timeRemaining = 20;
            while (timeRemaining > 0) {
                
                try {
                   
                    Thread.sleep(1000);
                    timeRemaining--;

                    if(timeRemaining == 10) {
                        System.out.println("Please wait 10 more seconds...");
                    }

                    
                }
                catch(InterruptedException e) {
                    System.out.println("Error");  
                }
            }
           System.out.println("Times up! You may Login/Register again. By pressing ENTER");
           timerRunning = false;
        });
        timerThread.start();
    }
    private static void userLogout(String username) {
       
        boolean checker = true;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome, "+username);

        do {

            try {
                do {
                System.out.print("1. Log out\n2. Stop the Program\nEnter a number: ");
                choice = sc.nextInt();
                }while(choice <= 0 || choice > 2);

                switch (choice) {
                    case 1:
                    System.out.println(username + " has been logged out.\n");
                    checker = false;
                    break;
                
                    case 2:
                    System.out.println("\nProgram stopped.");
                    checker = false; 
                    validator = false; // global variable
                    break;
                    case 3:
                    System.out.println("Invalid input. Please enter 1 or 2 only.");
                    break;
                }
                
                
            }
            catch(InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine();
            }



        }while(checker);

        

        
    }
}
