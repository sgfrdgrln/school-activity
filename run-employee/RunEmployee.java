// Instruction

// 1. Create four (4) Java classes. Name them: RunEmployee, Employee,
// FullTimeEmployee, PartTimeEmployee. The RunEmployee shall contain the main method
// and will be used to execute the program.

// 2. Write a simple payroll program that will display employee's information.
// Refer to UML Class Diagram for the names of the variable and method. This should
// be the sequence of the program upon execution:

// a. Ask the user to input the name of the employee

// b. Prompt the user to select between full time and part time by pressing
// either F (full time) or P (part time).

// c. If F is pressed, ask the user to type his monthly salary. Then, display his 
// name and monthly salary.

// If P is pressed, ask the user to type his rate (pay) per hour and the number of
// hours he worked for the entire month seperated by a space. Then, display name
// and wage.

// Note: You can add variables and methods if needed. Just make sure that all the 
// variables and methods given in the diagram are properly used.

// Employee class should contain a String name, a getter and setter method setName(): void, getName(): String
// FullTimeEmployee class should contain double monthlySalary, a getter and setter method
// setMonthlySalary(): void, getMonthlySalary(): double
// PartTimeEmployee class should contain double ratePerHour, int hoursWorked, double wage, a getter and setter
// method setWage(): void, getWage() : double

import java.util.*; // for all util package

public class RunEmployee {

    public static void main(String[] args) {
         
       Employee e = new Employee(); // OBJECT
       PartTimeEmployee p = new PartTimeEmployee(); // OBJECT
       FullTimeEmployee f = new FullTimeEmployee(); // OBJECT


       e.employeeInfo(); // first step and second step done
       
       // condition

       if(e.typeOfWorker.equalsIgnoreCase("P")) {

        System.out.println("part time");

        p.partTimeInfo();

        System.out.println("Employee name: "+e.name);
        System.out.print("Wage: ");
        System.out.printf("%.2f",p.getWage());

       }
       else if(e.typeOfWorker.equalsIgnoreCase("F")) {

        System.out.println("full time\n");

        f.fullTimeInfo();

        System.out.println("Employee name: "+e.name); 
        System.out.print("Monthly Salary: ");
        System.out.printf("%.2f", f.getMonthlySalary());
        

       }


    }


}
class Employee { // Superclass 

 Scanner scanner = new Scanner(System.in);

 String name;

 String typeOfWorker; // u can also use char
 
 // Setter

 public void setName(String employeeName) {

   this.name = employeeName;

 }
 
 // Getter

   public String getName() {

   return name;

   }
   
   public void employeeInfo() {

    System.out.print("Enter your name: ");
    name = scanner.nextLine();
    System.out.print("Press P if part-time, F if full-time: ");
    typeOfWorker = scanner.nextLine();

   }


}
class PartTimeEmployee extends Employee { // Subclass

    double ratePerHour, wage;
    int hoursWorked;

    // Setter

    public void setWage(double rate, int hours) {

     this.ratePerHour = rate;
     this.hoursWorked = hours;
     
    }
 
    // Getter

     public double getWage() {

      wage = ratePerHour * hoursWorked; // MULTIPLY 

      return wage; // return the final value

     }

     public void partTimeInfo() {

        System.out.print("Enter your rate and enter how many hours you've worked: ");
        ratePerHour = scanner.nextDouble(); // USER INPUT 
        hoursWorked = scanner.nextInt(); // USER INPUT
         
        setWage(ratePerHour, hoursWorked); // STORE OR SET THE DATA
      
      
      }


}
class FullTimeEmployee extends Employee { // Subclass

double monthlySalary;

// Getter 

public double getMonthlySalary() {

 return monthlySalary;
}

// Setter 

public void setMonthlySalary(double ms) {

    this.monthlySalary = ms;

}
public void fullTimeInfo() {

  System.out.print("Enter your monthly salary: ");
  monthlySalary = scanner.nextDouble(); // USER INPUT
 
  setMonthlySalary(monthlySalary); // STORE OR SET THE DATA


}


}