import java.util.*;

public class FruitBasket {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit;
        Stack<String>  basket = new Stack<>();

       
        try {
        System.out.println("Catch and eat any of this fruit: ('apple', 'mango', 'guava')");
        System.out.print("How many fruits would you like to catch? ");
        int count = input.nextInt();

        if(count == 0) {
            System.out.println("You do not want to catch any fruits.");
        }else {
            input.nextLine();
            System.out.println("Choose a fruit to catch. Press A, O, M, or G.");
            for(int i = 0; i < count; i++) {
                System.out.print("Fruit " + (i + 1) + " of " + count +": ");
                fruit = input.nextLine().toUpperCase();

                switch(fruit) {
                    case "A":
                    basket.push("apple");
                    break;

                    case "O":
                    basket.push("orange");
                    break;

                    case "M":
                    basket.push("mango");
                    break;

                    case "G":
                    basket.push("guava");
                    break;
                    default:
                    System.out.println("You didn't catch anything.");
                }
             
            }
            System.out.println("Your basket now has: " + basket);

            while(!basket.isEmpty()) {
            System.out.print("Press E to eat: ");
            String action = input.nextLine().toUpperCase();
            if(action.equals("E")) {
                basket.pop();
                if(basket.isEmpty()) {
                    System.out.println("No more fruits.");
                }else {
                    System.out.println("Fruit(s) in the basket: " + basket);
                }
            }

        }
        }
        }
        catch(Exception e) {
            System.out.println("Not a number.");
            input.nextLine();
        }
    }
}
