import java.util.*;

public class RunAmountDue {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        AmountDue due = new AmountDue();

        boolean valid = true;

        double price, discount;
        int quantity;

        do {

        try {

        System.out.println("Press any of the following then enter values separated by spaces:");
        System.out.println("1 - Price Only\n2 - Price and quantity\n3 - Price, quantity, and discount amount");
        int option = input.nextInt();

        switch (option) {
            case 1:
                price = input.nextDouble();
                System.out.println("Amount due is: "+ due.computeAmountDue(price));
                input.nextLine();
                break;
            case 2:
                price = input.nextDouble();
                quantity = input.nextInt();
                System.out.println("Amount due is: "+due.computeAmountDue(price, quantity));
                input.nextLine();
                break;
            
            case 3:
                price = input.nextDouble();
                quantity = input.nextInt();
                discount = input.nextDouble();
                System.out.println("Amount due is: "+due.computeAmountDue(price, quantity, discount));
                input.nextLine();
                break;
            default:
            System.out.println("Invalid input.");
            System.out.println("Program stopped.");
            valid = false;
            input.close();
            break;
        }

        } catch(Exception e) {
            System.out.println("Invalid input.");
            System.out.println("Program stopped.");
            valid = false;
        }
    }while(valid == true);
    }

    
}
class AmountDue {

    public final static double tax = 0.12;

    public double computeAmountDue(double price) {

        return (price * tax) + price;

    }

    public double computeAmountDue(double price, int quantity) {

        return (price * quantity) + price * tax;

    }
    public double computeAmountDue(double price, int quantity, double discount) {

        return (price * quantity - discount) + price * tax;

    }

}
