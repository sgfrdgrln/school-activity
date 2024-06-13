// a package is a collection of related classes and interfaces that have been grouped together into a folder.

import java.util.Scanner; // this is how you import a scanner package

public class OOPConcept {

    String name;
    int age;
   

    public static void main(String[] args) {

        // The actions that an object can take are called behaviors.
        // Each behavior is defined by a piece of Java code called a method.

        Scanner scanner = new Scanner(System.in); // This is how you create a scanner object
        SampleClass sampleClass = new SampleClass(); // This is how you create a class object
        OOPConcept oopConcept = new OOPConcept(); // we create a class object to call the non-static method that we created.

        sampleClass.sampleMethod(); // This is how you call a method from another class.

        oopConcept.sampleMethod(); // We want to call the method that we created inside this OOPConcept class

        sampleStaticMethod(); // we can call static methods without using the any object.

        // an object can have attributes or characteristics.

        oopConcept.name = "Bob"; 
        oopConcept.age = 18;

        System.out.println("Name: "+oopConcept.name); 
        System.out.println("Age: "+oopConcept.age); 

        
    }
    public void sampleMethod() {
        System.out.println("This is a sample method from OOPConcept Class.");
    }
    public static void sampleStaticMethod() {
        System.err.println("This is a static method, no need to create a class object to call me.");
    }

}
class SampleClass {

  // this is a simple class that I create with a method in it.

    public void sampleMethod() {

        System.out.println("This is a sample method.");

    }

}