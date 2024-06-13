
// Overloading occurs when multiple methods have the same name within the same class.

public class ObjectsAndMethods {

    static String globalName = "Global"; // a static variable

    public static void main(String[] args) {

        // The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
        Person person = new Person("Bob", 18);

        Person person2 = new Person("Alice", 20);

        // We print the data that we set from the constructor object
        System.out.println("Person Name: "+person.name);
        System.out.println("Person Age: "+person.age);

        // We print the second data that we set
        System.out.println("Person 2 Name: "+person2.name);
        System.out.println("Person 2 Age: "+person2.age);

        System.out.println("Name: "+ globalName);

        // now we use the pre-defined Math class

        int a = Math.max(5, 10); // The Math.max(x,y) method can be used to find the highest value of x and y.
        int b = Math.min(5, 10); // The Math.max(x,y) method can be used to find the lowest value of x and y.
        double c = Math.sqrt(64); // The Math.sqrt(x) method returns the square root of x:
        double d = Math.abs(-15.3); // The Math.abs(x) method returns the absolute (positive) value of x:
        int random = (int) (Math.random() * 101); // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
    
        System.out.println("Max num: "+a);
        System.out.println("Min num: "+b);
        System.out.println("Square Root num: "+c);
        System.out.println("Absolute num: "+d);
        System.out.println("Random num: "+random);
        System.out.println("Power num: "+Math.pow(2.0, 3.0)); // The Math. pow() method returns the value of x to the power of y (x^y).
        System.out.println("Round num: "+Math.round(10.5)); // Math.round(x) rounds the number. 5-9 round up 1-4 round down (10.0)
        System.out.println("Ceil num: "+Math.ceil(10.2)); // Math.ceil(x) rounds the number up.
        System.out.println("Floor num: "+Math.floor(10.2)); // Math.floor(x) rounds the number down (default 10.0).

    }
    
}

class Person {

    String name;
    int age;

    // A constructor is a special method that is used to initialize objects. 
    // This constructor has a parameter in it, you can also create one without a parameter.
    public Person(String name, int age) {

        this.name = name;
        this.age = age;

    }

}
