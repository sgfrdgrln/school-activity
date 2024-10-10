import java.util.Scanner;

public class StudentDemo {

    public static void main(String[] args) {
        Student myStudent = new Student();

        myStudent = getStudentInfo();
        displayStudent(myStudent);
    }
    public static Student getStudentInfo() {
        Student tempStudent = new Student();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter student number >> ");
        tempStudent.setStudentNum(input.next());
        System.out.print("Enter student's last name: ");
        tempStudent.setLastName(input.next());
        System.out.print("Enter student's first name: ");
        tempStudent.setFirstName(input.next());
        return tempStudent;
    }
    public static void displayStudent(Student aStudent) {
        System.out.println("\nStudent # " +aStudent.getStudentNum() + " belongs to "+aStudent.getFirstName() + " " + aStudent.getLastName());
    }
   
    
}
class Student {

    private String studentNum;
    private String lastName;
    private String firstName; 

    public void setStudentNum(String num) {
        studentNum = num;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setLastName(String name) {
        lastName = name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String name) {
        firstName = name;
    }

}
