import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    private static final String WORDS_FILE = "words.txt";
    private static final int MAX_TRIES = 6;

    private List<String> words;
    private String secretWord;
    private StringBuilder guessedWord;
    private int triesLeft;

    public Hangman() {
        words = new ArrayList<>();
        loadWordsFromFile();
    }

    private void loadWordsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(WORDS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String word = line.trim(); // Remove leading and trailing whitespace
                if (!word.isEmpty()) { // Skip empty lines
                    words.add(word);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading words file: " + e.getMessage());
        }
    }

    public void startGame() {
        Random random = new Random();
        secretWord = words.get(random.nextInt(words.size()));
        guessedWord = new StringBuilder("_".repeat(secretWord.length()));
        triesLeft = MAX_TRIES;

        Scanner scanner = new Scanner(System.in);
        while (triesLeft > 0) {
            System.out.println("Current word: " + guessedWord);
            System.out.println("Tries left: " + triesLeft);
            System.out.print("Enter a letter: ");
            String input = scanner.nextLine().toLowerCase();
            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Please enter a single letter.");
                continue;
            }
            char letter = input.charAt(0);
            if (updateGuessedWord(letter)) {
                System.out.println("Correct!");
                if (secretWord.equals(guessedWord.toString())) {
                    System.out.println("Congratulations! You've guessed the word: " + secretWord);
                    return;
                }
            } else {
                System.out.println("Incorrect!");
                triesLeft--;
            }
        }
        System.out.println("Out of tries! The word was: " + secretWord);
    }

    private boolean updateGuessedWord(char letter) {
        boolean correctGuess = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == letter) {
                guessedWord.setCharAt(i, letter);
                correctGuess = true;
            }
        }
        return correctGuess;
    }

    public static void main(String[] args) {
        Hangman hangmanGame = new Hangman();
        System.out.println("--- Hangman ---\nPlease enter only lowercase letters to avoid losing tries.");
        hangmanGame.startGame();
    }
}
