package midterm;
import java.util.*;

public class CollegeList {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Student s = new Student();
        Faculty f = new Faculty();

        boolean isFinished = false;

        String choice;
        while(!isFinished) {
        try {
        
            do {
        System.out.print("\n\t\t*** OPTIONS ***\n\n[E] Employee [S] Student [F] Faculty [X] Exit Program\n\nPlease enter a letter to proceed: ");
        choice = input.nextLine().toUpperCase();
            }while(!choice.equals("E") && !choice.equals("F") && !choice.equals("S") && !choice.equals("X"));

        switch (choice) {
            case "E":
            System.out.println("\n\t\t*** EMPLOYEE INFO ***\n");
                System.out.print("Enter name: ");
                f.setName(input.nextLine());
                System.out.print("Enter contact number: ");
                f.setContactNum(input.nextLine());
                System.out.print("Enter salary: ");
                f.setSalary(input.nextDouble());
                input.nextLine();
                System.out.print("Enter department: ");
                f.setDepartment(input.nextLine());
                System.out.println("\n\t\t*** DISPLAYING STUDENT INFO ***\n");
                System.out.println("Name: " + f.getName() + "\nContact Number: " + f.getContactNum() + "\nSalary: " + f.getSalary() + "\nDepartment: " + f.getDepartment());
                
                break;
            case "S":
            System.out.println("\n\t\t*** STUDENT INFO ***\n");
                System.out.print("Enter name: ");
                s.setName(input.nextLine());
                System.out.print("Enter contact number: ");
                s.setContactNum(input.nextLine());
                System.out.print("Enter program: ");
                s.setProgram(input.nextLine());
                while (true) {
                System.out.print("Enter year level (1-4): ");
                s.setYearLevel(input.nextInt());

                if(s.getYearLevel() < 1 || s.getYearLevel() > 4) {
                    System.out.println("Invalid year level.");
                }else {
                    input.nextLine();
                    System.out.println("\n\t\t*** DISPLAYING STUDENT INFO ***\n");
                    switch (s.getYearLevel()) {
                        case 1:
                        System.out.println("Name: " + s.getName() + "\nContact Number: " + s.getContactNum() + "\nProgram: " + s.getProgram() + "\nYear Level: " + "1st year");
                            break;
                        case 2:
                        System.out.println("Name: " + s.getName() + "\nContact Number: " + s.getContactNum() + "\nProgram: " + s.getProgram() + "\nYear Level: " + "2nd year");
                            break;

                        case 3:
                        System.out.println("Name: " + s.getName() + "\nContact Number: " + s.getContactNum() + "\nProgram: " + s.getProgram() + "\nYear Level: " + "3rd year");
                            break;

                        case 4:
                        System.out.println("Name: " + s.getName() + "\nContact Number: " + s.getContactNum() + "\nProgram: " + s.getProgram() + "\nYear Level: " + "4th year");
                            break;
                    
                        default:
                            break;
                    }

                    
                    break;
                }
                }
                
                
                break;
            case "F":
            System.out.println("\n\t\t*** FACULTY INFO ***\n");
            System.out.print("Enter name: ");
            f.setName(input.nextLine());
            System.out.print("Enter contact number: ");
            f.setContactNum(input.nextLine());
            while(true) {
            System.out.print("Are you regular or not? Y or N ");
            choice = input.nextLine().toUpperCase();
                
            if(choice.equals("Y")) {
                System.out.println("\n\t\t*** DISPLAYING FACULTY INFO ***\n");
                if(f.isRegular()) {
                    System.out.println("Name: " + f.getName() + "\nContact No: " + f.getContactNum() + "\nEmployee Status: Regular");
                }
                break;
            }else if(choice.equals("N")) {
                System.out.println("\n\t\t*** DISPLAYING FACULTY INFO ***\n");
                System.out.println("Name: " + f.getName() + "\nContact No: " + f.getContactNum() + "\nEmployee Status: Part-time");

                break;
            }else {
                System.out.println("Invalid input. Try again.");
            }

            }
                break;
            case "X":
            System.out.println("Program stopped.");
            isFinished = true;
            break;
        
            default:
                break;
        }
    
        
    }catch(Exception e) {
        System.out.println("Wrong input. Try again.");
        input.nextLine();
    }
}
    
    }

}
class Person {
    private String name, contactNum;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String c) {
        contactNum = c;
    }
}
class Student extends Person{
    private String program;
    private int yearLevel;
    public String getProgram() {
        return program;
    }
    public void setProgram(String p) {
        program = p;
    }
    
    public int getYearLevel() {
        return yearLevel;
    }
    public void setYearLevel(int y) {
        yearLevel = y;
    }
}
class Employee extends Person{
    private double salary;
    private String department;
    public double getSalary() {
        return salary;
    }
    public void setSalary(double s) {
        salary = s;
    }
   
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String d) {
        department = d;
    }

    
}
class Faculty extends Employee {
    private boolean status = true;

    public boolean isRegular() {
        return status;
    }
}
