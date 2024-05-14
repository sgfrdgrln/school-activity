package enums;


public class CarDemo
{
    
	public static void main(String[] args) {
	    
	    Car car1 = new Car(2022, Model.SUV, Color.RED, 2000000);
	    Car car2 = new Car(2020, Model.SEDAN, Color.BLUE, 1500000);
	    
	    System.out.println("Car 1\n");
	    
	    car1.display();
	    System.out.println("Car 2\n");
	    car2.display();
		
	}
}
class Car {
    
    private int year;
    private Model model;
    private Color color;
    private double price;
    
    
    public Car(int yr, Model model, Color color, double price) {
        
        this.year = yr;
        this.model = model;
        this.color = color;
        this.price = price;
        
    }
    
    public void display() {
        
        System.out.println("Year: "+year);
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.print("Price:");
        System.out.print(" $");
        System.out.printf("%.2f", price);
        System.out.println("\n");
        
    }
    
    
}

enum Color {
    RED, WHITE, ORANGE, YELLOW, BLUE, GREEN
}
enum Model {
     SUV, SEDAN, CONVERTIBLE, HATCHBACK
}