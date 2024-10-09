import java.util.*;

// this program is mainly used for my data structure and algorithm activity, no copyright infrigmement intended :))

public class Jollibee {

    static String[] menu = {
        "Chickenjoy", 
        "Jolly Spaghetti", 
        "Coke Float", 
        "Jolly Fries", 
        "Jollibee Burger Steak", 
        "Peach Mango Pie",
        "Jollibee Sundae",
        "Jolly Palabok",
        "Jolly Chicken Sandwich"};
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean isValid = false;
        

        Queue<String> order = new LinkedList<String>();
        String choice;

        int option, orderNo;
        do {
            System.out.println("--- Welcome to Jollibee Order Processing System ---");
            System.out.println("Current Orders: " + order);
            System.out.println("1. Add Order\n2. Process Order\n3. Exit Program.");
            System.out.print("Choose from (1-3): ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    displayMenu();
                   
                    System.out.print("Please enter the number to add your order (1-9): ");
                    orderNo = input.nextInt();
                    
                    System.out.println(menu[orderNo - 1] + " has been successfully added to your order.");
                    order.offer(menu[orderNo - 1]);

                    input.nextLine();
                    while(true) {
                    System.out.print("Do you want to add another order? Y or N ");
                    choice =  input.nextLine();
                        if(choice.equalsIgnoreCase("Y")) {

                            System.out.print("Please enter the number to add your order (1-9): ");
                            orderNo = input.nextInt();
                            
                            System.out.println(menu[orderNo - 1] + " has been successfully added to your order.");
                            order.offer(menu[orderNo - 1]);
                            input.nextLine();
                            
                        }else if(choice.equalsIgnoreCase("N")){
                            System.out.println("Thank you for ordering!");
                            break;
                        }else {
                            System.out.println("Wrong input.");
                            
                        }
                    }
                    
                    break;
                case 2:

                    if(order.isEmpty()) {
                        System.out.println("No available order to process.");
                    }else {
                    System.out.println("Order Queue: " + order);

                    System.out.print("Do you want to process the first order? Y or N ");
                    choice = input.nextLine();
                    
                    if(choice.equalsIgnoreCase("Y")) {

                        System.out.println(order.poll() + " has been successfully processed.");

                        if(order.isEmpty()) {
                            System.out.println("There are no more orders that needs to be processed.");
                            break;
                        }else {
                            System.out.println("Order Queue: " + order);
                        }
                        while(true) {
                            System.out.print("Process another order? Y or N ");
                            choice = input.nextLine();
                            if(choice.equalsIgnoreCase("Y")) {
                                System.out.println(order.poll() + " has been successfully processed.");
                                if(order.isEmpty()) {
                                    System.out.println("There are no more orders that needs to be processed.");
                                    break;
                                }else {
                                    System.out.println("Order Queue: " + order);
                                }
                               
                            }else if(choice.equalsIgnoreCase("N")) {
                                System.out.println("No? Okay. Have a great day!");
                                break;
                            }else {
                                System.out.println("Wrong input.");
                            }
                        }
                        
                    }else if(choice.equalsIgnoreCase("N")) {
                        System.out.println("No? Okay. Have a great day!");
                    }
                    else {
                        System.out.println("Sorry, wrong input!");
                    }
                }
                    break;


                case 3:
                    System.out.println("Program stopped.");
                    isValid = true;
                    break;
            
                default:
                    break;
            }


        }while(!isValid);

    }
    public static void displayMenu() {
        System.out.println("Jollibee Menu: ");
        for(int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);    
        }
    }
}
