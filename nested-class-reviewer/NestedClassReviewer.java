
/*  In java, you can create a class within another class and store them together; such classes are
 called nested classes */

 // There are four (4) types of nested classes

 // static member class - has accesss to all static methods of the top-level class

//  non-static member class (inner class) - requires an instance; it has access to all data and methods
//  of top-level class

// local class - defined within a method body
// Anonymous class - a special case of local class that has no identifier



public class NestedClassReviewer {

    void greetUser(Greeting greeting) {
            greeting.greet();
    }
    
     // Example of Local Class 
    void sampleMethod() {

        class LocalClass {

            void display() {
                System.out.println("Hello, this is from the local class.");
            }


        }
        LocalClass localClass = new LocalClass();
        localClass.display();
    }
 // Example of Non-static Member Class (Inner Class):
    class InnerClass {

        void display() {

            System.out.println("Hello, this is from the inner class.");

        }

    }
        // Example of Static Member Class: 
    static class StaticClass {

        void display() {
            System.out.println("Hello, this is from the static class.");
        }

    }

    public static void main(String[] args) {

        // Example of Non-static Member Class (Inner Class):

        NestedClassReviewer outerObject = new NestedClassReviewer();
        NestedClassReviewer.InnerClass innerObject = outerObject.new InnerClass();

        innerObject.display();

        // Example of Static Member Class: 

        NestedClassReviewer.StaticClass outerStaticObject = new NestedClassReviewer.StaticClass();

        outerStaticObject.display();

        // Example of Local Class 

        NestedClassReviewer outerObject2 = new NestedClassReviewer();

        outerObject.sampleMethod();

        // Example of Anonymous Class

        // Anonymous class implementing Greeting interface

        NestedClassReviewer outerObject3 = new NestedClassReviewer();

        outerObject3.greetUser(new Greeting() {

            @Override
            public void greet() {
                System.out.println("Hello, user!");
            }

        });

        
    }

    
}

interface Greeting {

    void greet();

}
