import java.util.*; // importing all the util package


// Inheritance uses the "extends" keyword


public class InheritanceAndPolymorphism {

    public static void main(String[] args) {

        Student student = new Student(); // we create a class object (Student)

        // Dynamic binding allows many meanings to be associated to one method name.

        Person[] people = new Person[2]; // Person array object

        people[0] = new Student(); // a Student object
        people[1] = new Teacher(); // a Teacher object

        for(Person p : people) {

            p.introduceYourself(); 

        }


        // Polymorphism is the ability of an object to take on many form
        // Here is an example:
        Animal animal = new Cat(); // we create a Cat object
        Animal animal2 = new Dog(); // we create a Dog object

        student.introduceYourself(); // we call the method stored in our student object

        animal.animalSound(); // we are calling the method stored in the Cat class!
        animal2.animalSound(); // we are calling the method stored in the Dog class!

        
    }
    
}

// Inheritance enables the use of existing class to define a new class.

// overriding occurs when a subclass (child class) has the same method as the parent class.

// class Person is our base class/super class/parent class

class Person {

    String name = "Jean";
    int age = 18;

    public void introduceYourself() {
        System.out.println("My name is "+name);
    }

}
// class Student is a subclass/derived class/child class
class Student extends Person{

    Person person = new Person(); // we create a class object (Person)

    String name = person.name; // we initialize our name by getting the existing data of class Person
    int age = person.age; // we initialize our age by getting the existing data of class Person


    public void introduceYourself() {

        System.out.println("Hi, my name is "+name);
        System.out.println("I'm "+age+ " years old.");

    }


}
// class Teacher is a subclass/derived class/child class
class Teacher extends Person {

    public void introduceYourself() {
        System.out.println("My name is Max.");
        System.out.println("I am a math teacher.");
    }

}

// class Animal is our base class/super class/parent class

class Animal {

    String name = "Animal";

    public void animalSound() {

        System.out.println("Zzz");

    }

}

// class Cat is a subclass/derived class/child class

class Cat extends Animal {


   
    public void animalSound() {
        System.out.println("Meow meow!");
    }

}

// class Dog is a subclass/derived class/child class

class Dog extends Animal {

    public void animalSound() {
        System.out.println("Woof woof!");
    }

}
