import java.util.*;

public class NestedClassReviewer {

    // pre-final

    class InnerClass {

        void display() {

            System.out.println("Hello, this is an inner class.");
        }

    }
    static class StaticClass {
        void display() {
            System.out.println("Hello, this is a static class");
        }
    }
    


    public static void main(String[] args) {

        NestedClassReviewer outerObject = new NestedClassReviewer();
        NestedClassReviewer.InnerClass innerObject = outerObject.new InnerClass();

        innerObject.display();

        NestedClassReviewer.StaticClass staticObject = new NestedClassReviewer.StaticClass();

        
    }

}
