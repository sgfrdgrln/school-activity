
// Interface uses the "implements" keyword

public class InterfaceAndAbstraction {

    public static void main(String[] args) {

        Cat cat = new Cat(); // we create an object (Cat)
        Student student = new Student(); // we create an object (Student)

        cat.animalSound(); // we call the method of the class Cat
        student.sayHello(); // we call the regular method of the class Student
        student.greet(); // we call the abstract method

        
        
    }
    
}

// what we put inside an interface are methods 

interface Animal {

    public void animalSound();

}

// we use the "implements" keyword if we want to use an interface\
// an interface is used to specify methods that a class must implements.
// it contains headings for a number of public methods.
// you can use multiple interfaces in one class. ex: (class Minecraft implements Games, Toys {}).

class Cat implements Animal {

    @Override
    public void animalSound() {
        System.out.println("Meow meow!");
    }
    
}

// an abstract class serves as a base for subclasses.
// abstract class cannot be instantiated but can be subclassed.
abstract class Person {
    // abstract method does not have a body.
    public abstract void greet();
    // regular method.
    public void sayHello() {
        System.out.println("Hello.");
    }
}

class Student extends Person {

    @Override
    public void greet() {
        
        System.out.println("Good morning.");
    }
    
}
