import java.util.*;
public class RecursionSample {
        
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, n1, n2;

        System.out.println("Choose types of recursion: \n1. Linear Recursion\n2. Tail Recursion\n3. Binary Recursion\n4. Mutual Recursion");
        System.out.print("Enter a number: ");
        int option = input.nextInt();

        switch (option) {
            case 1:

            System.out.println("AN EXAMPLE OF A LINEAR RECURSION IS FINDING THE FACTORIAL: ");

            System.out.print("Enter a number to compute the factorial: ");
            num = input.nextInt();

            System.out.println("The factorial of " + num + " is " + factorial(num) + ".");

                break;
            case 2:

            System.out.println("AN EXAMPLE OF TAIL RECURSION IS FINDING THE GREATEST COMMON DIVISOR: ");
            System.out.print("Enter first number: ");
            n1 = input.nextInt();
            System.out.print("Enter second number: ");
            n2 = input.nextInt();
    
            System.out.println("The GCD of "+n1 + " and " + n2 + " is "+ find_gcd(n1, n2) + ".");
            
                break;

            case 3:

            System.out.println("AN EXAMPLE OF BINARY RECURSION IS FIBONACCI SEQUENCE: ");

            System.out.print("Enter a number higher than 0: ");
            num = input.nextInt();
            for(int i = 0; i < num; i++){
                System.out.println(fib(i));
            }

            break;

            case 4:

            System.out.println("AN EXAMPLE OF A MUTUAL RECURSION IS ODD OR EVEN: ");

            System.out.print("Enter a number: ");
            num = input.nextInt();

            if(is_even(num)) {
            System.out.println(num + " is an even number.");
            }else {
            System.out.println(num + " is an odd number.");
            }

                break;
            default:
            System.out.println("Program stopped.");
                break;
        }

        
    }
    public static boolean is_even(int num) {
        if(num == 0) {
            return true;
        }
        return is_odd(num - 1);
    }
    public static boolean is_odd(int num) {
        if(num == 0) {
            return false;
        }
        else {
            return is_even(num - 1);
        }
    }
    public static int find_gcd(int n1, int n2) {
        if(n1 % n2 == 0) {
            return n2;
        }
        return find_gcd(n2, n1 % n2);
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int fib(int num) {
        if (num <= 1) {
            return num;
        }
        return fib(num - 1)  + fib(num - 2);

    }

}
