import java.util.Scanner;

public class EnumsReviewer {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Get grade level from user input
        GradeLevel gradeLevel = getGradeLevel();
        // Get course from user input
        Course course = getCourse();
        // Get section from user input
        String section = getSection();
        
        // Create a new Student object with the entered grade level, course, and section
        Student student = new Student(gradeLevel, course, section);
    }

    // Method to get grade level from user input
    private static GradeLevel getGradeLevel() {
        GradeLevel gradeLevel;
        do {
            // Prompt user to choose grade level
            System.out.println("Choose your grade level:");
            // Display available grade levels
            for (GradeLevel level : GradeLevel.values()) {
                System.out.println(level);
            }
            // Get user input and convert to uppercase
            System.out.print("Your input here: ");
            String input = scanner.nextLine().toUpperCase();
            try {
                // Convert input to GradeLevel enum value
                gradeLevel = GradeLevel.valueOf(input);
                // Break out of loop if input is valid
                break;
            } catch (IllegalArgumentException e) {
                // If input is not valid, prompt user to enter a valid grade level
                System.out.println("Not a valid grade level.");
            }
        } while (true);
        return gradeLevel;
    }

    // Method to get course from user input
    private static Course getCourse() {
        Course course;
        do {
            // Prompt user to choose course
            System.out.println("Choose your course:");
            // Display available courses
            for (Course c : Course.values()) {
                System.out.println(c);
            }
            // Get user input and convert to uppercase
            System.out.print("Your input here: ");
            String input = scanner.nextLine().toUpperCase();
            try {
                // Convert input to Course enum value
                course = Course.valueOf(input);
                // Break out of loop if input is valid
                break;
            } catch (IllegalArgumentException e) {
                // If input is not valid, prompt user to enter a valid course
                System.out.println("Not a valid course.");
            }
        } while (true);
        return course;
    }

    // Method to get section from user input
    private static String getSection() {
        String section;
        do {
            // Prompt user to enter section
            System.out.print("Enter your section: ");
            // Get user input for section
            System.out.print("Your input here: ");
            section = scanner.nextLine();
        } while (section.equals("")); // Continue loop until section is not empty
        return section;
    }
}

// Enum representing different grade levels
enum GradeLevel {
    FRESHMEN, SOPHOMORE, JUNIOR, SENIOR
}

// Enum representing different courses
enum Course {
    BSIT, BSCS, BSCpE
}

// Class representing a student
class Student {
    private GradeLevel level; // Grade level of the student
    private Course course; // Course of the student
    private String section; // Section of the student

    // Constructor to initialize a student object
    public Student(GradeLevel level, Course course, String section) {
        this.level = level;
        this.course = course;
        this.section = section;
        // Print confirmation message with student details
        System.out.println("Student created with level: " + level + ", course: " + course + ", section: " + section);
    }
}
