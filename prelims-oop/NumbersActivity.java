import java.util.*;

public class NumbersActivity {
    
    public static void plusFive(double num1, double num2) {
        
        num1 = num1 + 5;
        num2 = num2 + 5;
        
        System.out.println(num1 + " and " + num2);
        
    }
     public static void timesTwo(double num1, double num2) {
        
        num1 = num1 * 2;
        num2 = num2 * 2;
        
        System.out.println(num1 + " and " + num2);
        
    }
    
     public static void showSquared(double num1, double num2) {
        
        num1 = num1 * num1;
        num2 = num2 * num2;
        
        System.out.println(num1 + " and " + num2);
        
    }
     public static void computePercent(double num1, double num2) {
        
        double percentage = (num1 / num2) * 100;
        
        System.out.printf("%.1f is %.0f percent of %.1f", num1, percentage, num2);
        
    }
    
    
	public static void main(String[] args) {
	    
	    
	    Scanner input = new Scanner(System.in);
	    
	    boolean valid = false;
	    
	    double num1, num2;
	    
	    do {
	        
	        try {
	            
	        System.out.println("Enter two numbers");
	        System.out.print("First Number: ");
	        num1 = input.nextDouble();
	        System.out.print("Second Number: ");
	        num2 = input.nextDouble();
	        
	        plusFive(num1, num2);
	        timesTwo(num1, num2);
	        showSquared(num1, num2);
	        computePercent(num1, num2);
	        break;
	            
	        }catch(Exception e) {
	            System.out.println("That's not a number?!? Try again.");
	            input.nextLine();
	        }
	        
	    }while(valid == false);
	    
	    
		
	}
}