import java.util.*;
class TriPrism<T extends Number> {
    private T length;
    private T base;
    private T height;

    // Getters
    public T getLength() {
        return length;
    }

    public T getBase() {
        return base;
    }

    public T getHeight() {
        return height;
    }

    // Setters
    public void setLength(T length) {
        this.length = length;
    }

    public void setBase(T base) {
        this.base = base;
    }

    public void setHeight(T height) {
        this.height = height;
    }

   
    public double calculateVolume() {
        return length.doubleValue() * (0.5 * base.doubleValue() * height.doubleValue());
    }
}
public class TriPrismDemo {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        boolean validator = false;
       
        TriPrism<Integer> tp1 = new TriPrism<>();
        TriPrism<Double> tp2 = new TriPrism<>();
        
        
        
      
        do {
            
            try {
        System.out.println("\nTriPrism 1\n");
        System.out.print("Set length: ");
        tp1.setLength(scan.nextInt());
        System.out.print("Set base: ");
        tp1.setBase(scan.nextInt());
         System.out.print("Set height: ");
        tp1.setHeight(scan.nextInt());
        
        validator = true;
                
            }catch(InputMismatchException e) {
                scan.nextLine();
                System.out.println("Error. I need an integer.");
            }
            
        }while (validator == false); 
        
        validator = false;
        
       do {
            
            try {
                System.out.println("\nTriPrism 2\n");
        System.out.print("Set length: ");
        tp2.setLength(scan.nextDouble());
        System.out.print("Set base: ");
        tp2.setBase(scan.nextDouble());
         System.out.print("Set height: ");
        tp2.setHeight(scan.nextDouble());
        
        validator = true;
                
            }catch(InputMismatchException e) {
                scan.nextLine();
                System.out.println("Error. I need a double.");
            }
            
        }while (validator == false); 

       
        System.out.println("Volume of TriPrism 1: " + tp1.calculateVolume());
        System.out.println("Volume of TriPrism 2: " + tp2.calculateVolume());
    }
}